/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MKey;
import cn.vertxup.atom.domain.tables.records.MKeyRecord;
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
public class MKeyDao extends DAOImpl<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String> implements VertxDAO<cn.vertxup.atom.domain.tables.records.MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new MKeyDao without any configuration
     */
    public MKeyDao() {
        super(MKey.M_KEY, cn.vertxup.atom.domain.tables.pojos.MKey.class);
    }

    /**
     * Create a new MKeyDao with an attached configuration
     */
    public MKeyDao(Configuration configuration) {
        super(MKey.M_KEY, cn.vertxup.atom.domain.tables.pojos.MKey.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MKey object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByKey(String... values) {
        return fetch(MKey.M_KEY.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.atom.domain.tables.pojos.MKey fetchOneByKey(String value) {
        return fetchOne(MKey.M_KEY.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByName(String... values) {
        return fetch(MKey.M_KEY.NAME, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByType(String... values) {
        return fetch(MKey.M_KEY.TYPE, values);
    }

    /**
     * Fetch records that have <code>COLUMNS IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByColumns(String... values) {
        return fetch(MKey.M_KEY.COLUMNS, values);
    }

    /**
     * Fetch records that have <code>ENTITY_ID IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByEntityId(String... values) {
        return fetch(MKey.M_KEY.ENTITY_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByComments(String... values) {
        return fetch(MKey.M_KEY.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchBySigma(String... values) {
        return fetch(MKey.M_KEY.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByLanguage(String... values) {
        return fetch(MKey.M_KEY.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByActive(Boolean... values) {
        return fetch(MKey.M_KEY.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByMetadata(String... values) {
        return fetch(MKey.M_KEY.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(MKey.M_KEY.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByCreatedBy(String... values) {
        return fetch(MKey.M_KEY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(MKey.M_KEY.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MKey> fetchByUpdatedBy(String... values) {
        return fetch(MKey.M_KEY.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.atom.domain.tables.pojos.MKey> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByNameAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.NAME, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.TYPE, values);
    }

    /**
     * Fetch records that have <code>COLUMNS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByColumnsAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.COLUMNS, values);
    }

    /**
     * Fetch records that have <code>ENTITY_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByEntityIdAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.ENTITY_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByCommentsAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(MKey.M_KEY.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MKey.M_KEY.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MKey.M_KEY.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MKey>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(MKey.M_KEY.UPDATED_BY, values);
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
