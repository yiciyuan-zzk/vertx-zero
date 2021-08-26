/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.RGroupRole;
import cn.vertxup.rbac.domain.tables.interfaces.IRGroupRole;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class RGroupRoleRecord extends UpdatableRecordImpl<RGroupRoleRecord> implements Record3<String, String, Integer>, IRGroupRole {

    private static final long serialVersionUID = -169166006;

    /**
     * Create a detached RGroupRoleRecord
     */
    public RGroupRoleRecord() {
        super(RGroupRole.R_GROUP_ROLE);
    }

    /**
     * Create a detached, initialised RGroupRoleRecord
     */
    public RGroupRoleRecord(String groupId, String roleId, Integer priority) {
        super(RGroupRole.R_GROUP_ROLE);

        set(0, groupId);
        set(1, roleId);
        set(2, priority);
    }

    /**
     * Getter for <code>DB_ETERNAL.R_GROUP_ROLE.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_GROUP_ROLE.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public RGroupRoleRecord setGroupId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_GROUP_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_GROUP_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public RGroupRoleRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.R_GROUP_ROLE.PRIORITY</code>. 「priority」- 角色优先级
     */
    @Override
    public Integer getPriority() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.R_GROUP_ROLE.PRIORITY</code>. 「priority」- 角色优先级
     */
    @Override
    public RGroupRoleRecord setPriority(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RGroupRole.R_GROUP_ROLE.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RGroupRole.R_GROUP_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RGroupRole.R_GROUP_ROLE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RGroupRoleRecord value1(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RGroupRoleRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RGroupRoleRecord value3(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RGroupRoleRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRGroupRole from) {
        setGroupId(from.getGroupId());
        setRoleId(from.getRoleId());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRGroupRole> E into(E into) {
        into.from(this);
        return into;
    }
}
