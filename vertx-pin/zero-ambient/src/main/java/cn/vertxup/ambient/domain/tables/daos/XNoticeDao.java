/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XNotice;
import cn.vertxup.ambient.domain.tables.records.XNoticeRecord;

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
public class XNoticeDao extends AbstractVertxDAO<XNoticeRecord, cn.vertxup.ambient.domain.tables.pojos.XNotice, String, Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>>, Future<cn.vertxup.ambient.domain.tables.pojos.XNotice>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XNoticeRecord,cn.vertxup.ambient.domain.tables.pojos.XNotice,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public XNoticeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XNotice.X_NOTICE, cn.vertxup.ambient.domain.tables.pojos.XNotice.class, new JDBCClassicQueryExecutor<XNoticeRecord,cn.vertxup.ambient.domain.tables.pojos.XNotice,String>(configuration,cn.vertxup.ambient.domain.tables.pojos.XNotice.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ambient.domain.tables.pojos.XNotice object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByName(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCode(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByType(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyBySubject(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.SUBJECT.in(values));
        }

        /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyBySubject(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.SUBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByContent(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.CONTENT.in(values));
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByContent(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XNotice.X_NOTICE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XNotice.X_NOTICE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XNotice.X_NOTICE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XNotice.X_NOTICE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ambient.domain.tables.pojos.XNotice>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XNotice.X_NOTICE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XNoticeRecord,cn.vertxup.ambient.domain.tables.pojos.XNotice,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XNoticeRecord,cn.vertxup.ambient.domain.tables.pojos.XNotice,String>) super.queryExecutor();
        }
}
