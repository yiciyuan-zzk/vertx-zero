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
public interface ISGroup extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.KEY</code>. 「key」- 组ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.KEY</code>. 「key」- 组ID
     */
    public ISGroup setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.NAME</code>. 「name」- 组名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.NAME</code>. 「name」- 组名称
     */
    public ISGroup setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.CODE</code>. 「code」- 组系统码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.CODE</code>. 「code」- 组系统码
     */
    public ISGroup setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.PARENT_ID</code>. 「parentId」- 父组ID（组支持树形结构，角色平行结构）
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.PARENT_ID</code>. 「parentId」- 父组ID（组支持树形结构，角色平行结构）
     */
    public ISGroup setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public ISGroup setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public ISGroup setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.CATEGORY</code>. 「category」- 组类型
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.CATEGORY</code>. 「category」- 组类型
     */
    public ISGroup setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public ISGroup setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISGroup setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.ACTIVE</code>. 「active」- 是否启用
     */
    public ISGroup setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISGroup setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISGroup setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISGroup setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISGroup setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_GROUP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_GROUP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISGroup setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISGroup
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISGroup from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISGroup
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISGroup> E into(E into);

    default ISGroup fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setParentId(json.getString("PARENT_ID"));
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
        json.put("PARENT_ID", getParentId());
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
