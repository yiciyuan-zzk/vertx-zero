/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IPInTicket extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.KEY</code>. 「key」- 入库单主键
     */
    public IPInTicket setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.KEY</code>. 「key」- 入库单主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.SERIAL</code>. 「serial」-
     * 入库单号（系统可用，直接计算）
     */
    public IPInTicket setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.SERIAL</code>. 「serial」-
     * 入库单号（系统可用，直接计算）
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TYPE</code>. 「type」- 单据类型
     */
    public IPInTicket setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TYPE</code>. 「type」- 单据类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TYPE_BUSINESS</code>.
     * 「typeBusiness」- 业务类型
     */
    public IPInTicket setTypeBusiness(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TYPE_BUSINESS</code>.
     * 「typeBusiness」- 业务类型
     */
    public String getTypeBusiness();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.STATUS</code>. 「status」- 订单状态
     */
    public IPInTicket setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.STATUS</code>. 「status」- 订单状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.WH_ID</code>. 「whId」- 建议入库仓库
     */
    public IPInTicket setWhId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.WH_ID</code>. 「whId」- 建议入库仓库
     */
    public String getWhId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.CUSTOMER_ID</code>. 「customerId」-
     * 实际供应商
     */
    public IPInTicket setCustomerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.CUSTOMER_ID</code>. 「customerId」-
     * 实际供应商
     */
    public String getCustomerId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.CUSTOMER_INFO</code>.
     * 「customerInfo」- 实际供应商联系信息
     */
    public IPInTicket setCustomerInfo(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.CUSTOMER_INFO</code>.
     * 「customerInfo」- 实际供应商联系信息
     */
    public String getCustomerInfo();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.PAYED_AT</code>. 「payedAt」- 结算日期
     */
    public IPInTicket setPayedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.PAYED_AT</code>. 「payedAt」- 结算日期
     */
    public LocalDateTime getPayedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.PAYED_DAY</code>. 「payedDay」-
     * 采购期限
     */
    public IPInTicket setPayedDay(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.PAYED_DAY</code>. 「payedDay」-
     * 采购期限
     */
    public Integer getPayedDay();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.OP_AT</code>. 「opAt」- 单据日期
     */
    public IPInTicket setOpAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.OP_AT</code>. 「opAt」- 单据日期
     */
    public LocalDateTime getOpAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.OP_BY</code>. 「opBy」- 业务员
     */
    public IPInTicket setOpBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.OP_BY</code>. 「opBy」- 业务员
     */
    public String getOpBy();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.OP_DEPT</code>. 「opDept」- 业务部门
     */
    public IPInTicket setOpDept(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.OP_DEPT</code>. 「opDept」- 业务部门
     */
    public String getOpDept();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    public IPInTicket setTags(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    public String getTags();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    public IPInTicket setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.SOURCE</code>. 「source」- 单据来源
     */
    public IPInTicket setSource(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.SOURCE</code>. 「source」- 单据来源
     */
    public String getSource();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TAX_AMOUNT</code>. 「taxAmount」-
     * 税额
     */
    public IPInTicket setTaxAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TAX_AMOUNT</code>. 「taxAmount」-
     * 税额
     */
    public BigDecimal getTaxAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.AMOUNT</code>. 「amount」- 入库单总额
     */
    public IPInTicket setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.AMOUNT</code>. 「amount」- 入库单总额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    public IPInTicket setAmountTotal(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.AMOUNT_TOTAL</code>.
     * 「amountTotal」- 税价合计
     */
    public BigDecimal getAmountTotal();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.APPROVED_BY</code>. 「approvedBy」-
     * 审核人
     */
    public IPInTicket setApprovedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.APPROVED_BY</code>. 「approvedBy」-
     * 审核人
     */
    public String getApprovedBy();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.APPROVED_AT</code>. 「approvedAt」-
     * 审核时间
     */
    public IPInTicket setApprovedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.APPROVED_AT</code>. 「approvedAt」-
     * 审核时间
     */
    public LocalDateTime getApprovedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    public IPInTicket setToId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    public String getToId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.TO_ADDRESS</code>. 「toAddress」-
     * 收货地址
     */
    public IPInTicket setToAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.TO_ADDRESS</code>. 「toAddress」-
     * 收货地址
     */
    public String getToAddress();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.FROM_ID</code>. 「fromId」- 发货地址ID
     */
    public IPInTicket setFromId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.FROM_ID</code>. 「fromId」- 发货地址ID
     */
    public String getFromId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.FROM_ADDRESS</code>.
     * 「fromAddress」- 发货地址
     */
    public IPInTicket setFromAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.FROM_ADDRESS</code>.
     * 「fromAddress」- 发货地址
     */
    public String getFromAddress();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.CURRENCY_ID</code>. 「currencyId」-
     * 币种
     */
    public IPInTicket setCurrencyId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.CURRENCY_ID</code>. 「currencyId」-
     * 币种
     */
    public String getCurrencyId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public IPInTicket setCompanyId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public String getCompanyId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    public IPInTicket setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPInTicket setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    public IPInTicket setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IPInTicket setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IPInTicket setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IPInTicket setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IPInTicket setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IPInTicket setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPInTicket
     */
    public void from(IPInTicket from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPInTicket
     */
    public <E extends IPInTicket> E into(E into);

    @Override
    public default IPInTicket fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setSerial, json::getString, "SERIAL", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setTypeBusiness, json::getString, "TYPE_BUSINESS", "java.lang.String");
        setOrThrow(this::setStatus, json::getString, "STATUS", "java.lang.String");
        setOrThrow(this::setWhId, json::getString, "WH_ID", "java.lang.String");
        setOrThrow(this::setCustomerId, json::getString, "CUSTOMER_ID", "java.lang.String");
        setOrThrow(this::setCustomerInfo, json::getString, "CUSTOMER_INFO", "java.lang.String");
        setOrThrow(this::setPayedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "PAYED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setPayedDay, json::getInteger, "PAYED_DAY", "java.lang.Integer");
        setOrThrow(this::setOpAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "OP_AT", "java.time.LocalDateTime");
        setOrThrow(this::setOpBy, json::getString, "OP_BY", "java.lang.String");
        setOrThrow(this::setOpDept, json::getString, "OP_DEPT", "java.lang.String");
        setOrThrow(this::setTags, json::getString, "TAGS", "java.lang.String");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setSource, json::getString, "SOURCE", "java.lang.String");
        // Omitting unrecognized type java.math.BigDecimal for column TAX_AMOUNT!
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        setOrThrow(this::setApprovedBy, json::getString, "APPROVED_BY", "java.lang.String");
        setOrThrow(this::setApprovedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "APPROVED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setToId, json::getString, "TO_ID", "java.lang.String");
        setOrThrow(this::setToAddress, json::getString, "TO_ADDRESS", "java.lang.String");
        setOrThrow(this::setFromId, json::getString, "FROM_ID", "java.lang.String");
        setOrThrow(this::setFromAddress, json::getString, "FROM_ADDRESS", "java.lang.String");
        setOrThrow(this::setCurrencyId, json::getString, "CURRENCY_ID", "java.lang.String");
        setOrThrow(this::setCompanyId, json::getString, "COMPANY_ID", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
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
        json.put("SERIAL", getSerial());
        json.put("TYPE", getType());
        json.put("TYPE_BUSINESS", getTypeBusiness());
        json.put("STATUS", getStatus());
        json.put("WH_ID", getWhId());
        json.put("CUSTOMER_ID", getCustomerId());
        json.put("CUSTOMER_INFO", getCustomerInfo());
        json.put("PAYED_AT", getPayedAt() == null ? null : getPayedAt().toString());
        json.put("PAYED_DAY", getPayedDay());
        json.put("OP_AT", getOpAt() == null ? null : getOpAt().toString());
        json.put("OP_BY", getOpBy());
        json.put("OP_DEPT", getOpDept());
        json.put("TAGS", getTags());
        json.put("COMMENT", getComment());
        json.put("SOURCE", getSource());
        // Omitting unrecognized type java.math.BigDecimal for column TAX_AMOUNT!
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        json.put("APPROVED_BY", getApprovedBy());
        json.put("APPROVED_AT", getApprovedAt() == null ? null : getApprovedAt().toString());
        json.put("TO_ID", getToId());
        json.put("TO_ADDRESS", getToAddress());
        json.put("FROM_ID", getFromId());
        json.put("FROM_ADDRESS", getFromAddress());
        json.put("CURRENCY_ID", getCurrencyId());
        json.put("COMPANY_ID", getCompanyId());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
