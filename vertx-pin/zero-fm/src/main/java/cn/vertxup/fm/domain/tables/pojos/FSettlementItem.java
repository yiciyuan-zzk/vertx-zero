/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.pojos;


import cn.vertxup.fm.domain.tables.interfaces.IFSettlementItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FSettlementItem implements VertxPojo, IFSettlementItem {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String serial;
    private Boolean income;
    private String type;
    private BigDecimal amount;
    private String comment;
    private String manualNo;
    private String payTermId;
    private String relatedId;
    private String settlementId;
    private String debtId;
    private String invoiceId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FSettlementItem() {
    }

    public FSettlementItem(IFSettlementItem value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.income = value.getIncome();
        this.type = value.getType();
        this.amount = value.getAmount();
        this.comment = value.getComment();
        this.manualNo = value.getManualNo();
        this.payTermId = value.getPayTermId();
        this.relatedId = value.getRelatedId();
        this.settlementId = value.getSettlementId();
        this.debtId = value.getDebtId();
        this.invoiceId = value.getInvoiceId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FSettlementItem(
        String key,
        String name,
        String code,
        String serial,
        Boolean income,
        String type,
        BigDecimal amount,
        String comment,
        String manualNo,
        String payTermId,
        String relatedId,
        String settlementId,
        String debtId,
        String invoiceId,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.serial = serial;
        this.income = income;
        this.type = type;
        this.amount = amount;
        this.comment = comment;
        this.manualNo = manualNo;
        this.payTermId = payTermId;
        this.relatedId = relatedId;
        this.settlementId = settlementId;
        this.debtId = debtId;
        this.invoiceId = invoiceId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public FSettlementItem(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.KEY</code>. 「key」- 结算单明细主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.KEY</code>. 「key」- 结算单明细主键
     */
    @Override
    public FSettlementItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.NAME</code>. 「name」 -  明细名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.NAME</code>. 「name」 -  明细名称
     */
    @Override
    public FSettlementItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CODE</code>. 「code」 -
     * 明细系统代码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CODE</code>. 「code」 -
     * 明细系统代码
     */
    @Override
    public FSettlementItem setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SERIAL</code>. 「serial」 -
     * 明细编号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SERIAL</code>. 「serial」 -
     * 明细编号
     */
    @Override
    public FSettlementItem setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INCOME</code>. 「income」-
     * true = 消费类，false = 付款类
     */
    @Override
    public Boolean getIncome() {
        return this.income;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INCOME</code>. 「income」-
     * true = 消费类，false = 付款类
     */
    @Override
    public FSettlementItem setIncome(Boolean income) {
        this.income = income;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.TYPE</code>. 「type」- 明细类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.TYPE</code>. 「type」- 明细类型
     */
    @Override
    public FSettlementItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际结算金额
     */
    @Override
    public FSettlementItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.COMMENT</code>. 「comment」 -
     * 明细备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.COMMENT</code>. 「comment」 -
     * 明细备注
     */
    @Override
    public FSettlementItem setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.MANUAL_NO</code>.
     * 「manualNo」 - 手工单号（线下单号专用）
     */
    @Override
    public String getManualNo() {
        return this.manualNo;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.MANUAL_NO</code>.
     * 「manualNo」 - 手工单号（线下单号专用）
     */
    @Override
    public FSettlementItem setManualNo(String manualNo) {
        this.manualNo = manualNo;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.PAY_TERM_ID</code>.
     * 「payTermId」- 账单项ID
     */
    @Override
    public String getPayTermId() {
        return this.payTermId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.PAY_TERM_ID</code>.
     * 「payTermId」- 账单项ID
     */
    @Override
    public FSettlementItem setPayTermId(String payTermId) {
        this.payTermId = payTermId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.RELATED_ID</code>.
     * 「relatedId」- 关联BillItem ID（保留，原系统存在）
     */
    @Override
    public String getRelatedId() {
        return this.relatedId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.RELATED_ID</code>.
     * 「relatedId」- 关联BillItem ID（保留，原系统存在）
     */
    @Override
    public FSettlementItem setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    @Override
    public String getSettlementId() {
        return this.settlementId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    @Override
    public FSettlementItem setSettlementId(String settlementId) {
        this.settlementId = settlementId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.DEBT_ID</code>. 「debtId」-
     * 应收账单ID
     */
    @Override
    public String getDebtId() {
        return this.debtId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.DEBT_ID</code>. 「debtId」-
     * 应收账单ID
     */
    @Override
    public FSettlementItem setDebtId(String debtId) {
        this.debtId = debtId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INVOICE_ID</code>.
     * 「invoiceId」- 开票ID
     */
    @Override
    public String getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INVOICE_ID</code>.
     * 「invoiceId」- 开票ID
     */
    @Override
    public FSettlementItem setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSettlementItem setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.LANGUAGE</code>.
     * 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.LANGUAGE</code>.
     * 「language」- 使用的语言
     */
    @Override
    public FSettlementItem setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.ACTIVE</code>. 「active」-
     * 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.ACTIVE</code>. 「active」-
     * 是否启用
     */
    @Override
    public FSettlementItem setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.METADATA</code>.
     * 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.METADATA</code>.
     * 「metadata」- 附加配置数据
     */
    @Override
    public FSettlementItem setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public FSettlementItem setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public FSettlementItem setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public FSettlementItem setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public FSettlementItem setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FSettlementItem (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(income);
        sb.append(", ").append(type);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(manualNo);
        sb.append(", ").append(payTermId);
        sb.append(", ").append(relatedId);
        sb.append(", ").append(settlementId);
        sb.append(", ").append(debtId);
        sb.append(", ").append(invoiceId);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFSettlementItem from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setIncome(from.getIncome());
        setType(from.getType());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setManualNo(from.getManualNo());
        setPayTermId(from.getPayTermId());
        setRelatedId(from.getRelatedId());
        setSettlementId(from.getSettlementId());
        setDebtId(from.getDebtId());
        setInvoiceId(from.getInvoiceId());
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
    public <E extends IFSettlementItem> E into(E into) {
        into.from(this);
        return into;
    }
}
