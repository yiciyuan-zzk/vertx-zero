/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiField;
import cn.vertxup.ui.domain.tables.interfaces.IUiField;
import org.jooq.Record1;
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
public class UiFieldRecord extends UpdatableRecordImpl<UiFieldRecord> implements IUiField {

    private static final long serialVersionUID = 898460415;

    /**
     * Create a detached UiFieldRecord
     */
    public UiFieldRecord() {
        super(UiField.UI_FIELD);
    }

    /**
     * Create a detached, initialised UiFieldRecord
     */
    public UiFieldRecord(String key, Integer xPoint, Integer yPoint, String label, String name, Integer span, Boolean hidden, String render, String container, String optionJsx, String optionConfig, String optionItem, String rules, String controlId, String rowType, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiField.UI_FIELD);

        set(0, key);
        set(1, xPoint);
        set(2, yPoint);
        set(3, label);
        set(4, name);
        set(5, span);
        set(6, hidden);
        set(7, render);
        set(8, container);
        set(9, optionJsx);
        set(10, optionConfig);
        set(11, optionItem);
        set(12, rules);
        set(13, controlId);
        set(14, rowType);
        set(15, active);
        set(16, sigma);
        set(17, metadata);
        set(18, language);
        set(19, createdAt);
        set(20, createdBy);
        set(21, updatedAt);
        set(22, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.KEY</code>. 「key」- 字段主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.KEY</code>. 「key」- 字段主键
     */
    @Override
    public UiFieldRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.X_POINT</code>. 「xPoint] - 字段的X坐标（列）
     */
    @Override
    public Integer getXPoint() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.X_POINT</code>. 「xPoint] - 字段的X坐标（列）
     */
    @Override
    public UiFieldRecord setXPoint(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.Y_POINT</code>. 「yPoint」- 字段的Y坐标（行）
     */
    @Override
    public Integer getYPoint() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.Y_POINT</code>. 「yPoint」- 字段的Y坐标（行）
     */
    @Override
    public UiFieldRecord setYPoint(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.LABEL</code>. 「label」- 字段标签
     */
    @Override
    public String getLabel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.LABEL</code>. 「label」- 字段标签
     */
    @Override
    public UiFieldRecord setLabel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.NAME</code>. 「name」- 字段名称
     */
    @Override
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.NAME</code>. 「name」- 字段名称
     */
    @Override
    public UiFieldRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.SPAN</code>. 「span」- 字段宽度
     */
    @Override
    public Integer getSpan() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.SPAN</code>. 「span」- 字段宽度
     */
    @Override
    public UiFieldRecord setSpan(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.HIDDEN</code>. 「hidden」- button专用
     */
    @Override
    public Boolean getHidden() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.HIDDEN</code>. 「hidden」- button专用
     */
    @Override
    public UiFieldRecord setHidden(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.RENDER</code>. 「render」- 使用的Render函数
     */
    @Override
    public String getRender() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.RENDER</code>. 「render」- 使用的Render函数
     */
    @Override
    public UiFieldRecord setRender(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.CONTAINER</code>. 「container」- 容器字段专用容器信息，映射到 name 中
     */
    @Override
    public String getContainer() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.CONTAINER</code>. 「container」- 容器字段专用容器信息，映射到 name 中
     */
    @Override
    public UiFieldRecord setContainer(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.OPTION_JSX</code>. 「optionJsx」- 字段专用配置
     */
    @Override
    public String getOptionJsx() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.OPTION_JSX</code>. 「optionJsx」- 字段专用配置
     */
    @Override
    public UiFieldRecord setOptionJsx(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.OPTION_CONFIG</code>. 「optionConfig」- 字段专用配置
     */
    @Override
    public String getOptionConfig() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.OPTION_CONFIG</code>. 「optionConfig」- 字段专用配置
     */
    @Override
    public UiFieldRecord setOptionConfig(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.OPTION_ITEM</code>. 「optionItem」- 字段专用配置
     */
    @Override
    public String getOptionItem() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.OPTION_ITEM</code>. 「optionItem」- 字段专用配置
     */
    @Override
    public UiFieldRecord setOptionItem(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.RULES</code>. 「rules」- optionConfig.rules 验证专用的配置，描述规则
     */
    @Override
    public String getRules() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.RULES</code>. 「rules」- optionConfig.rules 验证专用的配置，描述规则
     */
    @Override
    public UiFieldRecord setRules(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.CONTROL_ID</code>. 「controlId」- 关联的表单ID
     */
    @Override
    public String getControlId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.CONTROL_ID</code>. 「controlId」- 关联的表单ID
     */
    @Override
    public UiFieldRecord setControlId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.ROW_TYPE</code>. 「rowType」- 行类型
     */
    @Override
    public String getRowType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.ROW_TYPE</code>. 「rowType」- 行类型
     */
    @Override
    public UiFieldRecord setRowType(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiFieldRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiFieldRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiFieldRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiFieldRecord setLanguage(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiFieldRecord setCreatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiFieldRecord setCreatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiFieldRecord setUpdatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.UI_FIELD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.UI_FIELD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiFieldRecord setUpdatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUiField from) {
        setKey(from.getKey());
        setXPoint(from.getXPoint());
        setYPoint(from.getYPoint());
        setLabel(from.getLabel());
        setName(from.getName());
        setSpan(from.getSpan());
        setHidden(from.getHidden());
        setRender(from.getRender());
        setContainer(from.getContainer());
        setOptionJsx(from.getOptionJsx());
        setOptionConfig(from.getOptionConfig());
        setOptionItem(from.getOptionItem());
        setRules(from.getRules());
        setControlId(from.getControlId());
        setRowType(from.getRowType());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
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
    public <E extends IUiField> E into(E into) {
        into.from(this);
        return into;
    }
}
