/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.EBrand;
import cn.vertxup.erp.domain.tables.records.EBrandRecord;
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
public class EBrandDao extends AbstractVertxDAO<EBrandRecord, cn.vertxup.erp.domain.tables.pojos.EBrand, String, Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>>, Future<cn.vertxup.erp.domain.tables.pojos.EBrand>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EBrandRecord, cn.vertxup.erp.domain.tables.pojos.EBrand, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public EBrandDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EBrand.E_BRAND, cn.vertxup.erp.domain.tables.pojos.EBrand.class, new JDBCClassicQueryExecutor<EBrandRecord, cn.vertxup.erp.domain.tables.pojos.EBrand, String>(configuration, cn.vertxup.erp.domain.tables.pojos.EBrand.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.erp.domain.tables.pojos.EBrand object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCode(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByName(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAlias(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.ALIAS.in(values));
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAlias(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.ALIAS.in(values), limit);
    }

    /**
     * Find records that have <code>COMPANY_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCompanyName(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.COMPANY_NAME.in(values));
    }

    /**
     * Find records that have <code>COMPANY_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCompanyName(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.COMPANY_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY_CODE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCategoryCode(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.CATEGORY_CODE.in(values));
    }

    /**
     * Find records that have <code>CATEGORY_CODE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCategoryCode(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.CATEGORY_CODE.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCategoryName(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.CATEGORY_NAME.in(values));
    }

    /**
     * Find records that have <code>CATEGORY_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCategoryName(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.CATEGORY_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>AREA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByArea(Collection<Integer> values) {
        return findManyByCondition(EBrand.E_BRAND.AREA.in(values));
    }

    /**
     * Find records that have <code>AREA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByArea(Collection<Integer> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.AREA.in(values), limit);
    }

    /**
     * Find records that have <code>AREA_NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAreaName(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.AREA_NAME.in(values));
    }

    /**
     * Find records that have <code>AREA_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAreaName(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.AREA_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>AREA_CATEGORY IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAreaCategory(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.AREA_CATEGORY.in(values));
    }

    /**
     * Find records that have <code>AREA_CATEGORY IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByAreaCategory(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.AREA_CATEGORY.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EBrand.E_BRAND.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EBrand.E_BRAND.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EBrand.E_BRAND.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EBrand.E_BRAND.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.erp.domain.tables.pojos.EBrand>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EBrand.E_BRAND.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EBrandRecord, cn.vertxup.erp.domain.tables.pojos.EBrand, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EBrandRecord, cn.vertxup.erp.domain.tables.pojos.EBrand, String>) super.queryExecutor();
    }
}
