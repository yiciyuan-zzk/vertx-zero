/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
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
public interface IEEmployee extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    public IEEmployee setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public String getCompanyId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public IEEmployee setCompanyId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public String getDeptId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public IEEmployee setDeptId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    public String getTeamId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    public IEEmployee setTeamId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」- 关联档案
     */
    public String getIdentityId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」- 关联档案
     */
    public IEEmployee setIdentityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    public String getViceName();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    public IEEmployee setViceName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」- 员工邮箱
     */
    public String getViceEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」- 员工邮箱
     */
    public IEEmployee setViceEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」- 员工手机
     */
    public String getViceMobile();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」- 员工手机
     */
    public IEEmployee setViceMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」- 工号
     */
    public String getWorkNumber();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」- 工号
     */
    public IEEmployee setWorkNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    public String getWorkTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    public IEEmployee setWorkTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>. 「workLocation」- 办公地点
     */
    public String getWorkLocation();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>. 「workLocation」- 办公地点
     */
    public IEEmployee setWorkLocation(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」- 办公电话
     */
    public String getWorkPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」- 办公电话
     */
    public IEEmployee setWorkPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>. 「workExtension」- 分机号
     */
    public String getWorkExtension();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>. 「workExtension」- 分机号
     */
    public IEEmployee setWorkExtension(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    public IEEmployee setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    public IEEmployee setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    public IEEmployee setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public IEEmployee setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEEmployee setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IEEmployee setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IEEmployee setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IEEmployee setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IEEmployee setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IEEmployee
     */
    public void from(cn.vertxup.erp.domain.tables.interfaces.IEEmployee from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IEEmployee
     */
    public <E extends cn.vertxup.erp.domain.tables.interfaces.IEEmployee> E into(E into);

    default IEEmployee fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setCompanyId(json.getString("COMPANY_ID"));
        setDeptId(json.getString("DEPT_ID"));
        setTeamId(json.getString("TEAM_ID"));
        setIdentityId(json.getString("IDENTITY_ID"));
        setViceName(json.getString("VICE_NAME"));
        setViceEmail(json.getString("VICE_EMAIL"));
        setViceMobile(json.getString("VICE_MOBILE"));
        setWorkNumber(json.getString("WORK_NUMBER"));
        setWorkTitle(json.getString("WORK_TITLE"));
        setWorkLocation(json.getString("WORK_LOCATION"));
        setWorkPhone(json.getString("WORK_PHONE"));
        setWorkExtension(json.getString("WORK_EXTENSION"));
        setType(json.getString("TYPE"));
        setMetadata(json.getString("METADATA"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("COMPANY_ID", getCompanyId());
        json.put("DEPT_ID", getDeptId());
        json.put("TEAM_ID", getTeamId());
        json.put("IDENTITY_ID", getIdentityId());
        json.put("VICE_NAME", getViceName());
        json.put("VICE_EMAIL", getViceEmail());
        json.put("VICE_MOBILE", getViceMobile());
        json.put("WORK_NUMBER", getWorkNumber());
        json.put("WORK_TITLE", getWorkTitle());
        json.put("WORK_LOCATION", getWorkLocation());
        json.put("WORK_PHONE", getWorkPhone());
        json.put("WORK_EXTENSION", getWorkExtension());
        json.put("TYPE", getType());
        json.put("METADATA", getMetadata());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
