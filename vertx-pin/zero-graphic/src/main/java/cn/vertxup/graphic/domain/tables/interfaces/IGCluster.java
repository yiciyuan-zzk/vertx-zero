/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.interfaces;


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
public interface IGCluster extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.KEY</code>. 「key」- 组ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.KEY</code>. 「key」- 组ID
     */
    public IGCluster setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.NAME</code>. 「name」- 组呈现名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.NAME</code>. 「name」- 组呈现名称
     */
    public IGCluster setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.X</code>. 「x」- 当前组在图上的x坐标
     */
    public Integer getX();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.X</code>. 「x」- 当前组在图上的x坐标
     */
    public IGCluster setX(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.Y</code>. 「y」- 当前组在图上的y坐标
     */
    public Integer getY();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.Y</code>. 「y」- 当前组在图上的y坐标
     */
    public IGCluster setY(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.GRAPHIC_ID</code>. 「graphicId」- 它所关联的图实例ID
     */
    public String getGraphicId();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.GRAPHIC_ID</code>. 「graphicId」- 它所关联的图实例ID
     */
    public IGCluster setGraphicId(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UI</code>. 「ui」- ui配置专用
     */
    public String getUi();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UI</code>. 「ui」- ui配置专用
     */
    public IGCluster setUi(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public String getRecordKey();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public IGCluster setRecordKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public String getRecordData();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public IGCluster setRecordData(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.SIGMA</code>. 「sigma」- 统一标识
     */
    public IGCluster setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IGCluster setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.ACTIVE</code>. 「active」- 是否启用
     */
    public IGCluster setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IGCluster setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IGCluster setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IGCluster setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IGCluster setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IGCluster setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGCluster
     */
    public void from(cn.vertxup.graphic.domain.tables.interfaces.IGCluster from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGCluster
     */
    public <E extends cn.vertxup.graphic.domain.tables.interfaces.IGCluster> E into(E into);

    default IGCluster fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setX(json.getInteger("X"));
        setY(json.getInteger("Y"));
        setGraphicId(json.getString("GRAPHIC_ID"));
        setUi(json.getString("UI"));
        setRecordKey(json.getString("RECORD_KEY"));
        setRecordData(json.getString("RECORD_DATA"));
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
        json.put("X", getX());
        json.put("Y", getY());
        json.put("GRAPHIC_ID", getGraphicId());
        json.put("UI", getUi());
        json.put("RECORD_KEY", getRecordKey());
        json.put("RECORD_DATA", getRecordData());
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
