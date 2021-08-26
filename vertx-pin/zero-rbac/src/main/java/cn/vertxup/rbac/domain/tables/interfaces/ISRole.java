/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


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
public interface ISRole extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.KEY</code>. 「key」- 角色ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.KEY</code>. 「key」- 角色ID
     */
    public ISRole setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.NAME</code>. 「name」- 角色名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.NAME</code>. 「name」- 角色名称
     */
    public ISRole setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CODE</code>. 「code」- 角色系统名
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CODE</code>. 「code」- 角色系统名
     */
    public ISRole setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.POWER</code>. 「power」- 是否具有定制权限？
     */
    public Boolean getPower();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.POWER</code>. 「power」- 是否具有定制权限？
     */
    public ISRole setPower(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.COMMENT</code>. 「comment」- 角色备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.COMMENT</code>. 「comment」- 角色备注信息
     */
    public ISRole setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public ISRole setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public ISRole setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CATEGORY</code>. 「category」- 组类型
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CATEGORY</code>. 「category」- 组类型
     */
    public ISRole setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISRole setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISRole setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.ACTIVE</code>. 「active」- 是否启用
     */
    public ISRole setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISRole setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISRole setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISRole setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISRole setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISRole setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISRole
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISRole from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISRole
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISRole> E into(E into);

    default ISRole fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setPower(json.getBoolean("POWER"));
        setComment(json.getString("COMMENT"));
        setModelId(json.getString("MODEL_ID"));
        setModelKey(json.getString("MODEL_KEY"));
        setCategory(json.getString("CATEGORY"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("POWER", getPower());
        json.put("COMMENT", getComment());
        json.put("MODEL_ID", getModelId());
        json.put("MODEL_KEY", getModelKey());
        json.put("CATEGORY", getCategory());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
