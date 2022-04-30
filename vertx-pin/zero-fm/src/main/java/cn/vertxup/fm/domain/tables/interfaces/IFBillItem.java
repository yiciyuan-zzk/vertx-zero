/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IFBillItem extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public IFBillItem setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public IFBillItem setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public IFBillItem setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public IFBillItem setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.INCOME</code>. 「income」- true =
     * 消费类，false = 付款类
     */
    public IFBillItem setIncome(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.INCOME</code>. 「income」- true =
     * 消费类，false = 付款类
     */
    public Boolean getIncome();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public IFBillItem setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public IFBillItem setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际付款结果，有可能父项
     */
    public IFBillItem setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际付款结果，有可能父项
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public IFBillItem setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 -
     * 手工单号（线下单号专用）
     */
    public IFBillItem setManualNo(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 -
     * 手工单号（线下单号专用）
     */
    public String getManualNo();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.UNIT</code>. 「unit」- 计量单位
     */
    public IFBillItem setUnit(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.UNIT</code>. 「unit」- 计量单位
     */
    public String getUnit();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public IFBillItem setPrice(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public BigDecimal getPrice();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public IFBillItem setQuantity(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public Integer getQuantity();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」——总价，理论计算结果
     */
    public IFBillItem setAmountTotal(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」——总价，理论计算结果
     */
    public BigDecimal getAmountTotal();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public IFBillItem setOpBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public String getOpBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」-
     * 操作人员工号
     */
    public IFBillItem setOpNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」-
     * 操作人员工号
     */
    public String getOpNumber();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」-
     * 操作班次（对接排班系统）
     */
    public IFBillItem setOpShift(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」-
     * 操作班次（对接排班系统）
     */
    public String getOpShift();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public IFBillItem setOpAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public LocalDateTime getOpAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」-
     * 关联ID（保留，原系统存在）
     */
    public IFBillItem setRelatedId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」-
     * 关联ID（保留，原系统存在）
     */
    public String getRelatedId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public IFBillItem setSettlementId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public String getSettlementId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public IFBillItem setBillId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public String getBillId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」-
     * 会计科目ID，依赖账单项选择结果
     */
    public IFBillItem setSubjectId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」-
     * 会计科目ID，依赖账单项选择结果
     */
    public String getSubjectId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」-
     * 账单项ID
     */
    public IFBillItem setPayTermId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」-
     * 账单项ID
     */
    public String getPayTermId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFBillItem setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IFBillItem setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public IFBillItem setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IFBillItem setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IFBillItem setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IFBillItem setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IFBillItem setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IFBillItem setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFBillItem
     */
    public void from(IFBillItem from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFBillItem
     */
    public <E extends IFBillItem> E into(E into);

    @Override
    public default IFBillItem fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setSerial, json::getString, "SERIAL", "java.lang.String");
        setOrThrow(this::setIncome, json::getBoolean, "INCOME", "java.lang.Boolean");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setStatus, json::getString, "STATUS", "java.lang.String");
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setManualNo, json::getString, "MANUAL_NO", "java.lang.String");
        setOrThrow(this::setUnit, json::getString, "UNIT", "java.lang.String");
        // Omitting unrecognized type java.math.BigDecimal for column PRICE!
        setOrThrow(this::setQuantity, json::getInteger, "QUANTITY", "java.lang.Integer");
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        setOrThrow(this::setOpBy, json::getString, "OP_BY", "java.lang.String");
        setOrThrow(this::setOpNumber, json::getString, "OP_NUMBER", "java.lang.String");
        setOrThrow(this::setOpShift, json::getString, "OP_SHIFT", "java.lang.String");
        setOrThrow(this::setOpAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "OP_AT", "java.time.LocalDateTime");
        setOrThrow(this::setRelatedId, json::getString, "RELATED_ID", "java.lang.String");
        setOrThrow(this::setSettlementId, json::getString, "SETTLEMENT_ID", "java.lang.String");
        setOrThrow(this::setBillId, json::getString, "BILL_ID", "java.lang.String");
        setOrThrow(this::setSubjectId, json::getString, "SUBJECT_ID", "java.lang.String");
        setOrThrow(this::setPayTermId, json::getString, "PAY_TERM_ID", "java.lang.String");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setCreatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "CREATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setCreatedBy, json::getString, "CREATED_BY", "java.lang.String");
        setOrThrow(this::setUpdatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "UPDATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setUpdatedBy, json::getString, "UPDATED_BY", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("SERIAL", getSerial());
        json.put("INCOME", getIncome());
        json.put("TYPE", getType());
        json.put("STATUS", getStatus());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        json.put("COMMENT", getComment());
        json.put("MANUAL_NO", getManualNo());
        json.put("UNIT", getUnit());
        // Omitting unrecognized type java.math.BigDecimal for column PRICE!
        json.put("QUANTITY", getQuantity());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        json.put("OP_BY", getOpBy());
        json.put("OP_NUMBER", getOpNumber());
        json.put("OP_SHIFT", getOpShift());
        json.put("OP_AT", getOpAt() == null ? null : getOpAt().toString());
        json.put("RELATED_ID", getRelatedId());
        json.put("SETTLEMENT_ID", getSettlementId());
        json.put("BILL_ID", getBillId());
        json.put("SUBJECT_ID", getSubjectId());
        json.put("PAY_TERM_ID", getPayTermId());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
