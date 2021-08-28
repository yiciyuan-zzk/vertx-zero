/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XCategory;
import cn.vertxup.ambient.domain.tables.records.XCategoryRecord;
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
public class XCategoryDao extends DAOImpl<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String> implements VertxDAO<cn.vertxup.ambient.domain.tables.records.XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new XCategoryDao without any configuration
     */
    public XCategoryDao() {
        super(XCategory.X_CATEGORY, cn.vertxup.ambient.domain.tables.pojos.XCategory.class);
    }

    /**
     * Create a new XCategoryDao with an attached configuration
     */
    public XCategoryDao(Configuration configuration) {
        super(XCategory.X_CATEGORY, cn.vertxup.ambient.domain.tables.pojos.XCategory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XCategory object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByKey(String... values) {
        return fetch(XCategory.X_CATEGORY.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XCategory fetchOneByKey(String value) {
        return fetchOne(XCategory.X_CATEGORY.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByName(String... values) {
        return fetch(XCategory.X_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByCode(String... values) {
        return fetch(XCategory.X_CATEGORY.CODE, values);
    }

    /**
     * Fetch records that have <code>ICON IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByIcon(String... values) {
        return fetch(XCategory.X_CATEGORY.ICON, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByType(String... values) {
        return fetch(XCategory.X_CATEGORY.TYPE, values);
    }

    /**
     * Fetch records that have <code>SORT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchBySort(Integer... values) {
        return fetch(XCategory.X_CATEGORY.SORT, values);
    }

    /**
     * Fetch records that have <code>LEAF IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByLeaf(Boolean... values) {
        return fetch(XCategory.X_CATEGORY.LEAF, values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByParentId(String... values) {
        return fetch(XCategory.X_CATEGORY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>IDENTIFIER IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByIdentifier(String... values) {
        return fetch(XCategory.X_CATEGORY.IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByComment(String... values) {
        return fetch(XCategory.X_CATEGORY.COMMENT, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByAppId(String... values) {
        return fetch(XCategory.X_CATEGORY.APP_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByActive(Boolean... values) {
        return fetch(XCategory.X_CATEGORY.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchBySigma(String... values) {
        return fetch(XCategory.X_CATEGORY.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByMetadata(String... values) {
        return fetch(XCategory.X_CATEGORY.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByLanguage(String... values) {
        return fetch(XCategory.X_CATEGORY.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(XCategory.X_CATEGORY.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByCreatedBy(String... values) {
        return fetch(XCategory.X_CATEGORY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(XCategory.X_CATEGORY.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchByUpdatedBy(String... values) {
        return fetch(XCategory.X_CATEGORY.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XCategory> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByNameAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.CODE, values);
    }

    /**
     * Fetch records that have <code>ICON IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByIconAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.ICON, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.TYPE, values);
    }

    /**
     * Fetch records that have <code>SORT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchBySortAsync(List<Integer> values) {
        return fetchAsync(XCategory.X_CATEGORY.SORT, values);
    }

    /**
     * Fetch records that have <code>LEAF IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByLeafAsync(List<Boolean> values) {
        return fetchAsync(XCategory.X_CATEGORY.LEAF, values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByParentIdAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByIdentifierAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByCommentAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.COMMENT, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByAppIdAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.APP_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(XCategory.X_CATEGORY.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XCategory.X_CATEGORY.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XCategory.X_CATEGORY.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(XCategory.X_CATEGORY.UPDATED_BY, values);
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
