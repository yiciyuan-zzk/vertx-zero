/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SViewRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
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
public class SView extends TableImpl<SViewRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_VIEW</code>
     */
    public static final SView S_VIEW = new SView();
    private static final long serialVersionUID = -1249587146;
    /**
     * The column <code>DB_ETERNAL.S_VIEW.KEY</code>. 「key」- 限定记录ID
     */
    public final TableField<SViewRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 限定记录ID");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    public final TableField<SViewRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 视图名称，每个 MATRIX 对应一个视图");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.TITLE</code>. 「title」- 视图标题，用户输入，可选择
     */
    public final TableField<SViewRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「title」- 视图标题，用户输入，可选择");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.OWNER</code>. 「owner」- 用户 / 角色ID
     */
    public final TableField<SViewRecord, String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「owner」- 用户 / 角色ID");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER 用户
     */
    public final TableField<SViewRecord, String> OWNER_TYPE = createField("OWNER_TYPE", org.jooq.impl.SQLDataType.VARCHAR(5), this, "「ownerType」- ROLE 角色，USER 用户");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.RESOURCE_ID</code>. 「resourceId」- 关联资源ID
     */
    public final TableField<SViewRecord, String> RESOURCE_ID = createField("RESOURCE_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「resourceId」- 关联资源ID");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义（单用户处理）
     */
    public final TableField<SViewRecord, String> PROJECTION = createField("PROJECTION", org.jooq.impl.SQLDataType.CLOB, this, "「projection」- 该资源的列定义（单用户处理）");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询（单用户处理）
     */
    public final TableField<SViewRecord, String> CRITERIA = createField("CRITERIA", org.jooq.impl.SQLDataType.CLOB, this, "「criteria」- 该资源的行查询（单用户处理）");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    public final TableField<SViewRecord, String> ROWS = createField("ROWS", org.jooq.impl.SQLDataType.CLOB, this, "「rows」- 该资源针对保存的行进行过滤");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.POSITION</code>. 「position」- 当前列的顺序信息
     */
    public final TableField<SViewRecord, String> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.CLOB, this, "「position」- 当前列的顺序信息");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.VISITANT</code>. 「visitant」- 是否包含了视图访问者
     */
    public final TableField<SViewRecord, Boolean> VISITANT = createField("VISITANT", org.jooq.impl.SQLDataType.BIT, this, "「visitant」- 是否包含了视图访问者");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<SViewRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SViewRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SViewRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SViewRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SViewRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SViewRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SViewRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SViewRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_VIEW</code> table reference
     */
    public SView() {
        this(DSL.name("S_VIEW"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_VIEW</code> table reference
     */
    public SView(String alias) {
        this(DSL.name(alias), S_VIEW);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_VIEW</code> table reference
     */
    public SView(Name alias) {
        this(alias, S_VIEW);
    }

    private SView(Name alias, Table<SViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private SView(Name alias, Table<SViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SViewRecord> getRecordType() {
        return SViewRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_VIEW_OWNER, Indexes.S_VIEW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SViewRecord> getPrimaryKey() {
        return Keys.KEY_S_VIEW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SViewRecord>> getKeys() {
        return Arrays.<UniqueKey<SViewRecord>>asList(Keys.KEY_S_VIEW_PRIMARY, Keys.KEY_S_VIEW_OWNER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SView as(String alias) {
        return new SView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SView as(Name alias) {
        return new SView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SView rename(String name) {
        return new SView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SView rename(Name name) {
        return new SView(name, null);
    }
}
