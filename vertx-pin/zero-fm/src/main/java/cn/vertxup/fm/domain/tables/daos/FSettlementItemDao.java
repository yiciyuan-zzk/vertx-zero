/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FSettlementItem;
import cn.vertxup.fm.domain.tables.records.FSettlementItemRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FSettlementItemDao extends AbstractVertxDAO<FSettlementItemRecord, cn.vertxup.fm.domain.tables.pojos.FSettlementItem, String, Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>>, Future<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FSettlementItemRecord, cn.vertxup.fm.domain.tables.pojos.FSettlementItem, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public FSettlementItemDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(FSettlementItem.F_SETTLEMENT_ITEM, cn.vertxup.fm.domain.tables.pojos.FSettlementItem.class, new JDBCClassicQueryExecutor<FSettlementItemRecord, cn.vertxup.fm.domain.tables.pojos.FSettlementItem, String>(configuration, cn.vertxup.fm.domain.tables.pojos.FSettlementItem.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.fm.domain.tables.pojos.FSettlementItem object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByName(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCode(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySerial(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SERIAL.in(values));
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySerial(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByIncome(Collection<Boolean> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.INCOME.in(values));
    }

    /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByIncome(Collection<Boolean> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.INCOME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByType(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByComment(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>MANUAL_NO IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByManualNo(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.MANUAL_NO.in(values));
    }

    /**
     * Find records that have <code>MANUAL_NO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByManualNo(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.MANUAL_NO.in(values), limit);
    }

    /**
     * Find records that have <code>PAY_TERM_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByPayTermId(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.PAY_TERM_ID.in(values));
    }

    /**
     * Find records that have <code>PAY_TERM_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByPayTermId(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.PAY_TERM_ID.in(values), limit);
    }

    /**
     * Find records that have <code>RELATED_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByRelatedId(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.RELATED_ID.in(values));
    }

    /**
     * Find records that have <code>RELATED_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByRelatedId(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.RELATED_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SETTLEMENT_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySettlementId(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID.in(values));
    }

    /**
     * Find records that have <code>SETTLEMENT_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySettlementId(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>DEBT_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByDebtId(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.DEBT_ID.in(values));
    }

    /**
     * Find records that have <code>DEBT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByDebtId(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.DEBT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>INVOICE_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByInvoiceId(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.INVOICE_ID.in(values));
    }

    /**
     * Find records that have <code>INVOICE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByInvoiceId(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.INVOICE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlementItem>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FSettlementItem.F_SETTLEMENT_ITEM.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<FSettlementItemRecord, cn.vertxup.fm.domain.tables.pojos.FSettlementItem, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<FSettlementItemRecord, cn.vertxup.fm.domain.tables.pojos.FSettlementItem, String>) super.queryExecutor();
    }
}
