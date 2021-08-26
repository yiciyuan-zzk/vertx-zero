/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MField;
import cn.vertxup.atom.domain.tables.records.MFieldRecord;
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
public class MFieldDao extends DAOImpl<MFieldRecord, cn.vertxup.atom.domain.tables.pojos.MField, String> implements VertxDAO<cn.vertxup.atom.domain.tables.records.MFieldRecord, cn.vertxup.atom.domain.tables.pojos.MField, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new MFieldDao without any configuration
     */
    public MFieldDao() {
        super(MField.M_FIELD, cn.vertxup.atom.domain.tables.pojos.MField.class);
    }

    /**
     * Create a new MFieldDao with an attached configuration
     */
    public MFieldDao(Configuration configuration) {
        super(MField.M_FIELD, cn.vertxup.atom.domain.tables.pojos.MField.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MField object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByKey(String... values) {
        return fetch(MField.M_FIELD.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.atom.domain.tables.pojos.MField fetchOneByKey(String value) {
        return fetchOne(MField.M_FIELD.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByName(String... values) {
        return fetch(MField.M_FIELD.NAME, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByType(String... values) {
        return fetch(MField.M_FIELD.TYPE, values);
    }

    /**
     * Fetch records that have <code>COLUMN_NAME IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByColumnName(String... values) {
        return fetch(MField.M_FIELD.COLUMN_NAME, values);
    }

    /**
     * Fetch records that have <code>COLUMN_TYPE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByColumnType(String... values) {
        return fetch(MField.M_FIELD.COLUMN_TYPE, values);
    }

    /**
     * Fetch records that have <code>IS_PRIMARY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByIsPrimary(Boolean... values) {
        return fetch(MField.M_FIELD.IS_PRIMARY, values);
    }

    /**
     * Fetch records that have <code>IS_NULLABLE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByIsNullable(Boolean... values) {
        return fetch(MField.M_FIELD.IS_NULLABLE, values);
    }

    /**
     * Fetch records that have <code>LENGTH IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByLength(Integer... values) {
        return fetch(MField.M_FIELD.LENGTH, values);
    }

    /**
     * Fetch records that have <code>PRECISION IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByPrecision(Integer... values) {
        return fetch(MField.M_FIELD.PRECISION, values);
    }

    /**
     * Fetch records that have <code>FORMAT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByFormat(String... values) {
        return fetch(MField.M_FIELD.FORMAT, values);
    }

    /**
     * Fetch records that have <code>IN_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByInComponent(String... values) {
        return fetch(MField.M_FIELD.IN_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>OUT_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByOutComponent(String... values) {
        return fetch(MField.M_FIELD.OUT_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>ENTITY_ID IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByEntityId(String... values) {
        return fetch(MField.M_FIELD.ENTITY_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByComments(String... values) {
        return fetch(MField.M_FIELD.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchBySigma(String... values) {
        return fetch(MField.M_FIELD.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByLanguage(String... values) {
        return fetch(MField.M_FIELD.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByActive(Boolean... values) {
        return fetch(MField.M_FIELD.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByMetadata(String... values) {
        return fetch(MField.M_FIELD.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(MField.M_FIELD.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByCreatedBy(String... values) {
        return fetch(MField.M_FIELD.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(MField.M_FIELD.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MField> fetchByUpdatedBy(String... values) {
        return fetch(MField.M_FIELD.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.atom.domain.tables.pojos.MField> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByNameAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.NAME, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.TYPE, values);
    }

    /**
     * Fetch records that have <code>COLUMN_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByColumnNameAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.COLUMN_NAME, values);
    }

    /**
     * Fetch records that have <code>COLUMN_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByColumnTypeAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.COLUMN_TYPE, values);
    }

    /**
     * Fetch records that have <code>IS_PRIMARY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByIsPrimaryAsync(List<Boolean> values) {
        return fetchAsync(MField.M_FIELD.IS_PRIMARY, values);
    }

    /**
     * Fetch records that have <code>IS_NULLABLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByIsNullableAsync(List<Boolean> values) {
        return fetchAsync(MField.M_FIELD.IS_NULLABLE, values);
    }

    /**
     * Fetch records that have <code>LENGTH IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByLengthAsync(List<Integer> values) {
        return fetchAsync(MField.M_FIELD.LENGTH, values);
    }

    /**
     * Fetch records that have <code>PRECISION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByPrecisionAsync(List<Integer> values) {
        return fetchAsync(MField.M_FIELD.PRECISION, values);
    }

    /**
     * Fetch records that have <code>FORMAT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByFormatAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.FORMAT, values);
    }

    /**
     * Fetch records that have <code>IN_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByInComponentAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.IN_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>OUT_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByOutComponentAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.OUT_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>ENTITY_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByEntityIdAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.ENTITY_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByCommentsAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(MField.M_FIELD.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MField.M_FIELD.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MField.M_FIELD.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MField>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(MField.M_FIELD.UPDATED_BY, values);
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
