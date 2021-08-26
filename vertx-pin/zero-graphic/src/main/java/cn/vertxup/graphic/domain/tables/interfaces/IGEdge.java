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
public interface IGEdge extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    public IGEdge setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    public IGEdge setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    public IGEdge setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」- 拓扑图开始节点
     */
    public String getSourceKey();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」- 拓扑图开始节点
     */
    public IGEdge setSourceKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」- 拓扑图结束节点
     */
    public String getTargetKey();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」- 拓扑图结束节点
     */
    public IGEdge setTargetKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」- 当前关联拓扑图ID
     */
    public String getGraphicId();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」- 当前关联拓扑图ID
     */
    public IGEdge setGraphicId(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    public String getUi();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    public IGEdge setUi(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public String getRecordKey();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public IGEdge setRecordKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public String getRecordData();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public IGEdge setRecordData(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IGEdge setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IGEdge setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    public IGEdge setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IGEdge setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IGEdge setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IGEdge setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IGEdge setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IGEdge setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGEdge
     */
    public void from(cn.vertxup.graphic.domain.tables.interfaces.IGEdge from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGEdge
     */
    public <E extends cn.vertxup.graphic.domain.tables.interfaces.IGEdge> E into(E into);

    default IGEdge fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setType(json.getString("TYPE"));
        setSourceKey(json.getString("SOURCE_KEY"));
        setTargetKey(json.getString("TARGET_KEY"));
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
        json.put("TYPE", getType());
        json.put("SOURCE_KEY", getSourceKey());
        json.put("TARGET_KEY", getTargetKey());
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
