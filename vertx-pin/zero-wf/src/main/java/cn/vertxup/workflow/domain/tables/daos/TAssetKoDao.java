/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.daos;


import cn.vertxup.workflow.domain.tables.TAssetKo;
import cn.vertxup.workflow.domain.tables.records.TAssetKoRecord;
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
public class TAssetKoDao extends AbstractVertxDAO<TAssetKoRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetKo, String, Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetKo>>, Future<cn.vertxup.workflow.domain.tables.pojos.TAssetKo>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TAssetKoRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetKo, String> {

    /**
     * @param configuration The ConfigRunner used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public TAssetKoDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(TAssetKo.T_ASSET_KO, cn.vertxup.workflow.domain.tables.pojos.TAssetKo.class, new JDBCClassicQueryExecutor<TAssetKoRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetKo, String>(configuration, cn.vertxup.workflow.domain.tables.pojos.TAssetKo.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.workflow.domain.tables.pojos.TAssetKo object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMMENT_KO IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetKo>> findManyByCommentKo(Collection<String> values) {
        return findManyByCondition(TAssetKo.T_ASSET_KO.COMMENT_KO.in(values));
    }

    /**
     * Find records that have <code>COMMENT_KO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetKo>> findManyByCommentKo(Collection<String> values, int limit) {
        return findManyByCondition(TAssetKo.T_ASSET_KO.COMMENT_KO.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<TAssetKoRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetKo, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<TAssetKoRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetKo, String>) super.queryExecutor();
    }
}
