/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SGroupRecord;
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
public class SGroup extends TableImpl<SGroupRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_GROUP</code>
     */
    public static final SGroup S_GROUP = new SGroup();
    private static final long serialVersionUID = -1859824782;
    /**
     * The column <code>DB_ETERNAL.S_GROUP.KEY</code>. 「key」- 组ID
     */
    public final TableField<SGroupRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 组ID");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.NAME</code>. 「name」- 组名称
     */
    public final TableField<SGroupRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 组名称");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.CODE</code>. 「code」- 组系统码
     */
    public final TableField<SGroupRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 组系统码");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.PARENT_ID</code>. 「parentId」- 父组ID（组支持树形结构，角色平行结构）
     */
    public final TableField<SGroupRecord, String> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「parentId」- 父组ID（组支持树形结构，角色平行结构）");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public final TableField<SGroupRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 组所关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<SGroupRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.CATEGORY</code>. 「category」- 组类型
     */
    public final TableField<SGroupRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「category」- 组类型");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<SGroupRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SGroupRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SGroupRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SGroupRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SGroupRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SGroupRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SGroupRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_GROUP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SGroupRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_GROUP</code> table reference
     */
    public SGroup() {
        this(DSL.name("S_GROUP"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_GROUP</code> table reference
     */
    public SGroup(String alias) {
        this(DSL.name(alias), S_GROUP);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_GROUP</code> table reference
     */
    public SGroup(Name alias) {
        this(alias, S_GROUP);
    }

    private SGroup(Name alias, Table<SGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private SGroup(Name alias, Table<SGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SGroupRecord> getRecordType() {
        return SGroupRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_GROUP_CODE, Indexes.S_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SGroupRecord> getPrimaryKey() {
        return Keys.KEY_S_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<SGroupRecord>>asList(Keys.KEY_S_GROUP_PRIMARY, Keys.KEY_S_GROUP_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SGroup as(String alias) {
        return new SGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SGroup as(Name alias) {
        return new SGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SGroup rename(String name) {
        return new SGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SGroup rename(Name name) {
        return new SGroup(name, null);
    }
}
