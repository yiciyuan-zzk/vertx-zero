/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.VTable;
import cn.vertxup.ui.domain.tables.interfaces.IVTable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class VTableRecord extends UpdatableRecordImpl<VTableRecord> implements Record15<String, Boolean, String, String, String, String, String, String, String, String, String, String, String, Boolean, String>, IVTable {

    private static final long serialVersionUID = -77756117;

    /**
     * Create a detached VTableRecord
     */
    public VTableRecord() {
        super(VTable.V_TABLE);
    }

    /**
     * Create a detached, initialised VTableRecord
     */
    public VTableRecord(String key, Boolean bordered, String size, String className, String totalReport, String totalSelected, String rowDoubleClick, String rowClick, String rowContextMenu, String rowMouseEnter, String rowMouseLeave, String opTitle, String opDataIndex, Boolean opFixed, String opConfig) {
        super(VTable.V_TABLE);

        set(0, key);
        set(1, bordered);
        set(2, size);
        set(3, className);
        set(4, totalReport);
        set(5, totalSelected);
        set(6, rowDoubleClick);
        set(7, rowClick);
        set(8, rowContextMenu);
        set(9, rowMouseEnter);
        set(10, rowMouseLeave);
        set(11, opTitle);
        set(12, opDataIndex);
        set(13, opFixed);
        set(14, opConfig);
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.KEY</code>. 「key」- 表选项主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.KEY</code>. 「key」- 表选项主键
     */
    @Override
    public VTableRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.BORDERED</code>. 「bordered」- 是否带表框
     */
    @Override
    public Boolean getBordered() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.BORDERED</code>. 「bordered」- 是否带表框
     */
    @Override
    public VTableRecord setBordered(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.SIZE</code>. 「size」- 表格尺寸
     */
    @Override
    public String getSize() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.SIZE</code>. 「size」- 表格尺寸
     */
    @Override
    public VTableRecord setSize(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.CLASS_NAME</code>. 「className」- CSS属性
     */
    @Override
    public String getClassName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.CLASS_NAME</code>. 「className」- CSS属性
     */
    @Override
    public VTableRecord setClassName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.TOTAL_REPORT</code>. 「totalReport」- total.report - 文字: 总共多少条统计
     */
    @Override
    public String getTotalReport() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.TOTAL_REPORT</code>. 「totalReport」- total.report - 文字: 总共多少条统计
     */
    @Override
    public VTableRecord setTotalReport(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.TOTAL_SELECTED</code>. 「totalSelected」- total.selected - 文字: 选择了多少条
     */
    @Override
    public String getTotalSelected() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.TOTAL_SELECTED</code>. 「totalSelected」- total.selected - 文字: 选择了多少条
     */
    @Override
    public VTableRecord setTotalSelected(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.ROW_DOUBLE_CLICK</code>. 「rowDoubleClick」- row.onDoubleClick - 双击事件名
     */
    @Override
    public String getRowDoubleClick() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.ROW_DOUBLE_CLICK</code>. 「rowDoubleClick」- row.onDoubleClick - 双击事件名
     */
    @Override
    public VTableRecord setRowDoubleClick(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.ROW_CLICK</code>. 「rowClick」- row.onClick - 单击事件名
     */
    @Override
    public String getRowClick() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.ROW_CLICK</code>. 「rowClick」- row.onClick - 单击事件名
     */
    @Override
    public VTableRecord setRowClick(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.ROW_CONTEXT_MENU</code>. 「rowContextMenu」- row.onContextMenu - 右键菜单事件名
     */
    @Override
    public String getRowContextMenu() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.ROW_CONTEXT_MENU</code>. 「rowContextMenu」- row.onContextMenu - 右键菜单事件名
     */
    @Override
    public VTableRecord setRowContextMenu(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.ROW_MOUSE_ENTER</code>. 「rowMouseEnter」- row.onMouseEnter - 鼠标左键事件名
     */
    @Override
    public String getRowMouseEnter() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.ROW_MOUSE_ENTER</code>. 「rowMouseEnter」- row.onMouseEnter - 鼠标左键事件名
     */
    @Override
    public VTableRecord setRowMouseEnter(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.ROW_MOUSE_LEAVE</code>. 「rowMouseLeave」- row.onMouseLeave - 鼠标移开事件名
     */
    @Override
    public String getRowMouseLeave() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.ROW_MOUSE_LEAVE</code>. 「rowMouseLeave」- row.onMouseLeave - 鼠标移开事件名
     */
    @Override
    public VTableRecord setRowMouseLeave(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.OP_TITLE</code>. 「opTitle」- columns/[0]/title, 执行列标题
     */
    @Override
    public String getOpTitle() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.OP_TITLE</code>. 「opTitle」- columns/[0]/title, 执行列标题
     */
    @Override
    public VTableRecord setOpTitle(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.OP_DATA_INDEX</code>. 「opDataIndex」- columns/[0]/dataIndex, 执行列标题
     */
    @Override
    public String getOpDataIndex() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.OP_DATA_INDEX</code>. 「opDataIndex」- columns/[0]/dataIndex, 执行列标题
     */
    @Override
    public VTableRecord setOpDataIndex(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.OP_FIXED</code>. 「opFixed」- columns/[0]/fixed，执行列左还是右
     */
    @Override
    public Boolean getOpFixed() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.OP_FIXED</code>. 「opFixed」- columns/[0]/fixed，执行列左还是右
     */
    @Override
    public VTableRecord setOpFixed(Boolean value) {
        set(13, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.V_TABLE.OP_CONFIG</code>. 「opConfig」- columns/[0]/$option, 执行类对应配置，配置按钮
     */
    @Override
    public String getOpConfig() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.V_TABLE.OP_CONFIG</code>. 「opConfig」- columns/[0]/$option, 执行类对应配置，配置按钮
     */
    @Override
    public VTableRecord setOpConfig(String value) {
        set(14, value);
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
    public Row15<String, Boolean, String, String, String, String, String, String, String, String, String, String, String, Boolean, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Boolean, String, String, String, String, String, String, String, String, String, String, String, Boolean, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return VTable.V_TABLE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return VTable.V_TABLE.BORDERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VTable.V_TABLE.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VTable.V_TABLE.CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VTable.V_TABLE.TOTAL_REPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return VTable.V_TABLE.TOTAL_SELECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return VTable.V_TABLE.ROW_DOUBLE_CLICK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return VTable.V_TABLE.ROW_CLICK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return VTable.V_TABLE.ROW_CONTEXT_MENU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return VTable.V_TABLE.ROW_MOUSE_ENTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return VTable.V_TABLE.ROW_MOUSE_LEAVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return VTable.V_TABLE.OP_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return VTable.V_TABLE.OP_DATA_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return VTable.V_TABLE.OP_FIXED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return VTable.V_TABLE.OP_CONFIG;
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
    public Boolean component2() {
        return getBordered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTotalReport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTotalSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRowDoubleClick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRowClick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRowContextMenu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getRowMouseEnter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRowMouseLeave();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getOpTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getOpDataIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getOpFixed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOpConfig();
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
    public Boolean value2() {
        return getBordered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTotalReport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTotalSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRowDoubleClick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRowClick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRowContextMenu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRowMouseEnter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRowMouseLeave();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOpTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getOpDataIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getOpFixed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOpConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value2(Boolean value) {
        setBordered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value3(String value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value4(String value) {
        setClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value5(String value) {
        setTotalReport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value6(String value) {
        setTotalSelected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value7(String value) {
        setRowDoubleClick(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value8(String value) {
        setRowClick(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value9(String value) {
        setRowContextMenu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value10(String value) {
        setRowMouseEnter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value11(String value) {
        setRowMouseLeave(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value12(String value) {
        setOpTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value13(String value) {
        setOpDataIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value14(Boolean value) {
        setOpFixed(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord value15(String value) {
        setOpConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTableRecord values(String value1, Boolean value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, Boolean value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IVTable from) {
        setKey(from.getKey());
        setBordered(from.getBordered());
        setSize(from.getSize());
        setClassName(from.getClassName());
        setTotalReport(from.getTotalReport());
        setTotalSelected(from.getTotalSelected());
        setRowDoubleClick(from.getRowDoubleClick());
        setRowClick(from.getRowClick());
        setRowContextMenu(from.getRowContextMenu());
        setRowMouseEnter(from.getRowMouseEnter());
        setRowMouseLeave(from.getRowMouseLeave());
        setOpTitle(from.getOpTitle());
        setOpDataIndex(from.getOpDataIndex());
        setOpFixed(from.getOpFixed());
        setOpConfig(from.getOpConfig());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVTable> E into(E into) {
        into.from(this);
        return into;
    }
}
