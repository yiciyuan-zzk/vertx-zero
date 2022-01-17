/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiVisitor;
import cn.vertxup.ui.domain.tables.records.UiVisitorRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record5;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UiVisitorDao extends AbstractVertxDAO<UiVisitorRecord, cn.vertxup.ui.domain.tables.pojos.UiVisitor, Record5<String, String, String, String, String>, Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>>, Future<cn.vertxup.ui.domain.tables.pojos.UiVisitor>, Future<Integer>, Future<Record5<String, String, String, String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiVisitorRecord,cn.vertxup.ui.domain.tables.pojos.UiVisitor,Record5<String, String, String, String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public UiVisitorDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(UiVisitor.UI_VISITOR, cn.vertxup.ui.domain.tables.pojos.UiVisitor.class, new JDBCClassicQueryExecutor<UiVisitorRecord,cn.vertxup.ui.domain.tables.pojos.UiVisitor,Record5<String, String, String, String, String>>(configuration,cn.vertxup.ui.domain.tables.pojos.UiVisitor.class,vertx));
        }

        @Override
        protected Record5<String, String, String, String, String> getId(cn.vertxup.ui.domain.tables.pojos.UiVisitor object) {
                return compositeKeyRecord(object.getIdentifier(), object.getPage(), object.getPath(), object.getType(), object.getSigma());
        }

        /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByPage(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.PAGE.in(values));
        }

        /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByPage(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.PAGE.in(values),limit);
        }

        /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByPath(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.PATH.in(values));
        }

        /**
     * Find records that have <code>PATH IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByPath(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.PATH.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByType(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>CONTROL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByControlId(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.CONTROL_ID.in(values));
        }

        /**
     * Find records that have <code>CONTROL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByControlId(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.CONTROL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByResourceId(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.RESOURCE_ID.in(values));
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByResourceId(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.RESOURCE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByRunComponent(Collection<String> values) {
                return findManyByCondition(UiVisitor.UI_VISITOR.RUN_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiVisitor>> findManyByRunComponent(Collection<String> values, int limit) {
                return findManyByCondition(UiVisitor.UI_VISITOR.RUN_COMPONENT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<UiVisitorRecord,cn.vertxup.ui.domain.tables.pojos.UiVisitor,Record5<String, String, String, String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<UiVisitorRecord,cn.vertxup.ui.domain.tables.pojos.UiVisitor,Record5<String, String, String, String, String>>) super.queryExecutor();
        }
}
