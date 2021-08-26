/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.RUserRole;
import cn.vertxup.rbac.domain.tables.records.RUserRoleRecord;
import io.github.jklingsporn.vertx.jooq.future.VertxDAO;
import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RUserRoleDao extends DAOImpl<RUserRoleRecord, cn.vertxup.rbac.domain.tables.pojos.RUserRole, Record2<String, String>> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.RUserRoleRecord, cn.vertxup.rbac.domain.tables.pojos.RUserRole, org.jooq.Record2<java.lang.String, java.lang.String>> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new RUserRoleDao without any configuration
     */
    public RUserRoleDao() {
        super(RUserRole.R_USER_ROLE, cn.vertxup.rbac.domain.tables.pojos.RUserRole.class);
    }

    /**
     * Create a new RUserRoleDao with an attached configuration
     */
    public RUserRoleDao(Configuration configuration) {
        super(RUserRole.R_USER_ROLE, cn.vertxup.rbac.domain.tables.pojos.RUserRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(cn.vertxup.rbac.domain.tables.pojos.RUserRole object) {
        return compositeKeyRecord(object.getUserId(), object.getRoleId());
    }

    /**
     * Fetch records that have <code>USER_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.RUserRole> fetchByUserId(String... values) {
        return fetch(RUserRole.R_USER_ROLE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.RUserRole> fetchByRoleId(String... values) {
        return fetch(RUserRole.R_USER_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>PRIORITY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.RUserRole> fetchByPriority(Integer... values) {
        return fetch(RUserRole.R_USER_ROLE.PRIORITY, values);
    }

    /**
     * Fetch records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.RUserRole>> fetchByUserIdAsync(List<String> values) {
        return fetchAsync(RUserRole.R_USER_ROLE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.RUserRole>> fetchByRoleIdAsync(List<String> values) {
        return fetchAsync(RUserRole.R_USER_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>PRIORITY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.RUserRole>> fetchByPriorityAsync(List<Integer> values) {
        return fetchAsync(RUserRole.R_USER_ROLE.PRIORITY, values);
    }

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
