/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MKey;
import cn.vertxup.atom.domain.tables.records.MKeyRecord;
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
public class MKeyDao extends AbstractVertxDAO<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String, Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>>, Future<cn.vertxup.atom.domain.tables.pojos.MKey>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public MKeyDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MKey.M_KEY, cn.vertxup.atom.domain.tables.pojos.MKey.class, new JDBCClassicQueryExecutor<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String>(configuration, cn.vertxup.atom.domain.tables.pojos.MKey.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MKey object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByName(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByType(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>COLUMNS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByColumns(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.COLUMNS.in(values));
    }

    /**
     * Find records that have <code>COLUMNS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByColumns(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.COLUMNS.in(values), limit);
    }

    /**
     * Find records that have <code>ENTITY_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByEntityId(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.ENTITY_ID.in(values));
    }

    /**
     * Find records that have <code>ENTITY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByEntityId(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.ENTITY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByComments(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.COMMENTS.in(values));
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByComments(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.COMMENTS.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MKey.M_KEY.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MKey.M_KEY.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MKey.M_KEY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MKey.M_KEY.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MKey.M_KEY.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MKey.M_KEY.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MKey.M_KEY.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.atom.domain.tables.pojos.MKey>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MKey.M_KEY.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MKeyRecord, cn.vertxup.atom.domain.tables.pojos.MKey, String>) super.queryExecutor();
    }
}
