/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FInvoice;
import cn.vertxup.fm.domain.tables.interfaces.IFInvoice;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FInvoiceRecord extends UpdatableRecordImpl<FInvoiceRecord> implements VertxPojo, IFInvoice {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.KEY</code>. 「key」- 发票主键
     */
    @Override
    public FInvoiceRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.KEY</code>. 「key」- 发票主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME</code>. 「name」- 发票名称
     */
    @Override
    public FInvoiceRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME</code>. 「name」- 发票名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CODE</code>. 「code」- 发票机器码
     */
    @Override
    public FInvoiceRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CODE</code>. 「code」- 发票机器码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TYPE</code>. 「type」- 发票类型
     */
    @Override
    public FInvoiceRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TYPE</code>. 「type」- 发票类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.AMOUNT</code>. 「amount」- 发票金额
     */
    @Override
    public FInvoiceRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.AMOUNT</code>. 「amount」- 发票金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.COMMENT</code>. 「comment」 - 发票备注
     */
    @Override
    public FInvoiceRecord setComment(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.COMMENT</code>. 「comment」 - 发票备注
     */
    @Override
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_TITLE</code>.
     * 「invoiceTitle」- 发票抬头
     */
    @Override
    public FInvoiceRecord setInvoiceTitle(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_TITLE</code>.
     * 「invoiceTitle」- 发票抬头
     */
    @Override
    public String getInvoiceTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_NUMBER</code>.
     * 「invoiceNumber」- 发票代码
     */
    @Override
    public FInvoiceRecord setInvoiceNumber(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_NUMBER</code>.
     * 「invoiceNumber」- 发票代码
     */
    @Override
    public String getInvoiceNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_SERIAL</code>.
     * 「invoiceSerial」- 发票号码
     */
    @Override
    public FInvoiceRecord setInvoiceSerial(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_SERIAL</code>.
     * 「invoiceSerial」- 发票号码
     */
    @Override
    public String getInvoiceSerial() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TIN</code>. 「tin」- 税号：纳税人识别号
     */
    @Override
    public FInvoiceRecord setTin(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TIN</code>. 「tin」- 税号：纳税人识别号
     */
    @Override
    public String getTin() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TIN_NAME</code>. 「tinName」- 纳税人姓名
     */
    @Override
    public FInvoiceRecord setTinName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TIN_NAME</code>. 「tinName」- 纳税人姓名
     */
    @Override
    public String getTinName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.PERSONAL</code>. 「personal」- 是否个人发票
     */
    @Override
    public FInvoiceRecord setPersonal(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.PERSONAL</code>. 「personal」- 是否个人发票
     */
    @Override
    public Boolean getPersonal() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_BANK</code>. 「descBank」- 开户行信息
     */
    @Override
    public FInvoiceRecord setDescBank(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_BANK</code>. 「descBank」- 开户行信息
     */
    @Override
    public String getDescBank() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_COMPANY</code>. 「descCompany」-
     * 公司信息
     */
    @Override
    public FInvoiceRecord setDescCompany(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_COMPANY</code>. 「descCompany」-
     * 公司信息
     */
    @Override
    public String getDescCompany() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_LOCATION</code>.
     * 「descLocation」- 地址电话
     */
    @Override
    public FInvoiceRecord setDescLocation(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_LOCATION</code>.
     * 「descLocation」- 地址电话
     */
    @Override
    public String getDescLocation() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_USER</code>. 「descUser」-
     * 个人发票用户信息
     */
    @Override
    public FInvoiceRecord setDescUser(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_USER</code>. 「descUser」-
     * 个人发票用户信息
     */
    @Override
    public String getDescUser() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_RECEIPT</code>.
     * 「nameReceipt」收款人
     */
    @Override
    public FInvoiceRecord setNameReceipt(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_RECEIPT</code>.
     * 「nameReceipt」收款人
     */
    @Override
    public String getNameReceipt() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_RECHECK</code>.
     * 「nameRecheck」复核人
     */
    @Override
    public FInvoiceRecord setNameRecheck(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_RECHECK</code>.
     * 「nameRecheck」复核人
     */
    @Override
    public String getNameRecheck() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_BILLING</code>.
     * 「nameBilling」开票人
     */
    @Override
    public FInvoiceRecord setNameBilling(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_BILLING</code>.
     * 「nameBilling」开票人
     */
    @Override
    public String getNameBilling() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_SELLING</code>.
     * 「nameSelling」销售人
     */
    @Override
    public FInvoiceRecord setNameSelling(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_SELLING</code>.
     * 「nameSelling」销售人
     */
    @Override
    public String getNameSelling() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.ORDER_ID</code>. 「orderId」-
     * 订单对应的订单ID
     */
    @Override
    public FInvoiceRecord setOrderId(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.ORDER_ID</code>. 「orderId」-
     * 订单对应的订单ID
     */
    @Override
    public String getOrderId() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FInvoiceRecord setSigma(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FInvoiceRecord setLanguage(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FInvoiceRecord setActive(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FInvoiceRecord setMetadata(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public FInvoiceRecord setCreatedAt(LocalDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FInvoiceRecord setCreatedBy(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public FInvoiceRecord setUpdatedAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FInvoiceRecord setUpdatedBy(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFInvoice from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setInvoiceTitle(from.getInvoiceTitle());
        setInvoiceNumber(from.getInvoiceNumber());
        setInvoiceSerial(from.getInvoiceSerial());
        setTin(from.getTin());
        setTinName(from.getTinName());
        setPersonal(from.getPersonal());
        setDescBank(from.getDescBank());
        setDescCompany(from.getDescCompany());
        setDescLocation(from.getDescLocation());
        setDescUser(from.getDescUser());
        setNameReceipt(from.getNameReceipt());
        setNameRecheck(from.getNameRecheck());
        setNameBilling(from.getNameBilling());
        setNameSelling(from.getNameSelling());
        setOrderId(from.getOrderId());
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
    public <E extends IFInvoice> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FInvoiceRecord
     */
    public FInvoiceRecord() {
        super(FInvoice.F_INVOICE);
    }

    /**
     * Create a detached, initialised FInvoiceRecord
     */
    public FInvoiceRecord(String key, String name, String code, String type, BigDecimal amount, String comment, String invoiceTitle, String invoiceNumber, String invoiceSerial, String tin, String tinName, Boolean personal, String descBank, String descCompany, String descLocation, String descUser, String nameReceipt, String nameRecheck, String nameBilling, String nameSelling, String orderId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FInvoice.F_INVOICE);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setAmount(amount);
        setComment(comment);
        setInvoiceTitle(invoiceTitle);
        setInvoiceNumber(invoiceNumber);
        setInvoiceSerial(invoiceSerial);
        setTin(tin);
        setTinName(tinName);
        setPersonal(personal);
        setDescBank(descBank);
        setDescCompany(descCompany);
        setDescLocation(descLocation);
        setDescUser(descUser);
        setNameReceipt(nameReceipt);
        setNameRecheck(nameRecheck);
        setNameBilling(nameBilling);
        setNameSelling(nameSelling);
        setOrderId(orderId);
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
     * Create a detached, initialised FInvoiceRecord
     */
    public FInvoiceRecord(cn.vertxup.fm.domain.tables.pojos.FInvoice value) {
        super(FInvoice.F_INVOICE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setAmount(value.getAmount());
            setComment(value.getComment());
            setInvoiceTitle(value.getInvoiceTitle());
            setInvoiceNumber(value.getInvoiceNumber());
            setInvoiceSerial(value.getInvoiceSerial());
            setTin(value.getTin());
            setTinName(value.getTinName());
            setPersonal(value.getPersonal());
            setDescBank(value.getDescBank());
            setDescCompany(value.getDescCompany());
            setDescLocation(value.getDescLocation());
            setDescUser(value.getDescUser());
            setNameReceipt(value.getNameReceipt());
            setNameRecheck(value.getNameRecheck());
            setNameBilling(value.getNameBilling());
            setNameSelling(value.getNameSelling());
            setOrderId(value.getOrderId());
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

    public FInvoiceRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
