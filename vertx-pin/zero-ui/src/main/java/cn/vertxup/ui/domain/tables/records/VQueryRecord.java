/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.VQuery;
import cn.vertxup.ui.domain.tables.interfaces.IVQuery;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class VQueryRecord extends UpdatableRecordImpl<VQueryRecord> implements Record5<String, String, String, String, String>, IVQuery {

    private static final long serialVersionUID = -1180580073;

    /**
     * Create a detached VQueryRecord
     */
    public VQueryRecord() {
        super(VQuery.V_QUERY);
    }

    /**
     * Create a detached, initialised VQueryRecord
     */
    public VQueryRecord(String key, String projection, String pager, String sorter, String criteria) {
        super(VQuery.V_QUERY);

        set(0, key);
        set(1, projection);
        set(2, pager);
        set(3, sorter);
        set(4, criteria);
    }

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.KEY</code>. 「key」- 选项主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.KEY</code>. 「key」- 选项主键
     */
    @Override
    public VQueryRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.PROJECTION</code>. 「projection」- query/projection:[], 默认列过滤项
     */
    @Override
    public String getProjection() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.PROJECTION</code>. 「projection」- query/projection:[], 默认列过滤项
     */
    @Override
    public VQueryRecord setProjection(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.PAGER</code>. 「pager」- query/pager:{}, 分页选项
     */
    @Override
    public String getPager() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.PAGER</code>. 「pager」- query/pager:{}, 分页选项
     */
    @Override
    public VQueryRecord setPager(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.SORTER</code>. 「sorter」- query/sorter:[], 排序选项
     */
    @Override
    public String getSorter() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.SORTER</code>. 「sorter」- query/sorter:[], 排序选项
     */
    @Override
    public VQueryRecord setSorter(String value) {
        set(3, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.CRITERIA</code>. 「criteria」- query/criteria:{}, 查询条件选项
     */
    @Override
    public String getCriteria() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.CRITERIA</code>. 「criteria」- query/criteria:{}, 查询条件选项
     */
    @Override
    public VQueryRecord setCriteria(String value) {
        set(4, value);
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
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return VQuery.V_QUERY.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VQuery.V_QUERY.PROJECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VQuery.V_QUERY.PAGER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VQuery.V_QUERY.SORTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VQuery.V_QUERY.CRITERIA;
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
        return getProjection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPager();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSorter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCriteria();
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
        return getProjection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPager();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSorter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCriteria();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord value2(String value) {
        setProjection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord value3(String value) {
        setPager(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord value4(String value) {
        setSorter(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord value5(String value) {
        setCriteria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQueryRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IVQuery from) {
        setKey(from.getKey());
        setProjection(from.getProjection());
        setPager(from.getPager());
        setSorter(from.getSorter());
        setCriteria(from.getCriteria());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVQuery> E into(E into) {
        into.from(this);
        return into;
    }
}
