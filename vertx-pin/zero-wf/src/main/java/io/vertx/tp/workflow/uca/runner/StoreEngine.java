package io.vertx.tp.workflow.uca.runner;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.error._404ProcessMissingException;
import io.vertx.tp.error._501ProcessStartException;
import io.vertx.tp.workflow.init.WfPin;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.unity.Ux;
import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.form.StartFormData;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.StartEvent;

import java.util.Collection;
import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class StoreEngine implements StoreOn {
    @Override
    public Future<JsonObject> processByKey(final String code) {
        final RepositoryService service = WfPin.camundaRepository();
        final ProcessDefinition definition = service.createProcessDefinitionQuery()
            // New Version for each
            .latestVersion().processDefinitionKey(code).singleResult();
        return this.processData(definition, code);
    }

    private Future<JsonObject> processData(final ProcessDefinition definition, final String code) {
        final RepositoryService service = WfPin.camundaRepository();
        if (Objects.isNull(definition)) {
            // Error
            return Ux.thenError(_404ProcessMissingException.class, this.getClass(), code);
        }
        // Content Definition
        final BpmnModelInstance instance = service.getBpmnModelInstance(definition.getId());
        Objects.requireNonNull(instance);
        final String xml = Bpmn.convertToString(instance);
        // Response Json
        final JsonObject workflow = new JsonObject();
        workflow.put(KName.Flow.DEFINITION_ID, definition.getId());
        workflow.put(KName.CODE, definition.getKey());
        workflow.put(KName.Flow.BPMN, xml);
        workflow.put(KName.NAME, definition.getName());
        // Start Event
        final Collection<StartEvent> starts = instance.getModelElementsByType(StartEvent.class);
        if (starts.isEmpty()) {
            return Ux.thenError(_501ProcessStartException.class, this.getClass(), definition.getId());
        }
        if (1 == starts.size()) {
            final StartEvent event = starts.iterator().next();
            workflow.put(KName.Flow.EVENT_START, event.getId());
            workflow.put(KName.Flow.MULTI_START, Boolean.FALSE);
        } else {
            final JsonObject startMap = new JsonObject();
            starts.forEach(start -> startMap.put(start.getId(), start.getName()));
            workflow.put(KName.Flow.EVENT_START, startMap);
            workflow.put(KName.Flow.MULTI_START, Boolean.TRUE);
        }
        return Ux.future(workflow);
    }

    @Override
    public Future<JsonObject> processById(final String definitionId) {
        final RepositoryService service = WfPin.camundaRepository();
        final ProcessDefinition definition = service.getProcessDefinition(definitionId);
        return this.processData(definition, definitionId);
    }

    @Override
    public Future<JsonObject> firstForm(final String definitionId, final boolean isTask) {
        final RepositoryService service = WfPin.camundaRepository();
        final ProcessDefinition definition = service.getProcessDefinition(definitionId);
        if (isTask) {
            // Started
            return null;
        } else {
            // Not Started
            final FormService formService = WfPin.camundaForm();
            final StartFormData startForm = formService.getStartFormData(definitionId);
            Objects.requireNonNull(startForm);
            // substring
            final String formKey = startForm.getFormKey();
            Objects.requireNonNull(formKey);
            final String code = formKey.substring(formKey.lastIndexOf(Strings.COLON) + 1);
            // Build Form Configuration parameters
            final JsonObject response = new JsonObject();
            response.put(KName.CODE, code);
            response.put(KName.Flow.FORM_KEY, formKey);
            response.put(KName.Flow.DEFINITION_KEY, definition.getKey());
            return Ux.future(response);
        }
    }

    @Override
    public Future<Task> firstTask(final String definitionKey) {
        return null;
    }
}
