/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FPayment;
import cn.vertxup.fm.domain.tables.interfaces.IFPayment;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FPaymentRecord extends UpdatableRecordImpl<FPaymentRecord> implements VertxPojo, Record18<String, String, String, String, BigDecimal, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFPayment {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.KEY</code>. 「key」- 付款单账单主键ID
     */
    @Override
    public FPaymentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.KEY</code>. 「key」- 付款单账单主键ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.NAME</code>. 「name」 - 付款单单标题
     */
    @Override
    public FPaymentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.NAME</code>. 「name」 - 付款单单标题
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.CODE</code>. 「code」 - 付款单单编号
     */
    @Override
    public FPaymentRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.CODE</code>. 「code」 - 付款单单编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.SERIAL</code>. 「serial」 - 付款单单据号
     */
    @Override
    public FPaymentRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.SERIAL</code>. 「serial」 - 付款单单据号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FPaymentRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.PAY_NAME</code>. 「payName」打款人姓名
     */
    @Override
    public FPaymentRecord setPayName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.PAY_NAME</code>. 「payName」打款人姓名
     */
    @Override
    public String getPayName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.PAY_MOBILE</code>. 「payMobile」打款人电话
     */
    @Override
    public FPaymentRecord setPayMobile(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.PAY_MOBILE</code>. 「payMobile」打款人电话
     */
    @Override
    public String getPayMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.PAY_METHOD</code>. 「payMethod」付款方式
     */
    @Override
    public FPaymentRecord setPayMethod(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.PAY_METHOD</code>. 「payMethod」付款方式
     */
    @Override
    public String getPayMethod() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.PAY_ID</code>. 「payId」付款账号
     */
    @Override
    public FPaymentRecord setPayId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.PAY_ID</code>. 「payId」付款账号
     */
    @Override
    public String getPayId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public FPaymentRecord setComment(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public String getComment() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FPaymentRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FPaymentRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FPaymentRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FPaymentRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public FPaymentRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FPaymentRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public FPaymentRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FPaymentRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, BigDecimal, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, String, BigDecimal, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FPayment.F_PAYMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return FPayment.F_PAYMENT.NAME;
    }

    @Override
    public Field<String> field3() {
        return FPayment.F_PAYMENT.CODE;
    }

    @Override
    public Field<String> field4() {
        return FPayment.F_PAYMENT.SERIAL;
    }

    @Override
    public Field<BigDecimal> field5() {
        return FPayment.F_PAYMENT.AMOUNT;
    }

    @Override
    public Field<String> field6() {
        return FPayment.F_PAYMENT.PAY_NAME;
    }

    @Override
    public Field<String> field7() {
        return FPayment.F_PAYMENT.PAY_MOBILE;
    }

    @Override
    public Field<String> field8() {
        return FPayment.F_PAYMENT.PAY_METHOD;
    }

    @Override
    public Field<String> field9() {
        return FPayment.F_PAYMENT.PAY_ID;
    }

    @Override
    public Field<String> field10() {
        return FPayment.F_PAYMENT.COMMENT;
    }

    @Override
    public Field<String> field11() {
        return FPayment.F_PAYMENT.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return FPayment.F_PAYMENT.LANGUAGE;
    }

    @Override
    public Field<Boolean> field13() {
        return FPayment.F_PAYMENT.ACTIVE;
    }

    @Override
    public Field<String> field14() {
        return FPayment.F_PAYMENT.METADATA;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return FPayment.F_PAYMENT.CREATED_AT;
    }

    @Override
    public Field<String> field16() {
        return FPayment.F_PAYMENT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return FPayment.F_PAYMENT.UPDATED_AT;
    }

    @Override
    public Field<String> field18() {
        return FPayment.F_PAYMENT.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getSerial();
    }

    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    @Override
    public String component6() {
        return getPayName();
    }

    @Override
    public String component7() {
        return getPayMobile();
    }

    @Override
    public String component8() {
        return getPayMethod();
    }

    @Override
    public String component9() {
        return getPayId();
    }

    @Override
    public String component10() {
        return getComment();
    }

    @Override
    public String component11() {
        return getSigma();
    }

    @Override
    public String component12() {
        return getLanguage();
    }

    @Override
    public Boolean component13() {
        return getActive();
    }

    @Override
    public String component14() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    @Override
    public String component16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    @Override
    public String component18() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getSerial();
    }

    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    @Override
    public String value6() {
        return getPayName();
    }

    @Override
    public String value7() {
        return getPayMobile();
    }

    @Override
    public String value8() {
        return getPayMethod();
    }

    @Override
    public String value9() {
        return getPayId();
    }

    @Override
    public String value10() {
        return getComment();
    }

    @Override
    public String value11() {
        return getSigma();
    }

    @Override
    public String value12() {
        return getLanguage();
    }

    @Override
    public Boolean value13() {
        return getActive();
    }

    @Override
    public String value14() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    @Override
    public String value16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    @Override
    public String value18() {
        return getUpdatedBy();
    }

    @Override
    public FPaymentRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FPaymentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FPaymentRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FPaymentRecord value4(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FPaymentRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FPaymentRecord value6(String value) {
        setPayName(value);
        return this;
    }

    @Override
    public FPaymentRecord value7(String value) {
        setPayMobile(value);
        return this;
    }

    @Override
    public FPaymentRecord value8(String value) {
        setPayMethod(value);
        return this;
    }

    @Override
    public FPaymentRecord value9(String value) {
        setPayId(value);
        return this;
    }

    @Override
    public FPaymentRecord value10(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FPaymentRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FPaymentRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FPaymentRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FPaymentRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FPaymentRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FPaymentRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FPaymentRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FPaymentRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FPaymentRecord values(String value1, String value2, String value3, String value4, BigDecimal value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFPayment from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setPayName(from.getPayName());
        setPayMobile(from.getPayMobile());
        setPayMethod(from.getPayMethod());
        setPayId(from.getPayId());
        setComment(from.getComment());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IFPayment> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FPaymentRecord
     */
    public FPaymentRecord() {
        super(FPayment.F_PAYMENT);
    }

    /**
     * Create a detached, initialised FPaymentRecord
     */
    public FPaymentRecord(String key, String name, String code, String serial, BigDecimal amount, String payName, String payMobile, String payMethod, String payId, String comment, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FPayment.F_PAYMENT);

        setKey(key);
        setName(name);
        setCode(code);
        setSerial(serial);
        setAmount(amount);
        setPayName(payName);
        setPayMobile(payMobile);
        setPayMethod(payMethod);
        setPayId(payId);
        setComment(comment);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised FPaymentRecord
     */
    public FPaymentRecord(cn.vertxup.fm.domain.tables.pojos.FPayment value) {
        super(FPayment.F_PAYMENT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setAmount(value.getAmount());
            setPayName(value.getPayName());
            setPayMobile(value.getPayMobile());
            setPayMethod(value.getPayMethod());
            setPayId(value.getPayId());
            setComment(value.getComment());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public FPaymentRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
