/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XLinkage;
import cn.vertxup.ambient.domain.tables.records.XLinkageRecord;
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
public class XLinkageDao extends AbstractVertxDAO<XLinkageRecord, cn.vertxup.ambient.domain.tables.pojos.XLinkage, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>>, Future<cn.vertxup.ambient.domain.tables.pojos.XLinkage>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XLinkageRecord, cn.vertxup.ambient.domain.tables.pojos.XLinkage, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public XLinkageDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(XLinkage.X_LINKAGE, cn.vertxup.ambient.domain.tables.pojos.XLinkage.class, new JDBCClassicQueryExecutor<XLinkageRecord, cn.vertxup.ambient.domain.tables.pojos.XLinkage, String>(configuration, cn.vertxup.ambient.domain.tables.pojos.XLinkage.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XLinkage object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByName(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByType(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByAlias(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.ALIAS.in(values));
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByAlias(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.ALIAS.in(values), limit);
    }

    /**
     * Find records that have <code>REGION IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByRegion(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.REGION.in(values));
    }

    /**
     * Find records that have <code>REGION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByRegion(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.REGION.in(values), limit);
    }

    /**
     * Find records that have <code>LINK_KEY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkKey(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_KEY.in(values));
    }

    /**
     * Find records that have <code>LINK_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkKey(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>LINK_TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkType(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_TYPE.in(values));
    }

    /**
     * Find records that have <code>LINK_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkType(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>LINK_DATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkData(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_DATA.in(values));
    }

    /**
     * Find records that have <code>LINK_DATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLinkData(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.LINK_DATA.in(values), limit);
    }

    /**
     * Find records that have <code>SOURCE_KEY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceKey(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_KEY.in(values));
    }

    /**
     * Find records that have <code>SOURCE_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceKey(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>SOURCE_TYPE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceType(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_TYPE.in(values));
    }

    /**
     * Find records that have <code>SOURCE_TYPE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceType(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>SOURCE_DATA IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceData(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_DATA.in(values));
    }

    /**
     * Find records that have <code>SOURCE_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySourceData(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.SOURCE_DATA.in(values), limit);
    }

    /**
     * Find records that have <code>TARGET_KEY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetKey(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_KEY.in(values));
    }

    /**
     * Find records that have <code>TARGET_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetKey(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>TARGET_TYPE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetType(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_TYPE.in(values));
    }

    /**
     * Find records that have <code>TARGET_TYPE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetType(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>TARGET_DATA IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetData(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_DATA.in(values));
    }

    /**
     * Find records that have <code>TARGET_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByTargetData(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.TARGET_DATA.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(XLinkage.X_LINKAGE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XLinkage>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XLinkage.X_LINKAGE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<XLinkageRecord, cn.vertxup.ambient.domain.tables.pojos.XLinkage, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<XLinkageRecord, cn.vertxup.ambient.domain.tables.pojos.XLinkage, String>) super.queryExecutor();
    }
}
