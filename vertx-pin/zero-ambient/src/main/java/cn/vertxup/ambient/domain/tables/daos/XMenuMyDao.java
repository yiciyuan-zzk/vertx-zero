/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XMenuMy;
import cn.vertxup.ambient.domain.tables.records.XMenuMyRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

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
public class XMenuMyDao extends AbstractVertxDAO<XMenuMyRecord, cn.vertxup.ambient.domain.tables.pojos.XMenuMy, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>>, Future<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XMenuMyRecord,cn.vertxup.ambient.domain.tables.pojos.XMenuMy,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public XMenuMyDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XMenuMy.X_MENU_MY, cn.vertxup.ambient.domain.tables.pojos.XMenuMy.class, new JDBCClassicQueryExecutor<XMenuMyRecord,cn.vertxup.ambient.domain.tables.pojos.XMenuMy,String>(configuration,cn.vertxup.ambient.domain.tables.pojos.XMenuMy.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ambient.domain.tables.pojos.XMenuMy object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByIcon(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.ICON.in(values));
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByIcon(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.ICON.in(values),limit);
        }

        /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByText(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.TEXT.in(values));
        }

        /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByText(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.TEXT.in(values),limit);
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUri(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.URI.in(values));
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUri(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.URI.in(values),limit);
        }

        /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiSort(Collection<Long> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_SORT.in(values));
        }

        /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiSort(Collection<Long> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_SORT.in(values),limit);
        }

        /**
     * Find records that have <code>UI_PARENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiParent(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_PARENT.in(values));
        }

        /**
     * Find records that have <code>UI_PARENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiParent(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_PARENT.in(values),limit);
        }

        /**
     * Find records that have <code>UI_COLOR_FG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiColorFg(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_COLOR_FG.in(values));
        }

        /**
     * Find records that have <code>UI_COLOR_FG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiColorFg(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_COLOR_FG.in(values),limit);
        }

        /**
     * Find records that have <code>UI_COLOR_BG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiColorBg(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_COLOR_BG.in(values));
        }

        /**
     * Find records that have <code>UI_COLOR_BG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUiColorBg(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UI_COLOR_BG.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByType(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByPage(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.PAGE.in(values));
        }

        /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByPage(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.PAGE.in(values),limit);
        }

        /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByPosition(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.POSITION.in(values));
        }

        /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByPosition(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.POSITION.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByOwner(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.OWNER.in(values));
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByOwner(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.OWNER.in(values),limit);
        }

        /**
     * Find records that have <code>PARAMETER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByParameter(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.PARAMETER.in(values));
        }

        /**
     * Find records that have <code>PARAMETER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByParameter(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.PARAMETER.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XMenuMy>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XMenuMy.X_MENU_MY.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XMenuMyRecord,cn.vertxup.ambient.domain.tables.pojos.XMenuMy,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XMenuMyRecord,cn.vertxup.ambient.domain.tables.pojos.XMenuMy,String>) super.queryExecutor();
        }
}
