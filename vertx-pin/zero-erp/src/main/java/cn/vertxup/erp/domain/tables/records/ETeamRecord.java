/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.ETeam;
import cn.vertxup.erp.domain.tables.interfaces.IETeam;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class ETeamRecord extends UpdatableRecordImpl<ETeamRecord> implements Record16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, IETeam {

    private static final long serialVersionUID = -750482693;

    /**
     * Create a detached ETeamRecord
     */
    public ETeamRecord() {
        super(ETeam.E_TEAM);
    }

    /**
     * Create a detached, initialised ETeamRecord
     */
    public ETeamRecord(String key, String name, String code, String leaderId, String leaderName, String deptId, String teamId, String comment, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(ETeam.E_TEAM);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, leaderId);
        set(4, leaderName);
        set(5, deptId);
        set(6, teamId);
        set(7, comment);
        set(8, metadata);
        set(9, active);
        set(10, sigma);
        set(11, language);
        set(12, createdAt);
        set(13, createdBy);
        set(14, updatedAt);
        set(15, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    @Override
    public ETeamRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    @Override
    public ETeamRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    @Override
    public ETeamRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    @Override
    public String getLeaderId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    @Override
    public ETeamRecord setLeaderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    @Override
    public String getLeaderName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    @Override
    public ETeamRecord setLeaderName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public String getDeptId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public ETeamRecord setDeptId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    @Override
    public String getTeamId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    @Override
    public ETeamRecord setTeamId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    @Override
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    @Override
    public ETeamRecord setComment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ETeamRecord setMetadata(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ETeamRecord setActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public ETeamRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ETeamRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public ETeamRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ETeamRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public ETeamRecord setUpdatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ETeamRecord setUpdatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ETeam.E_TEAM.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ETeam.E_TEAM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ETeam.E_TEAM.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ETeam.E_TEAM.LEADER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ETeam.E_TEAM.LEADER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ETeam.E_TEAM.DEPT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ETeam.E_TEAM.TEAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ETeam.E_TEAM.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ETeam.E_TEAM.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return ETeam.E_TEAM.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ETeam.E_TEAM.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ETeam.E_TEAM.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return ETeam.E_TEAM.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ETeam.E_TEAM.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return ETeam.E_TEAM.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ETeam.E_TEAM.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLeaderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLeaderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDeptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTeamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component13() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component15() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLeaderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLeaderName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDeptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTeamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value15() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value4(String value) {
        setLeaderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value5(String value) {
        setLeaderName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value6(String value) {
        setDeptId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value7(String value) {
        setTeamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value8(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value9(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value10(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value11(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value15(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord value16(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ETeamRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, LocalDateTime value13, String value14, LocalDateTime value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IETeam from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setLeaderId(from.getLeaderId());
        setLeaderName(from.getLeaderName());
        setDeptId(from.getDeptId());
        setTeamId(from.getTeamId());
        setComment(from.getComment());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IETeam> E into(E into) {
        into.from(this);
        return into;
    }
}
