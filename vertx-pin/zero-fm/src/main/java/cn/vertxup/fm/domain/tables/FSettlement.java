/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FSettlementRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FSettlement extends TableImpl<FSettlementRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.F_SETTLEMENT</code>
     */
    public static final FSettlement F_SETTLEMENT = new FSettlement();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    public final TableField<FSettlementRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 结算单主键");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    public final TableField<FSettlementRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 结算单编号");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    public final TableField<FSettlementRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(36).nullable(false), this, "「serial」 - 结算单据号");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public final TableField<FSettlementRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」——价税合计，所有明细对应的实际结算金额");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.COMMENT</code>. 「comment」 -
     * 结算单备注
     */
    public final TableField<FSettlementRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 结算单备注");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.ROUNDED</code>.
     * 「rounded」抹零方式：四舍五入, HALF：零头舍掉, FLOOR, 零头入进, CEIL
     */
    public final TableField<FSettlementRecord, String> ROUNDED = createField(DSL.name("ROUNDED"), SQLDataType.VARCHAR(12), this, "「rounded」抹零方式：四舍五入, HALF：零头舍掉, FLOOR, 零头入进, CEIL");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.FINISHED</code>. 「finished」-
     * 是否完成
     */
    public final TableField<FSettlementRecord, Boolean> FINISHED = createField(DSL.name("FINISHED"), SQLDataType.BIT, this, "「finished」- 是否完成");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」-
     * 完成时间
     */
    public final TableField<FSettlementRecord, LocalDateTime> FINISHED_AT = createField(DSL.name("FINISHED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 完成时间");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.SIGN_NAME</code>.
     * 「signName」签单人姓名
     */
    public final TableField<FSettlementRecord, String> SIGN_NAME = createField(DSL.name("SIGN_NAME"), SQLDataType.VARCHAR(128), this, "「signName」签单人姓名");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.SIGN_MOBILE</code>.
     * 「signMobile」签单人电话
     */
    public final TableField<FSettlementRecord, String> SIGN_MOBILE = createField(DSL.name("SIGN_MOBILE"), SQLDataType.VARCHAR(128), this, "「signMobile」签单人电话");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    public final TableField<FSettlementRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(36), this, "「customerId」结算对象（单位ID）");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    public final TableField<FSettlementRecord, String> ORDER_ID = createField(DSL.name("ORDER_ID"), SQLDataType.VARCHAR(36), this, "「orderId」- 预授权所属订单ID");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.BOOK_ID</code>. 「bookId」- 所属账本ID
     */
    public final TableField<FSettlementRecord, String> BOOK_ID = createField(DSL.name("BOOK_ID"), SQLDataType.VARCHAR(36), this, "「bookId」- 所属账本ID");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FSettlementRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public final TableField<FSettlementRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FSettlementRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public final TableField<FSettlementRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<FSettlementRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public final TableField<FSettlementRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<FSettlementRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public final TableField<FSettlementRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FSettlement(Name alias, Table<FSettlementRecord> aliased) {
        this(alias, aliased, null);
    }

    private FSettlement(Name alias, Table<FSettlementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_SETTLEMENT</code> table reference
     */
    public FSettlement(String alias) {
        this(DSL.name(alias), F_SETTLEMENT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_SETTLEMENT</code> table reference
     */
    public FSettlement(Name alias) {
        this(alias, F_SETTLEMENT);
    }

    /**
     * Create a <code>DB_ETERNAL.F_SETTLEMENT</code> table reference
     */
    public FSettlement() {
        this(DSL.name("F_SETTLEMENT"), null);
    }

    public <O extends Record> FSettlement(Table<O> child, ForeignKey<O, FSettlementRecord> key) {
        super(child, key, F_SETTLEMENT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FSettlementRecord> getRecordType() {
        return FSettlementRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<FSettlementRecord> getPrimaryKey() {
        return Keys.KEY_F_SETTLEMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<FSettlementRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_SETTLEMENT_CODE, Keys.KEY_F_SETTLEMENT_SERIAL);
    }

    @Override
    public FSettlement as(String alias) {
        return new FSettlement(DSL.name(alias), this);
    }

    @Override
    public FSettlement as(Name alias) {
        return new FSettlement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FSettlement rename(String name) {
        return new FSettlement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FSettlement rename(Name name) {
        return new FSettlement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, BigDecimal, String, String, Boolean, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
