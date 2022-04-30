/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XApp;
import cn.vertxup.ambient.domain.tables.records.XAppRecord;
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
public class XAppDao extends AbstractVertxDAO<XAppRecord, cn.vertxup.ambient.domain.tables.pojos.XApp, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>>, Future<cn.vertxup.ambient.domain.tables.pojos.XApp>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XAppRecord, cn.vertxup.ambient.domain.tables.pojos.XApp, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public XAppDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(XApp.X_APP, cn.vertxup.ambient.domain.tables.pojos.XApp.class, new JDBCClassicQueryExecutor<XAppRecord, cn.vertxup.ambient.domain.tables.pojos.XApp, String>(configuration, cn.vertxup.ambient.domain.tables.pojos.XApp.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XApp object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByName(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCode(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByLogo(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.LOGO.in(values));
    }

    /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByLogo(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.LOGO.in(values), limit);
    }

    /**
     * Find records that have <code>ICP IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByIcp(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.ICP.in(values));
    }

    /**
     * Find records that have <code>ICP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByIcp(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.ICP.in(values), limit);
    }

    /**
     * Find records that have <code>COPY_RIGHT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCopyRight(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.COPY_RIGHT.in(values));
    }

    /**
     * Find records that have <code>COPY_RIGHT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCopyRight(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.COPY_RIGHT.in(values), limit);
    }

    /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByEmail(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.EMAIL.in(values));
    }

    /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByEmail(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.EMAIL.in(values), limit);
    }

    /**
     * Find records that have <code>DOMAIN IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByDomain(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.DOMAIN.in(values));
    }

    /**
     * Find records that have <code>DOMAIN IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByDomain(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.DOMAIN.in(values), limit);
    }

    /**
     * Find records that have <code>APP_PORT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByAppPort(Collection<Integer> values) {
        return findManyByCondition(XApp.X_APP.APP_PORT.in(values));
    }

    /**
     * Find records that have <code>APP_PORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByAppPort(Collection<Integer> values, int limit) {
        return findManyByCondition(XApp.X_APP.APP_PORT.in(values), limit);
    }

    /**
     * Find records that have <code>URL_ENTRY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUrlEntry(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.URL_ENTRY.in(values));
    }

    /**
     * Find records that have <code>URL_ENTRY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUrlEntry(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.URL_ENTRY.in(values), limit);
    }

    /**
     * Find records that have <code>URL_MAIN IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUrlMain(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.URL_MAIN.in(values));
    }

    /**
     * Find records that have <code>URL_MAIN IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUrlMain(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.URL_MAIN.in(values), limit);
    }

    /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByPath(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.PATH.in(values));
    }

    /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByPath(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.PATH.in(values), limit);
    }

    /**
     * Find records that have <code>ROUTE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByRoute(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.ROUTE.in(values));
    }

    /**
     * Find records that have <code>ROUTE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByRoute(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.ROUTE.in(values), limit);
    }

    /**
     * Find records that have <code>APP_KEY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByAppKey(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.APP_KEY.in(values));
    }

    /**
     * Find records that have <code>APP_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByAppKey(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.APP_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(XApp.X_APP.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(XApp.X_APP.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XApp.X_APP.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XApp.X_APP.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(XApp.X_APP.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(XApp.X_APP.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(XApp.X_APP.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ambient.domain.tables.pojos.XApp>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(XApp.X_APP.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<XAppRecord, cn.vertxup.ambient.domain.tables.pojos.XApp, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<XAppRecord, cn.vertxup.ambient.domain.tables.pojos.XApp, String>) super.queryExecutor();
    }
}
