package io.vertx.tp.crud.refine;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.atom.KField;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.function.Function;

class IxQuery {

    private static final Annal LOGGER = Annal.get(IxQuery.class);

    static JsonObject inKeys(final JsonArray array, final KModule config) {
        final KField field = config.getField();
        final String keyField = field.getKey();
        /* Filters */
        final JsonObject filters = new JsonObject();
        final JsonArray keys = new JsonArray();
        array.stream().filter(Objects::nonNull).forEach((item) -> {
            if (JsonObject.class == item.getClass()) {
                /* keyValue */
                final String keyValue = ((JsonObject) item).getString(keyField);
                if (Ut.notNil(keyValue)) {
                    keys.add(keyValue);
                }
            } else {
                keys.add(item);
            }
        });
        /* Filters */
        return filters.put(keyField + ",i", keys);
    }

    static Function<UxJooq, Future<JsonObject>> query(
        final JsonObject criteria, final KModule config) {
        final String pojo = config.getPojo();
        return dao -> {
            IxLog.infoDao(LOGGER, "( JqTool ) Dao -> {0}, pojo = {1}", config.getDaoCls(), pojo);
            // Here must put condition here.
            if (Ut.notNil(pojo)) {
                dao.on(pojo);
            }
            return dao.searchAsync(criteria)
                .compose(response -> Ux.future(IxSerialize.serializeP(response, config)));
        };
    }

    static Function<UxJooq, Future<JsonObject>> search(final JsonObject filters, final KModule config) {
        final String pojo = config.getPojo();
        return dao -> {
            IxLog.debugDao(LOGGER, "( Search ) Dao -> {0}, pojo = {1}", dao.getClass(), pojo);

            final JsonObject criteria = new JsonObject();
            criteria.put("criteria", filters);
            // Here must put condition here.
            if (Ut.notNil(pojo)) {
                dao.on(pojo);
            }
            return dao.searchAsync(criteria);
        };
    }

    static Function<UxJooq, Future<Boolean>> existing(final JsonObject criteria, final KModule config) {
        final String pojo = config.getPojo();
        final JsonObject parameters = new JsonObject();
        if (Ut.notNil(pojo)) {
            parameters.mergeIn(Ux.criteria(criteria, pojo));
        } else {
            parameters.mergeIn(criteria);
        }
        return dao -> {
            IxLog.infoDao(LOGGER, "( JqTool ) Dao -> {0}, pojo = {1}", dao.getClass(), pojo);
            // Here must put condition here.
            return dao.existAsync(parameters);
        };
    }

}
