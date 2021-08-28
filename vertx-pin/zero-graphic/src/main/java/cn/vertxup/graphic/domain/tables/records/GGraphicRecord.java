/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GGraphic;
import cn.vertxup.graphic.domain.tables.interfaces.IGGraphic;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class GGraphicRecord extends UpdatableRecordImpl<GGraphicRecord> implements Record21<String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGGraphic {

    private static final long serialVersionUID = 848731869;

    /**
     * Create a detached GGraphicRecord
     */
    public GGraphicRecord() {
        super(GGraphic.G_GRAPHIC);
    }

    /**
     * Create a detached, initialised GGraphicRecord
     */
    public GGraphicRecord(String key, String name, String code, String mode, String type, String comments, String ownerId, String ui, String graphicId, Boolean master, String modelId, String modelKey, String modelCategory, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(GGraphic.G_GRAPHIC);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, mode);
        set(4, type);
        set(5, comments);
        set(6, ownerId);
        set(7, ui);
        set(8, graphicId);
        set(9, master);
        set(10, modelId);
        set(11, modelKey);
        set(12, modelCategory);
        set(13, sigma);
        set(14, language);
        set(15, active);
        set(16, metadata);
        set(17, createdAt);
        set(18, createdBy);
        set(19, updatedAt);
        set(20, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.KEY</code>. 「key」- 图ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.KEY</code>. 「key」- 图ID
     */
    @Override
    public GGraphicRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.NAME</code>. 「name」- 图名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.NAME</code>. 「name」- 图名称
     */
    @Override
    public GGraphicRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CODE</code>. 「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CODE</code>. 「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）
     */
    @Override
    public GGraphicRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODE</code>. 「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE
     */
    @Override
    public String getMode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODE</code>. 「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE
     */
    @Override
    public GGraphicRecord setMode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.TYPE</code>. 「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.TYPE</code>. 「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular
     */
    @Override
    public GGraphicRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.COMMENTS</code>. 「comments」- 图备注信息
     */
    @Override
    public String getComments() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.COMMENTS</code>. 「comments」- 图备注信息
     */
    @Override
    public GGraphicRecord setComments(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.OWNER_ID</code>. 「ownerId」- 图的拥有者，可管理该图信息的人员ID
     */
    @Override
    public String getOwnerId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.OWNER_ID</code>. 「ownerId」- 图的拥有者，可管理该图信息的人员ID
     */
    @Override
    public GGraphicRecord setOwnerId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public String getUi() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GGraphicRecord setUi(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.GRAPHIC_ID</code>. 「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）
     */
    @Override
    public String getGraphicId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.GRAPHIC_ID</code>. 「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）
     */
    @Override
    public GGraphicRecord setGraphicId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MASTER</code>. 「master」- 主图（不可删除、父ID为NULL、模块级唯一）
     */
    @Override
    public Boolean getMaster() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MASTER</code>. 「master」- 主图（不可删除、父ID为NULL、模块级唯一）
     */
    @Override
    public GGraphicRecord setMaster(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    @Override
    public GGraphicRecord setModelId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public GGraphicRecord setModelKey(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public String getModelCategory() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public GGraphicRecord setModelCategory(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GGraphicRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GGraphicRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GGraphicRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GGraphicRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public GGraphicRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GGraphicRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public GGraphicRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GGraphicRecord setUpdatedBy(String value) {
        set(20, value);
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
    public Row21<String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GGraphic.G_GRAPHIC.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GGraphic.G_GRAPHIC.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GGraphic.G_GRAPHIC.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GGraphic.G_GRAPHIC.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GGraphic.G_GRAPHIC.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GGraphic.G_GRAPHIC.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GGraphic.G_GRAPHIC.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GGraphic.G_GRAPHIC.UI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GGraphic.G_GRAPHIC.GRAPHIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return GGraphic.G_GRAPHIC.MASTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GGraphic.G_GRAPHIC.MODEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GGraphic.G_GRAPHIC.MODEL_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return GGraphic.G_GRAPHIC.MODEL_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return GGraphic.G_GRAPHIC.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return GGraphic.G_GRAPHIC.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return GGraphic.G_GRAPHIC.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return GGraphic.G_GRAPHIC.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return GGraphic.G_GRAPHIC.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return GGraphic.G_GRAPHIC.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field20() {
        return GGraphic.G_GRAPHIC.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return GGraphic.G_GRAPHIC.UPDATED_BY;
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
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getMaster();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getModelKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getModelCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
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
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getMaster();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getModelKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getModelCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value4(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value6(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value7(String value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value8(String value) {
        setUi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value9(String value) {
        setGraphicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value10(Boolean value) {
        setMaster(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value11(String value) {
        setModelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value12(String value) {
        setModelKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value13(String value) {
        setModelCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value14(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value16(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord value20(LocalDateTime value) {
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
    public GGraphicRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphicRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IGGraphic from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setMode(from.getMode());
        setType(from.getType());
        setComments(from.getComments());
        setOwnerId(from.getOwnerId());
        setUi(from.getUi());
        setGraphicId(from.getGraphicId());
        setMaster(from.getMaster());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
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
    public <E extends IGGraphic> E into(E into) {
        into.from(this);
        return into;
    }
}
