/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GEdge;
import cn.vertxup.graphic.domain.tables.interfaces.IGEdge;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GEdgeRecord extends UpdatableRecordImpl<GEdgeRecord> implements VertxPojo, Record17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGEdge {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    @Override
    public GEdgeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    @Override
    public GEdgeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    @Override
    public GEdgeRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」-
     * 拓扑图开始节点
     */
    @Override
    public GEdgeRecord setSourceKey(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」-
     * 拓扑图开始节点
     */
    @Override
    public String getSourceKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」-
     * 拓扑图结束节点
     */
    @Override
    public GEdgeRecord setTargetKey(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」-
     * 拓扑图结束节点
     */
    @Override
    public String getTargetKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」-
     * 当前关联拓扑图ID
     */
    @Override
    public GEdgeRecord setGraphicId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」-
     * 当前关联拓扑图ID
     */
    @Override
    public String getGraphicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GEdgeRecord setUi(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public String getUi() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public GEdgeRecord setRecordKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public String getRecordKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」-
     * 组中存储的数据信息
     */
    @Override
    public GEdgeRecord setRecordData(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」-
     * 组中存储的数据信息
     */
    @Override
    public String getRecordData() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GEdgeRecord setSigma(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GEdgeRecord setLanguage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GEdgeRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GEdgeRecord setMetadata(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public GEdgeRecord setCreatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GEdgeRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public GEdgeRecord setUpdatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GEdgeRecord setUpdatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GEdge.G_EDGE.KEY;
    }

    @Override
    public Field<String> field2() {
        return GEdge.G_EDGE.NAME;
    }

    @Override
    public Field<String> field3() {
        return GEdge.G_EDGE.TYPE;
    }

    @Override
    public Field<String> field4() {
        return GEdge.G_EDGE.SOURCE_KEY;
    }

    @Override
    public Field<String> field5() {
        return GEdge.G_EDGE.TARGET_KEY;
    }

    @Override
    public Field<String> field6() {
        return GEdge.G_EDGE.GRAPHIC_ID;
    }

    @Override
    public Field<String> field7() {
        return GEdge.G_EDGE.UI;
    }

    @Override
    public Field<String> field8() {
        return GEdge.G_EDGE.RECORD_KEY;
    }

    @Override
    public Field<String> field9() {
        return GEdge.G_EDGE.RECORD_DATA;
    }

    @Override
    public Field<String> field10() {
        return GEdge.G_EDGE.SIGMA;
    }

    @Override
    public Field<String> field11() {
        return GEdge.G_EDGE.LANGUAGE;
    }

    @Override
    public Field<Boolean> field12() {
        return GEdge.G_EDGE.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return GEdge.G_EDGE.METADATA;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return GEdge.G_EDGE.CREATED_AT;
    }

    @Override
    public Field<String> field15() {
        return GEdge.G_EDGE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return GEdge.G_EDGE.UPDATED_AT;
    }

    @Override
    public Field<String> field17() {
        return GEdge.G_EDGE.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getSourceKey();
    }

    @Override
    public String component5() {
        return getTargetKey();
    }

    @Override
    public String component6() {
        return getGraphicId();
    }

    @Override
    public String component7() {
        return getUi();
    }

    @Override
    public String component8() {
        return getRecordKey();
    }

    @Override
    public String component9() {
        return getRecordData();
    }

    @Override
    public String component10() {
        return getSigma();
    }

    @Override
    public String component11() {
        return getLanguage();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedAt();
    }

    @Override
    public String component15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getUpdatedAt();
    }

    @Override
    public String component17() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getSourceKey();
    }

    @Override
    public String value5() {
        return getTargetKey();
    }

    @Override
    public String value6() {
        return getGraphicId();
    }

    @Override
    public String value7() {
        return getUi();
    }

    @Override
    public String value8() {
        return getRecordKey();
    }

    @Override
    public String value9() {
        return getRecordData();
    }

    @Override
    public String value10() {
        return getSigma();
    }

    @Override
    public String value11() {
        return getLanguage();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedAt();
    }

    @Override
    public String value15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getUpdatedAt();
    }

    @Override
    public String value17() {
        return getUpdatedBy();
    }

    @Override
    public GEdgeRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public GEdgeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GEdgeRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public GEdgeRecord value4(String value) {
        setSourceKey(value);
        return this;
    }

    @Override
    public GEdgeRecord value5(String value) {
        setTargetKey(value);
        return this;
    }

    @Override
    public GEdgeRecord value6(String value) {
        setGraphicId(value);
        return this;
    }

    @Override
    public GEdgeRecord value7(String value) {
        setUi(value);
        return this;
    }

    @Override
    public GEdgeRecord value8(String value) {
        setRecordKey(value);
        return this;
    }

    @Override
    public GEdgeRecord value9(String value) {
        setRecordData(value);
        return this;
    }

    @Override
    public GEdgeRecord value10(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public GEdgeRecord value11(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public GEdgeRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public GEdgeRecord value13(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public GEdgeRecord value14(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public GEdgeRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GEdgeRecord value16(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public GEdgeRecord value17(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public GEdgeRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13, LocalDateTime value14, String value15, LocalDateTime value16, String value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IGEdge from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setSourceKey(from.getSourceKey());
        setTargetKey(from.getTargetKey());
        setGraphicId(from.getGraphicId());
        setUi(from.getUi());
        setRecordKey(from.getRecordKey());
        setRecordData(from.getRecordData());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IGEdge> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GEdgeRecord
     */
    public GEdgeRecord() {
        super(GEdge.G_EDGE);
    }

    /**
     * Create a detached, initialised GEdgeRecord
     */
    public GEdgeRecord(String key, String name, String type, String sourceKey, String targetKey, String graphicId, String ui, String recordKey, String recordData, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(GEdge.G_EDGE);

        setKey(key);
        setName(name);
        setType(type);
        setSourceKey(sourceKey);
        setTargetKey(targetKey);
        setGraphicId(graphicId);
        setUi(ui);
        setRecordKey(recordKey);
        setRecordData(recordData);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised GEdgeRecord
     */
    public GEdgeRecord(cn.vertxup.graphic.domain.tables.pojos.GEdge value) {
        super(GEdge.G_EDGE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setType(value.getType());
            setSourceKey(value.getSourceKey());
            setTargetKey(value.getTargetKey());
            setGraphicId(value.getGraphicId());
            setUi(value.getUi());
            setRecordKey(value.getRecordKey());
            setRecordData(value.getRecordData());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

    public GEdgeRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
