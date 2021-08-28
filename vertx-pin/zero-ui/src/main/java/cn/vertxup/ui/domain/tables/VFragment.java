/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables;


import cn.vertxup.ui.domain.Db;
import cn.vertxup.ui.domain.Indexes;
import cn.vertxup.ui.domain.Keys;
import cn.vertxup.ui.domain.tables.records.VFragmentRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class VFragment extends TableImpl<VFragmentRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.V_FRAGMENT</code>
     */
    public static final VFragment V_FRAGMENT = new VFragment();
    private static final long serialVersionUID = 651031902;
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    public final TableField<VFragmentRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 选项主键");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    public final TableField<VFragmentRecord, String> CONTAINER = createField("CONTAINER", org.jooq.impl.SQLDataType.CLOB, this, "「container」- 容器专用格式");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    public final TableField<VFragmentRecord, String> NOTICE = createField("NOTICE", org.jooq.impl.SQLDataType.CLOB, this, "「notice」- notice选项，Alert结构");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」- 按钮的ID（单按钮）
     */
    public final TableField<VFragmentRecord, String> BUTTON_CONNECT = createField("BUTTON_CONNECT", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「buttonConnect」- 按钮的ID（单按钮）");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」- 一组按钮配置
     */
    public final TableField<VFragmentRecord, String> BUTTON_GROUP = createField("BUTTON_GROUP", org.jooq.impl.SQLDataType.CLOB, this, "「buttonGroup」- 一组按钮配置");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    public final TableField<VFragmentRecord, String> MODAL = createField("MODAL", org.jooq.impl.SQLDataType.CLOB, this, "「modal」- modal选项，Model专用结构");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    public final TableField<VFragmentRecord, Integer> GRID = createField("GRID", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("3", org.jooq.impl.SQLDataType.INTEGER)), this, "「grid」- grid选项（分区面板专用）");
    /**
     * The column <code>DB_ETERNAL.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    public final TableField<VFragmentRecord, String> CONFIG = createField("CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "「config」- 根目录开始的基本配置");

    /**
     * Create a <code>DB_ETERNAL.V_FRAGMENT</code> table reference
     */
    public VFragment() {
        this(DSL.name("V_FRAGMENT"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.V_FRAGMENT</code> table reference
     */
    public VFragment(String alias) {
        this(DSL.name(alias), V_FRAGMENT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.V_FRAGMENT</code> table reference
     */
    public VFragment(Name alias) {
        this(alias, V_FRAGMENT);
    }

    private VFragment(Name alias, Table<VFragmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private VFragment(Name alias, Table<VFragmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VFragmentRecord> getRecordType() {
        return VFragmentRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.V_FRAGMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VFragmentRecord> getPrimaryKey() {
        return Keys.KEY_V_FRAGMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VFragmentRecord>> getKeys() {
        return Arrays.<UniqueKey<VFragmentRecord>>asList(Keys.KEY_V_FRAGMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VFragment as(String alias) {
        return new VFragment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VFragment as(Name alias) {
        return new VFragment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VFragment rename(String name) {
        return new VFragment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VFragment rename(Name name) {
        return new VFragment(name, null);
    }
}
