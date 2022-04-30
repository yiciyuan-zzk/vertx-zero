/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.records;


import cn.vertxup.psi.domain.tables.PBuyItem;
import cn.vertxup.psi.domain.tables.interfaces.IPBuyItem;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PBuyItemRecord extends UpdatableRecordImpl<PBuyItemRecord> implements VertxPojo, IPBuyItem {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.KEY</code>. 「key」- 采购明细主键
     */
    @Override
    public PBuyItemRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.KEY</code>. 「key」- 采购明细主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.SERIAL</code>. 「serial」-
     * 采购单号（系统可用，直接计算）
     */
    @Override
    public PBuyItemRecord setSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.SERIAL</code>. 「serial」-
     * 采购单号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public PBuyItemRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public PBuyItemRecord setCommodityId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public String getCommodityId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public PBuyItemRecord setCommodityCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public PBuyItemRecord setCommodityName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 建议供应商
     */
    @Override
    public PBuyItemRecord setCustomerId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 建议供应商
     */
    @Override
    public String getCustomerId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TICKET_ID</code>. 「ticketId」-
     * 采购申请ID
     */
    @Override
    public PBuyItemRecord setTicketId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TICKET_ID</code>. 「ticketId」-
     * 采购申请ID
     */
    @Override
    public String getTicketId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ORDER_ID</code>. 「orderId」- 采购订单ID
     */
    @Override
    public PBuyItemRecord setOrderId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ORDER_ID</code>. 「orderId」- 采购订单ID
     */
    @Override
    public String getOrderId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_REQUEST</code>. 「numRequest」-
     * 申请数量
     */
    @Override
    public PBuyItemRecord setNumRequest(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_REQUEST</code>. 「numRequest」-
     * 申请数量
     */
    @Override
    public Integer getNumRequest() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_APPROVED</code>.
     * 「numApproved」- 审批数量
     */
    @Override
    public PBuyItemRecord setNumApproved(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM_APPROVED</code>.
     * 「numApproved」- 审批数量
     */
    @Override
    public Integer getNumApproved() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.NUM</code>. 「num」- 实际采购数量（订单中）
     */
    @Override
    public PBuyItemRecord setNum(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.NUM</code>. 「num」- 实际采购数量（订单中）
     */
    @Override
    public Integer getNum() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public PBuyItemRecord setTaxRate(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public BigDecimal getTaxRate() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public PBuyItemRecord setTaxAmount(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public BigDecimal getTaxAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public PBuyItemRecord setTaxPrice(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public BigDecimal getTaxPrice() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    @Override
    public PBuyItemRecord setAmountTotal(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    @Override
    public BigDecimal getAmountTotal() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_SPLIT</code>.
     * 「amountSplit」- 采购分摊费用
     */
    @Override
    public PBuyItemRecord setAmountSplit(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT_SPLIT</code>.
     * 「amountSplit」- 采购分摊费用
     */
    @Override
    public BigDecimal getAmountSplit() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT</code>. 「amount」-
     * 采购总价（订单总价）
     */
    @Override
    public PBuyItemRecord setAmount(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.AMOUNT</code>. 「amount」-
     * 采购总价（订单总价）
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public PBuyItemRecord setPrice(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public BigDecimal getPrice() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public PBuyItemRecord setDiscountAmount(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public PBuyItemRecord setDiscountRate(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public PBuyItemRecord setComment(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public String getComment() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ARRIVE_AT</code>. 「arriveAt」-
     * 预计到货时间
     */
    @Override
    public PBuyItemRecord setArriveAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ARRIVE_AT</code>. 「arriveAt」-
     * 预计到货时间
     */
    @Override
    public LocalDateTime getArriveAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PBuyItemRecord setActive(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PBuyItemRecord setSigma(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PBuyItemRecord setMetadata(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PBuyItemRecord setLanguage(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PBuyItemRecord setCreatedAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public PBuyItemRecord setCreatedBy(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PBuyItemRecord setUpdatedAt(LocalDateTime value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public PBuyItemRecord setUpdatedBy(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(30);
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
    public void from(IPBuyItem from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setStatus(from.getStatus());
        setCommodityId(from.getCommodityId());
        setCommodityCode(from.getCommodityCode());
        setCommodityName(from.getCommodityName());
        setCustomerId(from.getCustomerId());
        setTicketId(from.getTicketId());
        setOrderId(from.getOrderId());
        setNumRequest(from.getNumRequest());
        setNumApproved(from.getNumApproved());
        setNum(from.getNum());
        setTaxRate(from.getTaxRate());
        setTaxAmount(from.getTaxAmount());
        setTaxPrice(from.getTaxPrice());
        setAmountTotal(from.getAmountTotal());
        setAmountSplit(from.getAmountSplit());
        setAmount(from.getAmount());
        setPrice(from.getPrice());
        setDiscountAmount(from.getDiscountAmount());
        setDiscountRate(from.getDiscountRate());
        setComment(from.getComment());
        setArriveAt(from.getArriveAt());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IPBuyItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PBuyItemRecord
     */
    public PBuyItemRecord() {
        super(PBuyItem.P_BUY_ITEM);
    }

    /**
     * Create a detached, initialised PBuyItemRecord
     */
    public PBuyItemRecord(String key, String serial, String status, String commodityId, String commodityCode, String commodityName, String customerId, String ticketId, String orderId, Integer numRequest, Integer numApproved, Integer num, BigDecimal taxRate, BigDecimal taxAmount, BigDecimal taxPrice, BigDecimal amountTotal, BigDecimal amountSplit, BigDecimal amount, BigDecimal price, BigDecimal discountAmount, BigDecimal discountRate, String comment, LocalDateTime arriveAt, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(PBuyItem.P_BUY_ITEM);

        setKey(key);
        setSerial(serial);
        setStatus(status);
        setCommodityId(commodityId);
        setCommodityCode(commodityCode);
        setCommodityName(commodityName);
        setCustomerId(customerId);
        setTicketId(ticketId);
        setOrderId(orderId);
        setNumRequest(numRequest);
        setNumApproved(numApproved);
        setNum(num);
        setTaxRate(taxRate);
        setTaxAmount(taxAmount);
        setTaxPrice(taxPrice);
        setAmountTotal(amountTotal);
        setAmountSplit(amountSplit);
        setAmount(amount);
        setPrice(price);
        setDiscountAmount(discountAmount);
        setDiscountRate(discountRate);
        setComment(comment);
        setArriveAt(arriveAt);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised PBuyItemRecord
     */
    public PBuyItemRecord(cn.vertxup.psi.domain.tables.pojos.PBuyItem value) {
        super(PBuyItem.P_BUY_ITEM);

        if (value != null) {
            setKey(value.getKey());
            setSerial(value.getSerial());
            setStatus(value.getStatus());
            setCommodityId(value.getCommodityId());
            setCommodityCode(value.getCommodityCode());
            setCommodityName(value.getCommodityName());
            setCustomerId(value.getCustomerId());
            setTicketId(value.getTicketId());
            setOrderId(value.getOrderId());
            setNumRequest(value.getNumRequest());
            setNumApproved(value.getNumApproved());
            setNum(value.getNum());
            setTaxRate(value.getTaxRate());
            setTaxAmount(value.getTaxAmount());
            setTaxPrice(value.getTaxPrice());
            setAmountTotal(value.getAmountTotal());
            setAmountSplit(value.getAmountSplit());
            setAmount(value.getAmount());
            setPrice(value.getPrice());
            setDiscountAmount(value.getDiscountAmount());
            setDiscountRate(value.getDiscountRate());
            setComment(value.getComment());
            setArriveAt(value.getArriveAt());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

    public PBuyItemRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
