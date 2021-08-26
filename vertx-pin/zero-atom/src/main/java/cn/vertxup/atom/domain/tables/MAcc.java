/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables;


import cn.vertxup.atom.domain.Db;
import cn.vertxup.atom.domain.Indexes;
import cn.vertxup.atom.domain.Keys;
import cn.vertxup.atom.domain.tables.records.MAccRecord;
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
public class MAcc extends TableImpl<MAccRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.M_ACC</code>
     */
    public static final MAcc M_ACC = new MAcc();
    private static final long serialVersionUID = 924030878;
    /**
     * The column <code>DB_ETERNAL.M_ACC.KEY</code>. 「key」- 增量记录ID
     */
    public final TableField<MAccRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 增量记录ID");
    /**
     * The column <code>DB_ETERNAL.M_ACC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public final TableField<MAccRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.M_ACC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<MAccRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.M_ACC.RECORD_JSON</code>. 「recordJson」- 上一次的记录内容（Json格式）
     */
    public final TableField<MAccRecord, String> RECORD_JSON = createField("RECORD_JSON", org.jooq.impl.SQLDataType.CLOB, this, "「recordJson」- 上一次的记录内容（Json格式）");
    /**
     * The column <code>DB_ETERNAL.M_ACC.RECORD_RAW</code>. 「recordRaw」- 上一次的记录的原始内容
     */
    public final TableField<MAccRecord, String> RECORD_RAW = createField("RECORD_RAW", org.jooq.impl.SQLDataType.CLOB, this, "「recordRaw」- 上一次的记录的原始内容");
    /**
     * The column <code>DB_ETERNAL.M_ACC.RECORD_UNIQUE</code>. 「recordUnique」- 业务标识规则专用Key，可计算获取
     */
    public final TableField<MAccRecord, String> RECORD_UNIQUE = createField("RECORD_UNIQUE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「recordUnique」- 业务标识规则专用Key，可计算获取");
    /**
     * The column <code>DB_ETERNAL.M_ACC.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MAccRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.M_ACC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MAccRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.M_ACC.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MAccRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.M_ACC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MAccRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.M_ACC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MAccRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.M_ACC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MAccRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.M_ACC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MAccRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.M_ACC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MAccRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.M_ACC</code> table reference
     */
    public MAcc() {
        this(DSL.name("M_ACC"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_ACC</code> table reference
     */
    public MAcc(String alias) {
        this(DSL.name(alias), M_ACC);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_ACC</code> table reference
     */
    public MAcc(Name alias) {
        this(alias, M_ACC);
    }

    private MAcc(Name alias, Table<MAccRecord> aliased) {
        this(alias, aliased, null);
    }

    private MAcc(Name alias, Table<MAccRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MAccRecord> getRecordType() {
        return MAccRecord.class;
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
        return Arrays.<Index>asList(Indexes.M_ACC_PRIMARY, Indexes.M_ACC_SIGMA, Indexes.M_ACC_SIGMA_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MAccRecord> getPrimaryKey() {
        return Keys.KEY_M_ACC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MAccRecord>> getKeys() {
        return Arrays.<UniqueKey<MAccRecord>>asList(Keys.KEY_M_ACC_PRIMARY, Keys.KEY_M_ACC_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MAcc as(String alias) {
        return new MAcc(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MAcc as(Name alias) {
        return new MAcc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MAcc rename(String name) {
        return new MAcc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MAcc rename(Name name) {
        return new MAcc(name, null);
    }
}
