/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GEdge;
import cn.vertxup.graphic.domain.tables.interfaces.IGEdge;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class GEdgeRecord extends UpdatableRecordImpl<GEdgeRecord> implements Record17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGEdge {

    private static final long serialVersionUID = -1028356890;

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

        set(0, key);
        set(1, name);
        set(2, type);
        set(3, sourceKey);
        set(4, targetKey);
        set(5, graphicId);
        set(6, ui);
        set(7, recordKey);
        set(8, recordData);
        set(9, sigma);
        set(10, language);
        set(11, active);
        set(12, metadata);
        set(13, createdAt);
        set(14, createdBy);
        set(15, updatedAt);
        set(16, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    @Override
    public GEdgeRecord setKey(String value) {
        set(0, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    @Override
    public GEdgeRecord setName(String value) {
        set(1, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    @Override
    public GEdgeRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」- 拓扑图开始节点
     */
    @Override
    public String getSourceKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」- 拓扑图开始节点
     */
    @Override
    public GEdgeRecord setSourceKey(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」- 拓扑图结束节点
     */
    @Override
    public String getTargetKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」- 拓扑图结束节点
     */
    @Override
    public GEdgeRecord setTargetKey(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」- 当前关联拓扑图ID
     */
    @Override
    public String getGraphicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」- 当前关联拓扑图ID
     */
    @Override
    public GEdgeRecord setGraphicId(String value) {
        set(5, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GEdgeRecord setUi(String value) {
        set(6, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public GEdgeRecord setRecordKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    @Override
    public String getRecordData() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    @Override
    public GEdgeRecord setRecordData(String value) {
        set(8, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GEdgeRecord setSigma(String value) {
        set(9, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GEdgeRecord setLanguage(String value) {
        set(10, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GEdgeRecord setActive(Boolean value) {
        set(11, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GEdgeRecord setMetadata(String value) {
        set(12, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public GEdgeRecord setCreatedAt(LocalDateTime value) {
        set(13, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GEdgeRecord setCreatedBy(String value) {
        set(14, value);
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
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public GEdgeRecord setUpdatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GEdgeRecord setUpdatedBy(String value) {
        set(16, value);
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
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GEdge.G_EDGE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GEdge.G_EDGE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GEdge.G_EDGE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GEdge.G_EDGE.SOURCE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GEdge.G_EDGE.TARGET_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GEdge.G_EDGE.GRAPHIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GEdge.G_EDGE.UI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GEdge.G_EDGE.RECORD_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GEdge.G_EDGE.RECORD_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GEdge.G_EDGE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GEdge.G_EDGE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return GEdge.G_EDGE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return GEdge.G_EDGE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field14() {
        return GEdge.G_EDGE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return GEdge.G_EDGE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return GEdge.G_EDGE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return GEdge.G_EDGE.UPDATED_BY;
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSourceKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTargetKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRecordKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRecordData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component14() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSourceKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTargetKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRecordKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRecordData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value14() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value4(String value) {
        setSourceKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value5(String value) {
        setTargetKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value6(String value) {
        setGraphicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value7(String value) {
        setUi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value8(String value) {
        setRecordKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value9(String value) {
        setRecordData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value10(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value11(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value13(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value14(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdgeRecord value16(LocalDateTime value) {
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
    public GEdgeRecord value17(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IGEdge> E into(E into) {
        into.from(this);
        return into;
    }
}
