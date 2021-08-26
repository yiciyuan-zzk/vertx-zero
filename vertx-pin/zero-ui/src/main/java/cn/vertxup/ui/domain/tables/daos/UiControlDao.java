/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiControl;
import cn.vertxup.ui.domain.tables.records.UiControlRecord;
import io.github.jklingsporn.vertx.jooq.future.VertxDAO;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiControlDao extends DAOImpl<UiControlRecord, cn.vertxup.ui.domain.tables.pojos.UiControl, String> implements VertxDAO<cn.vertxup.ui.domain.tables.records.UiControlRecord, cn.vertxup.ui.domain.tables.pojos.UiControl, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new UiControlDao without any configuration
     */
    public UiControlDao() {
        super(UiControl.UI_CONTROL, cn.vertxup.ui.domain.tables.pojos.UiControl.class);
    }

    /**
     * Create a new UiControlDao with an attached configuration
     */
    public UiControlDao(Configuration configuration) {
        super(UiControl.UI_CONTROL, cn.vertxup.ui.domain.tables.pojos.UiControl.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ui.domain.tables.pojos.UiControl object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByKey(String... values) {
        return fetch(UiControl.UI_CONTROL.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ui.domain.tables.pojos.UiControl fetchOneByKey(String value) {
        return fetchOne(UiControl.UI_CONTROL.KEY, value);
    }

    /**
     * Fetch records that have <code>SIGN IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchBySign(String... values) {
        return fetch(UiControl.UI_CONTROL.SIGN, values);
    }

    /**
     * Fetch a unique record that has <code>SIGN = value</code>
     */
    public cn.vertxup.ui.domain.tables.pojos.UiControl fetchOneBySign(String value) {
        return fetchOne(UiControl.UI_CONTROL.SIGN, value);
    }

    /**
     * Fetch records that have <code>PAGE_ID IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByPageId(String... values) {
        return fetch(UiControl.UI_CONTROL.PAGE_ID, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByType(String... values) {
        return fetch(UiControl.UI_CONTROL.TYPE, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_NAME IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByContainerName(String... values) {
        return fetch(UiControl.UI_CONTROL.CONTAINER_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByContainerConfig(String... values) {
        return fetch(UiControl.UI_CONTROL.CONTAINER_CONFIG, values);
    }

    /**
     * Fetch records that have <code>ASSIST IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByAssist(String... values) {
        return fetch(UiControl.UI_CONTROL.ASSIST, values);
    }

    /**
     * Fetch records that have <code>GRID IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByGrid(String... values) {
        return fetch(UiControl.UI_CONTROL.GRID, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_NAME IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByComponentName(String... values) {
        return fetch(UiControl.UI_CONTROL.COMPONENT_NAME, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByComponentConfig(String... values) {
        return fetch(UiControl.UI_CONTROL.COMPONENT_CONFIG, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_DATA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByComponentData(String... values) {
        return fetch(UiControl.UI_CONTROL.COMPONENT_DATA, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByActive(Boolean... values) {
        return fetch(UiControl.UI_CONTROL.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchBySigma(String... values) {
        return fetch(UiControl.UI_CONTROL.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByMetadata(String... values) {
        return fetch(UiControl.UI_CONTROL.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByLanguage(String... values) {
        return fetch(UiControl.UI_CONTROL.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(UiControl.UI_CONTROL.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByCreatedBy(String... values) {
        return fetch(UiControl.UI_CONTROL.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(UiControl.UI_CONTROL.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchByUpdatedBy(String... values) {
        return fetch(UiControl.UI_CONTROL.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>SIGN IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchBySignAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.SIGN, values);
    }

    /**
     * Fetch a unique record that has <code>SIGN = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ui.domain.tables.pojos.UiControl> fetchOneBySignAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneBySign(value)), vertx());
    }

    /**
     * Fetch records that have <code>PAGE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByPageIdAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.PAGE_ID, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.TYPE, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByContainerNameAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.CONTAINER_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByContainerConfigAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.CONTAINER_CONFIG, values);
    }

    /**
     * Fetch records that have <code>ASSIST IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByAssistAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.ASSIST, values);
    }

    /**
     * Fetch records that have <code>GRID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByGridAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.GRID, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByComponentNameAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.COMPONENT_NAME, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByComponentConfigAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.COMPONENT_CONFIG, values);
    }

    /**
     * Fetch records that have <code>COMPONENT_DATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByComponentDataAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.COMPONENT_DATA, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(UiControl.UI_CONTROL.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiControl.UI_CONTROL.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiControl.UI_CONTROL.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(UiControl.UI_CONTROL.UPDATED_BY, values);
    }

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
