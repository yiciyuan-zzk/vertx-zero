/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SUser;
import cn.vertxup.rbac.domain.tables.records.SUserRecord;
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
public class SUserDao extends DAOImpl<SUserRecord, cn.vertxup.rbac.domain.tables.pojos.SUser, String> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.SUserRecord, cn.vertxup.rbac.domain.tables.pojos.SUser, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new SUserDao without any configuration
     */
    public SUserDao() {
        super(SUser.S_USER, cn.vertxup.rbac.domain.tables.pojos.SUser.class);
    }

    /**
     * Create a new SUserDao with an attached configuration
     */
    public SUserDao(Configuration configuration) {
        super(SUser.S_USER, cn.vertxup.rbac.domain.tables.pojos.SUser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.rbac.domain.tables.pojos.SUser object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByKey(String... values) {
        return fetch(SUser.S_USER.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.rbac.domain.tables.pojos.SUser fetchOneByKey(String value) {
        return fetchOne(SUser.S_USER.KEY, value);
    }

    /**
     * Fetch records that have <code>USERNAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByUsername(String... values) {
        return fetch(SUser.S_USER.USERNAME, values);
    }

    /**
     * Fetch records that have <code>REALNAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByRealname(String... values) {
        return fetch(SUser.S_USER.REALNAME, values);
    }

    /**
     * Fetch records that have <code>ALIAS IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByAlias(String... values) {
        return fetch(SUser.S_USER.ALIAS, values);
    }

    /**
     * Fetch records that have <code>MOBILE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByMobile(String... values) {
        return fetch(SUser.S_USER.MOBILE, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByEmail(String... values) {
        return fetch(SUser.S_USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>PASSWORD IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByPassword(String... values) {
        return fetch(SUser.S_USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByModelId(String... values) {
        return fetch(SUser.S_USER.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByModelKey(String... values) {
        return fetch(SUser.S_USER.MODEL_KEY, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByCategory(String... values) {
        return fetch(SUser.S_USER.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchBySigma(String... values) {
        return fetch(SUser.S_USER.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByLanguage(String... values) {
        return fetch(SUser.S_USER.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByActive(Boolean... values) {
        return fetch(SUser.S_USER.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByMetadata(String... values) {
        return fetch(SUser.S_USER.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(SUser.S_USER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByCreatedBy(String... values) {
        return fetch(SUser.S_USER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(SUser.S_USER.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchByUpdatedBy(String... values) {
        return fetch(SUser.S_USER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.rbac.domain.tables.pojos.SUser> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>USERNAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByUsernameAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.USERNAME, values);
    }

    /**
     * Fetch records that have <code>REALNAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByRealnameAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.REALNAME, values);
    }

    /**
     * Fetch records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByAliasAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.ALIAS, values);
    }

    /**
     * Fetch records that have <code>MOBILE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByMobileAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.MOBILE, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByEmailAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>PASSWORD IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByPasswordAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByModelIdAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByModelKeyAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.MODEL_KEY, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByCategoryAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SUser.S_USER.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SUser.S_USER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SUser.S_USER.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SUser>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(SUser.S_USER.UPDATED_BY, values);
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
