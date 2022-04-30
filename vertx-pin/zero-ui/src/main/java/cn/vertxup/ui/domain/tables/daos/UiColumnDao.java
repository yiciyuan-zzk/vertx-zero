/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiColumn;
import cn.vertxup.ui.domain.tables.records.UiColumnRecord;
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
public class UiColumnDao extends AbstractVertxDAO<UiColumnRecord, cn.vertxup.ui.domain.tables.pojos.UiColumn, String, Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>>, Future<cn.vertxup.ui.domain.tables.pojos.UiColumn>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiColumnRecord, cn.vertxup.ui.domain.tables.pojos.UiColumn, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     *                      * @param vertx the vertx instance
     */
    public UiColumnDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(UiColumn.UI_COLUMN, cn.vertxup.ui.domain.tables.pojos.UiColumn.class, new JDBCClassicQueryExecutor<UiColumnRecord, cn.vertxup.ui.domain.tables.pojos.UiColumn, String>(configuration, cn.vertxup.ui.domain.tables.pojos.UiColumn.class, vertx));
    }

    @Override
    protected String getId(cn.vertxup.ui.domain.tables.pojos.UiColumn object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>DATA_INDEX IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByDataIndex(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.DATA_INDEX.in(values));
    }

    /**
     * Find records that have <code>DATA_INDEX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByDataIndex(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.DATA_INDEX.in(values), limit);
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByPosition(Collection<Integer> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.POSITION.in(values));
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByPosition(Collection<Integer> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.POSITION.in(values), limit);
    }

    /**
     * Find records that have <code>RENDER IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByRender(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.RENDER.in(values));
    }

    /**
     * Find records that have <code>RENDER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByRender(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.RENDER.in(values), limit);
    }

    /**
     * Find records that have <code>WIDTH IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByWidth(Collection<Integer> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.WIDTH.in(values));
    }

    /**
     * Find records that have <code>WIDTH IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByWidth(Collection<Integer> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.WIDTH.in(values), limit);
    }

    /**
     * Find records that have <code>FIXED IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFixed(Collection<Boolean> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.FIXED.in(values));
    }

    /**
     * Find records that have <code>FIXED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFixed(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.FIXED.in(values), limit);
    }

    /**
     * Find records that have <code>CLASS_NAME IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByClassName(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.CLASS_NAME.in(values));
    }

    /**
     * Find records that have <code>CLASS_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByClassName(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.CLASS_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>SORTER IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyBySorter(Collection<Boolean> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.SORTER.in(values));
    }

    /**
     * Find records that have <code>SORTER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyBySorter(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.SORTER.in(values), limit);
    }

    /**
     * Find records that have <code>FILTER_TYPE IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFilterType(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.FILTER_TYPE.in(values));
    }

    /**
     * Find records that have <code>FILTER_TYPE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFilterType(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.FILTER_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>FILTER_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFilterConfig(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.FILTER_CONFIG.in(values));
    }

    /**
     * Find records that have <code>FILTER_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFilterConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.FILTER_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>EMPTY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByEmpty(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.EMPTY.in(values));
    }

    /**
     * Find records that have <code>EMPTY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByEmpty(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.EMPTY.in(values), limit);
    }

    /**
     * Find records that have <code>MAPPING IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByMapping(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.MAPPING.in(values));
    }

    /**
     * Find records that have <code>MAPPING IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByMapping(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.MAPPING.in(values), limit);
    }

    /**
     * Find records that have <code>CONFIG IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByConfig(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.CONFIG.in(values));
    }

    /**
     * Find records that have <code>CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>OPTION IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByOption(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.OPTION.in(values));
    }

    /**
     * Find records that have <code>OPTION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByOption(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.OPTION.in(values), limit);
    }

    /**
     * Find records that have <code>FORMAT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFormat(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.FORMAT.in(values));
    }

    /**
     * Find records that have <code>FORMAT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByFormat(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.FORMAT.in(values), limit);
    }

    /**
     * Find records that have <code>DATUM IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByDatum(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.DATUM.in(values));
    }

    /**
     * Find records that have <code>DATUM IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByDatum(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.DATUM.in(values), limit);
    }

    /**
     * Find records that have <code>CONTROL_ID IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByControlId(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.CONTROL_ID.in(values));
    }

    /**
     * Find records that have <code>CONTROL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByControlId(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.CONTROL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(UiColumn.UI_COLUMN.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<cn.vertxup.ui.domain.tables.pojos.UiColumn>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiColumn.UI_COLUMN.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<UiColumnRecord, cn.vertxup.ui.domain.tables.pojos.UiColumn, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<UiColumnRecord, cn.vertxup.ui.domain.tables.pojos.UiColumn, String>) super.queryExecutor();
    }
}
