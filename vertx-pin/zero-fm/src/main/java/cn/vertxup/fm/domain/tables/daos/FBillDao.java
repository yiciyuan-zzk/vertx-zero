/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FBill;
import cn.vertxup.fm.domain.tables.records.FBillRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FBillDao extends AbstractVertxDAO<FBillRecord, cn.vertxup.fm.domain.tables.pojos.FBill, String, Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>>, Future<cn.vertxup.fm.domain.tables.pojos.FBill>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FBillRecord,cn.vertxup.fm.domain.tables.pojos.FBill,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public FBillDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(FBill.F_BILL, cn.vertxup.fm.domain.tables.pojos.FBill.class, new JDBCClassicQueryExecutor<FBillRecord,cn.vertxup.fm.domain.tables.pojos.FBill,String>(configuration,cn.vertxup.fm.domain.tables.pojos.FBill.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.fm.domain.tables.pojos.FBill object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByName(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCode(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByType(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCategory(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.CATEGORY.in(values));
        }

        /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCategory(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.CATEGORY.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(FBill.F_BILL.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(FBill.F_BILL.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByIncome(Collection<Boolean> values) {
                return findManyByCondition(FBill.F_BILL.INCOME.in(values));
        }

        /**
     * Find records that have <code>INCOME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByIncome(Collection<Boolean> values, int limit) {
                return findManyByCondition(FBill.F_BILL.INCOME.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByComment(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByOrderId(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.ORDER_ID.in(values));
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByOrderId(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.ORDER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByBookId(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.BOOK_ID.in(values));
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByBookId(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.BOOK_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByModelKey(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.MODEL_KEY.in(values));
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByModelKey(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.MODEL_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(FBill.F_BILL.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(FBill.F_BILL.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FBill.F_BILL.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FBill.F_BILL.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FBill.F_BILL.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FBill.F_BILL.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(FBill.F_BILL.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FBill>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FBill.F_BILL.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<FBillRecord,cn.vertxup.fm.domain.tables.pojos.FBill,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<FBillRecord,cn.vertxup.fm.domain.tables.pojos.FBill,String>) super.queryExecutor();
        }
}
