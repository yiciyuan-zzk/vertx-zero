/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SView;
import cn.vertxup.rbac.domain.tables.records.SViewRecord;
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
public class SViewDao extends DAOImpl<SViewRecord, cn.vertxup.rbac.domain.tables.pojos.SView, String> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.SViewRecord, cn.vertxup.rbac.domain.tables.pojos.SView, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new SViewDao without any configuration
     */
    public SViewDao() {
        super(SView.S_VIEW, cn.vertxup.rbac.domain.tables.pojos.SView.class);
    }

    /**
     * Create a new SViewDao with an attached configuration
     */
    public SViewDao(Configuration configuration) {
        super(SView.S_VIEW, cn.vertxup.rbac.domain.tables.pojos.SView.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.rbac.domain.tables.pojos.SView object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByKey(String... values) {
        return fetch(SView.S_VIEW.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.rbac.domain.tables.pojos.SView fetchOneByKey(String value) {
        return fetchOne(SView.S_VIEW.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByName(String... values) {
        return fetch(SView.S_VIEW.NAME, values);
    }

    /**
     * Fetch records that have <code>OWNER IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByOwner(String... values) {
        return fetch(SView.S_VIEW.OWNER, values);
    }

    /**
     * Fetch records that have <code>OWNER_TYPE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByOwnerType(String... values) {
        return fetch(SView.S_VIEW.OWNER_TYPE, values);
    }

    /**
     * Fetch records that have <code>RESOURCE_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByResourceId(String... values) {
        return fetch(SView.S_VIEW.RESOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>PROJECTION IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByProjection(String... values) {
        return fetch(SView.S_VIEW.PROJECTION, values);
    }

    /**
     * Fetch records that have <code>CRITERIA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByCriteria(String... values) {
        return fetch(SView.S_VIEW.CRITERIA, values);
    }

    /**
     * Fetch records that have <code>ROWS IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByRows(String... values) {
        return fetch(SView.S_VIEW.ROWS, values);
    }

    /**
     * Fetch records that have <code>POSITION IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByPosition(String... values) {
        return fetch(SView.S_VIEW.POSITION, values);
    }

    /**
     * Fetch records that have <code>VISITANT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByVisitant(Boolean... values) {
        return fetch(SView.S_VIEW.VISITANT, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchBySigma(String... values) {
        return fetch(SView.S_VIEW.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByLanguage(String... values) {
        return fetch(SView.S_VIEW.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByActive(Boolean... values) {
        return fetch(SView.S_VIEW.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByMetadata(String... values) {
        return fetch(SView.S_VIEW.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(SView.S_VIEW.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByCreatedBy(String... values) {
        return fetch(SView.S_VIEW.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(SView.S_VIEW.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SView> fetchByUpdatedBy(String... values) {
        return fetch(SView.S_VIEW.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.rbac.domain.tables.pojos.SView> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByNameAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.NAME, values);
    }

    /**
     * Fetch records that have <code>OWNER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByOwnerAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.OWNER, values);
    }

    /**
     * Fetch records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByOwnerTypeAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.OWNER_TYPE, values);
    }

    /**
     * Fetch records that have <code>RESOURCE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByResourceIdAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.RESOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>PROJECTION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByProjectionAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.PROJECTION, values);
    }

    /**
     * Fetch records that have <code>CRITERIA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByCriteriaAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.CRITERIA, values);
    }

    /**
     * Fetch records that have <code>ROWS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByRowsAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.ROWS, values);
    }

    /**
     * Fetch records that have <code>POSITION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByPositionAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.POSITION, values);
    }

    /**
     * Fetch records that have <code>VISITANT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByVisitantAsync(List<Boolean> values) {
        return fetchAsync(SView.S_VIEW.VISITANT, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SView.S_VIEW.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SView.S_VIEW.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SView.S_VIEW.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SView>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(SView.S_VIEW.UPDATED_BY, values);
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
