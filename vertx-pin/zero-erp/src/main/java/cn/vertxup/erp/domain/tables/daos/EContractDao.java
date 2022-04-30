/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.EContract;
import cn.vertxup.erp.domain.tables.records.EContractRecord;
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
public class EContractDao extends AbstractVertxDAO<EContractRecord, cn.vertxup.erp.domain.tables.pojos.EContract, String, Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>>, Future<cn.vertxup.erp.domain.tables.pojos.EContract>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EContractRecord, cn.vertxup.erp.domain.tables.pojos.EContract, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public EContractDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EContract.E_CONTRACT, cn.vertxup.erp.domain.tables.pojos.EContract.class, new JDBCClassicQueryExecutor<EContractRecord, cn.vertxup.erp.domain.tables.pojos.EContract, String>(configuration, cn.vertxup.erp.domain.tables.pojos.EContract.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.erp.domain.tables.pojos.EContract object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCode(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>FILE_KEY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByFileKey(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.FILE_KEY.in(values));
    }

    /**
     * Find records that have <code>FILE_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByFileKey(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.FILE_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(EContract.E_CONTRACT.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCompanyId(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.COMPANY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByExpiredAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.EXPIRED_AT.in(values));
    }

    /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByExpiredAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.EXPIRED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGNED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyBySignedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_AT.in(values));
    }

    /**
     * Find records that have <code>SIGNED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyBySignedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByRunAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.RUN_AT.in(values));
    }

    /**
     * Find records that have <code>RUN_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByRunAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.RUN_AT.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_UP_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByRunUpAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.RUN_UP_AT.in(values));
    }

    /**
     * Find records that have <code>RUN_UP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByRunUpAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.RUN_UP_AT.in(values), limit);
    }

    /**
     * Find records that have <code>A_NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_NAME.in(values));
    }

    /**
     * Find records that have <code>A_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>A_PHONE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAPhone(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_PHONE.in(values));
    }

    /**
     * Find records that have <code>A_PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAPhone(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>A_ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAAddress(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>A_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByAAddress(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>B_NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_NAME.in(values));
    }

    /**
     * Find records that have <code>B_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>B_PHONE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBPhone(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_PHONE.in(values));
    }

    /**
     * Find records that have <code>B_PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBPhone(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>B_ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBAddress(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>B_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByBAddress(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByType(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EContract.E_CONTRACT.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EContract>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EContractRecord, cn.vertxup.erp.domain.tables.pojos.EContract, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EContractRecord, cn.vertxup.erp.domain.tables.pojos.EContract, String>) super.queryExecutor();
    }
}
