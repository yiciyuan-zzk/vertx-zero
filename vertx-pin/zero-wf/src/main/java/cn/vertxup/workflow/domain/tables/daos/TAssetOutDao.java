/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.daos;


import cn.vertxup.workflow.domain.tables.TAssetOut;
import cn.vertxup.workflow.domain.tables.records.TAssetOutRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TAssetOutDao extends AbstractVertxDAO<TAssetOutRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetOut, String, Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>>, Future<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TAssetOutRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetOut, String> {

    /**
     * @param configuration The ConfigRunner used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public TAssetOutDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(TAssetOut.T_ASSET_OUT, cn.vertxup.workflow.domain.tables.pojos.TAssetOut.class, new JDBCClassicQueryExecutor<TAssetOutRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetOut, String>(configuration, cn.vertxup.workflow.domain.tables.pojos.TAssetOut.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.workflow.domain.tables.pojos.TAssetOut object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMMENT_OUT IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>> findManyByCommentOut(Collection<String> values) {
        return findManyByCondition(TAssetOut.T_ASSET_OUT.COMMENT_OUT.in(values));
    }

    /**
     * Find records that have <code>COMMENT_OUT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>> findManyByCommentOut(Collection<String> values, int limit) {
        return findManyByCondition(TAssetOut.T_ASSET_OUT.COMMENT_OUT.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT_USAGE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>> findManyByCommentUsage(Collection<String> values) {
        return findManyByCondition(TAssetOut.T_ASSET_OUT.COMMENT_USAGE.in(values));
    }

    /**
     * Find records that have <code>COMMENT_USAGE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetOut>> findManyByCommentUsage(Collection<String> values, int limit) {
        return findManyByCondition(TAssetOut.T_ASSET_OUT.COMMENT_USAGE.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<TAssetOutRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetOut, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<TAssetOutRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetOut, String>) super.queryExecutor();
    }
}
