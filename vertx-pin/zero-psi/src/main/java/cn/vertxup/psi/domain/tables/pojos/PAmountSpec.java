/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.pojos;


import cn.vertxup.psi.domain.tables.interfaces.IPAmountSpec;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PAmountSpec implements VertxPojo, IPAmountSpec {

    private static final long serialVersionUID = 1L;

    private String key;
    private String serial;
    private String commodityId;
    private String commodityCode;
    private String commodityName;
    private String whId;
    private BigDecimal amountMin;
    private BigDecimal amountMax;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public PAmountSpec() {
    }

    public PAmountSpec(IPAmountSpec value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.commodityId = value.getCommodityId();
        this.commodityCode = value.getCommodityCode();
        this.commodityName = value.getCommodityName();
        this.whId = value.getWhId();
        this.amountMin = value.getAmountMin();
        this.amountMax = value.getAmountMax();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public PAmountSpec(
        String key,
        String serial,
        String commodityId,
        String commodityCode,
        String commodityName,
        String whId,
        BigDecimal amountMin,
        BigDecimal amountMax,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.serial = serial;
        this.commodityId = commodityId;
        this.commodityCode = commodityCode;
        this.commodityName = commodityName;
        this.whId = whId;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public PAmountSpec(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.KEY</code>. 「key」- 物料价目表主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.KEY</code>. 「key」- 物料价目表主键
     */
    @Override
    public PAmountSpec setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SERIAL</code>. 「serial」-
     * 物料价目表号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SERIAL</code>. 「serial」-
     * 物料价目表号（系统可用，直接计算）
     */
    @Override
    public PAmountSpec setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public String getCommodityId() {
        return this.commodityId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    @Override
    public PAmountSpec setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public PAmountSpec setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return this.commodityName;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public PAmountSpec setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.WH_ID</code>. 「whId」- 所属仓库
     */
    @Override
    public String getWhId() {
        return this.whId;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.WH_ID</code>. 「whId」- 所属仓库
     */
    @Override
    public PAmountSpec setWhId(String whId) {
        this.whId = whId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MIN</code>. 「amountMin」-
     * 定价最低
     */
    @Override
    public BigDecimal getAmountMin() {
        return this.amountMin;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MIN</code>. 「amountMin」-
     * 定价最低
     */
    @Override
    public PAmountSpec setAmountMin(BigDecimal amountMin) {
        this.amountMin = amountMin;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MAX</code>. 「amountMax」-
     * 定价最高
     */
    @Override
    public BigDecimal getAmountMax() {
        return this.amountMax;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MAX</code>. 「amountMax」-
     * 定价最高
     */
    @Override
    public PAmountSpec setAmountMax(BigDecimal amountMax) {
        this.amountMax = amountMax;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PAmountSpec setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PAmountSpec setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public PAmountSpec setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public PAmountSpec setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PAmountSpec setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public PAmountSpec setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PAmountSpec setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public PAmountSpec setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PAmountSpec (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(commodityId);
        sb.append(", ").append(commodityCode);
        sb.append(", ").append(commodityName);
        sb.append(", ").append(whId);
        sb.append(", ").append(amountMin);
        sb.append(", ").append(amountMax);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
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
    public void from(IPAmountSpec from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setCommodityId(from.getCommodityId());
        setCommodityCode(from.getCommodityCode());
        setCommodityName(from.getCommodityName());
        setWhId(from.getWhId());
        setAmountMin(from.getAmountMin());
        setAmountMax(from.getAmountMax());
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
    public <E extends IPAmountSpec> E into(E into) {
        into.from(this);
        return into;
    }
}
