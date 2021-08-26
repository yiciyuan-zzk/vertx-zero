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
public interface ISView extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.KEY</code>. 「key」- 限定记录ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.KEY</code>. 「key」- 限定记录ID
     */
    public ISView setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    public ISView setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.OWNER</code>. 「owner」- 用户 / 角色ID
     */
    public String getOwner();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.OWNER</code>. 「owner」- 用户 / 角色ID
     */
    public ISView setOwner(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER 用户
     */
    public String getOwnerType();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER 用户
     */
    public ISView setOwnerType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.RESOURCE_ID</code>. 「resourceId」- 关联资源ID
     */
    public String getResourceId();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.RESOURCE_ID</code>. 「resourceId」- 关联资源ID
     */
    public ISView setResourceId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义（单用户处理）
     */
    public String getProjection();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义（单用户处理）
     */
    public ISView setProjection(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询（单用户处理）
     */
    public String getCriteria();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询（单用户处理）
     */
    public ISView setCriteria(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    public String getRows();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    public ISView setRows(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.POSITION</code>. 「position」- 当前列的顺序信息
     */
    public String getPosition();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.POSITION</code>. 「position」- 当前列的顺序信息
     */
    public ISView setPosition(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.VISITANT</code>. 「visitant」- 是否包含了视图访问者
     */
    public Boolean getVisitant();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.VISITANT</code>. 「visitant」- 是否包含了视图访问者
     */
    public ISView setVisitant(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public ISView setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISView setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    public ISView setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISView setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISView setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISView setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISView setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISView setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISView
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISView from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISView
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISView> E into(E into);

    default ISView fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setOwner(json.getString("OWNER"));
        setOwnerType(json.getString("OWNER_TYPE"));
        setResourceId(json.getString("RESOURCE_ID"));
        setProjection(json.getString("PROJECTION"));
        setCriteria(json.getString("CRITERIA"));
        setRows(json.getString("ROWS"));
        setPosition(json.getString("POSITION"));
        setVisitant(json.getBoolean("VISITANT"));
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
        json.put("OWNER", getOwner());
        json.put("OWNER_TYPE", getOwnerType());
        json.put("RESOURCE_ID", getResourceId());
        json.put("PROJECTION", getProjection());
        json.put("CRITERIA", getCriteria());
        json.put("ROWS", getRows());
        json.put("POSITION", getPosition());
        json.put("VISITANT", getVisitant());
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
