/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XActivityChange;
import cn.vertxup.ambient.domain.tables.records.XActivityChangeRecord;
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
public class XActivityChangeDao extends DAOImpl<XActivityChangeRecord, cn.vertxup.ambient.domain.tables.pojos.XActivityChange, String> implements VertxDAO<cn.vertxup.ambient.domain.tables.records.XActivityChangeRecord, cn.vertxup.ambient.domain.tables.pojos.XActivityChange, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new XActivityChangeDao without any configuration
     */
    public XActivityChangeDao() {
        super(XActivityChange.X_ACTIVITY_CHANGE, cn.vertxup.ambient.domain.tables.pojos.XActivityChange.class);
    }

    /**
     * Create a new XActivityChangeDao with an attached configuration
     */
    public XActivityChangeDao(Configuration configuration) {
        super(XActivityChange.X_ACTIVITY_CHANGE, cn.vertxup.ambient.domain.tables.pojos.XActivityChange.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XActivityChange object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByKey(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XActivityChange fetchOneByKey(String value) {
        return fetchOne(XActivityChange.X_ACTIVITY_CHANGE.KEY, value);
    }

    /**
     * Fetch records that have <code>ACTIVITY_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByActivityId(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.ACTIVITY_ID, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByType(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.TYPE, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByStatus(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.STATUS, values);
    }

    /**
     * Fetch records that have <code>FIELD_NAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByFieldName(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.FIELD_NAME, values);
    }

    /**
     * Fetch records that have <code>FIELD_ALIAS IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByFieldAlias(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.FIELD_ALIAS, values);
    }

    /**
     * Fetch records that have <code>FIELD_TYPE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByFieldType(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.FIELD_TYPE, values);
    }

    /**
     * Fetch records that have <code>VALUE_OLD IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByValueOld(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.VALUE_OLD, values);
    }

    /**
     * Fetch records that have <code>VALUE_NEW IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByValueNew(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.VALUE_NEW, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchBySigma(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByLanguage(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByActive(Boolean... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByMetadata(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByCreatedBy(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchByUpdatedBy(String... values) {
        return fetch(XActivityChange.X_ACTIVITY_CHANGE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XActivityChange> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>ACTIVITY_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByActivityIdAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.ACTIVITY_ID, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.TYPE, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByStatusAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.STATUS, values);
    }

    /**
     * Fetch records that have <code>FIELD_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByFieldNameAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.FIELD_NAME, values);
    }

    /**
     * Fetch records that have <code>FIELD_ALIAS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByFieldAliasAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.FIELD_ALIAS, values);
    }

    /**
     * Fetch records that have <code>FIELD_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByFieldTypeAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.FIELD_TYPE, values);
    }

    /**
     * Fetch records that have <code>VALUE_OLD IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByValueOldAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.VALUE_OLD, values);
    }

    /**
     * Fetch records that have <code>VALUE_NEW IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByValueNewAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.VALUE_NEW, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XActivityChange>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(XActivityChange.X_ACTIVITY_CHANGE.UPDATED_BY, values);
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
