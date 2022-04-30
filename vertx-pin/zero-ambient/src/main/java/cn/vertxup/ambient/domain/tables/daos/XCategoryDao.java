/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XCategory;
import cn.vertxup.ambient.domain.tables.records.XCategoryRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class XCategoryDao extends AbstractVertxDAO<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>>, Future<cn.vertxup.ambient.domain.tables.pojos.XCategory>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public XCategoryDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(XCategory.X_CATEGORY, cn.vertxup.ambient.domain.tables.pojos.XCategory.class, new JDBCClassicQueryExecutor<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String>(configuration, cn.vertxup.ambient.domain.tables.pojos.XCategory.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XCategory object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByName(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCode(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByIcon(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.ICON.in(values));
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByIcon(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.ICON.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByType(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyBySort(Collection<Integer> values) {
        return findManyByCondition(XCategory.X_CATEGORY.SORT.in(values));
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyBySort(Collection<Integer> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.SORT.in(values), limit);
    }

    /**
     * Find records that have <code>LEAF IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByLeaf(Collection<Boolean> values) {
        return findManyByCondition(XCategory.X_CATEGORY.LEAF.in(values));
    }

    /**
     * Find records that have <code>LEAF IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByLeaf(Collection<Boolean> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.LEAF.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByIdentifier(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.IDENTIFIER.in(values));
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByIdentifier(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.IDENTIFIER.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByComment(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByAppId(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.APP_ID.in(values));
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByAppId(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.APP_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TREE_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByTreeComponent(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.TREE_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>TREE_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByTreeComponent(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.TREE_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>TREE_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByTreeConfig(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.TREE_CONFIG.in(values));
    }

    /**
     * Find records that have <code>TREE_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByTreeConfig(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.TREE_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByRunComponent(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.RUN_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByRunComponent(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.RUN_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_CONFIG IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByRunConfig(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.RUN_CONFIG.in(values));
    }

    /**
     * Find records that have <code>RUN_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByRunConfig(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.RUN_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(XCategory.X_CATEGORY.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XCategory.X_CATEGORY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XCategory.X_CATEGORY.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(XCategory.X_CATEGORY.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XCategory>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XCategory.X_CATEGORY.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<XCategoryRecord, cn.vertxup.ambient.domain.tables.pojos.XCategory, String>) super.queryExecutor();
    }
}
