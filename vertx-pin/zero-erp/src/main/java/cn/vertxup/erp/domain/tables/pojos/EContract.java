/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEContract;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EContract implements VertxPojo, IEContract {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private String        status;
    private String        title;
    private String        description;
    private BigDecimal    amount;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private LocalDateTime signedAt;
    private String        partyA;
    private String        partyB;
    private String        partyC;
    private String        aName;
    private String        aPhone;
    private String        aLegal;
    private String        aAddress;
    private String        bName;
    private String        bPhone;
    private String        bLegal;
    private String        bAddress;
    private String        cName;
    private String        cPhone;
    private String        cLegal;
    private String        cAddress;
    private String        metadata;
    private Boolean       active;
    private String        sigma;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public EContract() {}

    public EContract(IEContract value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.title = value.getTitle();
        this.description = value.getDescription();
        this.amount = value.getAmount();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.signedAt = value.getSignedAt();
        this.partyA = value.getPartyA();
        this.partyB = value.getPartyB();
        this.partyC = value.getPartyC();
        this.aName = value.getAName();
        this.aPhone = value.getAPhone();
        this.aLegal = value.getALegal();
        this.aAddress = value.getAAddress();
        this.bName = value.getBName();
        this.bPhone = value.getBPhone();
        this.bLegal = value.getBLegal();
        this.bAddress = value.getBAddress();
        this.cName = value.getCName();
        this.cPhone = value.getCPhone();
        this.cLegal = value.getCLegal();
        this.cAddress = value.getCAddress();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EContract(
        String        key,
        String        name,
        String        code,
        String        type,
        String        status,
        String        title,
        String        description,
        BigDecimal    amount,
        LocalDateTime startAt,
        LocalDateTime endAt,
        LocalDateTime signedAt,
        String        partyA,
        String        partyB,
        String        partyC,
        String        aName,
        String        aPhone,
        String        aLegal,
        String        aAddress,
        String        bName,
        String        bPhone,
        String        bLegal,
        String        bAddress,
        String        cName,
        String        cPhone,
        String        cLegal,
        String        cAddress,
        String        metadata,
        Boolean       active,
        String        sigma,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.status = status;
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.startAt = startAt;
        this.endAt = endAt;
        this.signedAt = signedAt;
        this.partyA = partyA;
        this.partyB = partyB;
        this.partyC = partyC;
        this.aName = aName;
        this.aPhone = aPhone;
        this.aLegal = aLegal;
        this.aAddress = aAddress;
        this.bName = bName;
        this.bPhone = bPhone;
        this.bLegal = bLegal;
        this.bAddress = bAddress;
        this.cName = cName;
        this.cPhone = cPhone;
        this.cLegal = cLegal;
        this.cAddress = cAddress;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EContract(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public EContract setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public EContract setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public EContract setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.TYPE</code>. 「type」- 合同分类
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.TYPE</code>. 「type」- 合同分类
     */
    @Override
    public EContract setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.STATUS</code>. 「status」- 合同状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.STATUS</code>. 「status」- 合同状态
     */
    @Override
    public EContract setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public EContract setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.DESCRIPTION</code>. 「description」-
     * 合同详细描述
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.DESCRIPTION</code>. 「description」-
     * 合同详细描述
     */
    @Override
    public EContract setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public EContract setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.START_AT</code>. 「startAt」- 生效时间
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.START_AT</code>. 「startAt」- 生效时间
     */
    @Override
    public EContract setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.END_AT</code>. 「endAt」- 终止时间
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.END_AT</code>. 「endAt」- 终止时间
     */
    @Override
    public EContract setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public LocalDateTime getSignedAt() {
        return this.signedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public EContract setSignedAt(LocalDateTime signedAt) {
        this.signedAt = signedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    @Override
    public String getPartyA() {
        return this.partyA;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    @Override
    public EContract setPartyA(String partyA) {
        this.partyA = partyA;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public String getPartyB() {
        return this.partyB;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public EContract setPartyB(String partyB) {
        this.partyB = partyB;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.PARTY_C</code>. 「partyC」-
     * 丙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public String getPartyC() {
        return this.partyC;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.PARTY_C</code>. 「partyC」-
     * 丙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public EContract setPartyC(String partyC) {
        this.partyC = partyC;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public String getAName() {
        return this.aName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public EContract setAName(String aName) {
        this.aName = aName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方签订人电话
     */
    @Override
    public String getAPhone() {
        return this.aPhone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方签订人电话
     */
    @Override
    public EContract setAPhone(String aPhone) {
        this.aPhone = aPhone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_LEGAL</code>. 「aLegal」-
     * 甲方法人（企业合同专用）
     */
    @Override
    public String getALegal() {
        return this.aLegal;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_LEGAL</code>. 「aLegal」-
     * 甲方法人（企业合同专用）
     */
    @Override
    public EContract setALegal(String aLegal) {
        this.aLegal = aLegal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_ADDRESS</code>. 「aAddress」-
     * 甲方联系地址
     */
    @Override
    public String getAAddress() {
        return this.aAddress;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_ADDRESS</code>. 「aAddress」-
     * 甲方联系地址
     */
    @Override
    public EContract setAAddress(String aAddress) {
        this.aAddress = aAddress;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public String getBName() {
        return this.bName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public EContract setBName(String bName) {
        this.bName = bName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方签订人电话
     */
    @Override
    public String getBPhone() {
        return this.bPhone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方签订人电话
     */
    @Override
    public EContract setBPhone(String bPhone) {
        this.bPhone = bPhone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_LEGAL</code>. 「bLegal」-
     * 乙方法人（企业合同专用）
     */
    @Override
    public String getBLegal() {
        return this.bLegal;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_LEGAL</code>. 「bLegal」-
     * 乙方法人（企业合同专用）
     */
    @Override
    public EContract setBLegal(String bLegal) {
        this.bLegal = bLegal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_ADDRESS</code>. 「bAddress」-
     * 乙方联系地址
     */
    @Override
    public String getBAddress() {
        return this.bAddress;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_ADDRESS</code>. 「bAddress」-
     * 乙方联系地址
     */
    @Override
    public EContract setBAddress(String bAddress) {
        this.bAddress = bAddress;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.C_NAME</code>. 「cName」-
     * 丙方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public String getCName() {
        return this.cName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.C_NAME</code>. 「cName」-
     * 丙方签订名称（个人为姓名/企业为企业名）
     */
    @Override
    public EContract setCName(String cName) {
        this.cName = cName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.C_PHONE</code>. 「cPhone」- 丙方签订人电话
     */
    @Override
    public String getCPhone() {
        return this.cPhone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.C_PHONE</code>. 「cPhone」- 丙方签订人电话
     */
    @Override
    public EContract setCPhone(String cPhone) {
        this.cPhone = cPhone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.C_LEGAL</code>. 「cLegal」-
     * 丙方法人（企业合同专用）
     */
    @Override
    public String getCLegal() {
        return this.cLegal;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.C_LEGAL</code>. 「cLegal」-
     * 丙方法人（企业合同专用）
     */
    @Override
    public EContract setCLegal(String cLegal) {
        this.cLegal = cLegal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.C_ADDRESS</code>. 「cAddress」-
     * 丙方联系地址
     */
    @Override
    public String getCAddress() {
        return this.cAddress;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.C_ADDRESS</code>. 「cAddress」-
     * 丙方联系地址
     */
    @Override
    public EContract setCAddress(String cAddress) {
        this.cAddress = cAddress;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EContract setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EContract setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    @Override
    public EContract setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EContract setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public EContract setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public EContract setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public EContract setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public EContract setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EContract (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(amount);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
        sb.append(", ").append(signedAt);
        sb.append(", ").append(partyA);
        sb.append(", ").append(partyB);
        sb.append(", ").append(partyC);
        sb.append(", ").append(aName);
        sb.append(", ").append(aPhone);
        sb.append(", ").append(aLegal);
        sb.append(", ").append(aAddress);
        sb.append(", ").append(bName);
        sb.append(", ").append(bPhone);
        sb.append(", ").append(bLegal);
        sb.append(", ").append(bAddress);
        sb.append(", ").append(cName);
        sb.append(", ").append(cPhone);
        sb.append(", ").append(cLegal);
        sb.append(", ").append(cAddress);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
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
    public void from(IEContract from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setTitle(from.getTitle());
        setDescription(from.getDescription());
        setAmount(from.getAmount());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setSignedAt(from.getSignedAt());
        setPartyA(from.getPartyA());
        setPartyB(from.getPartyB());
        setPartyC(from.getPartyC());
        setAName(from.getAName());
        setAPhone(from.getAPhone());
        setALegal(from.getALegal());
        setAAddress(from.getAAddress());
        setBName(from.getBName());
        setBPhone(from.getBPhone());
        setBLegal(from.getBLegal());
        setBAddress(from.getBAddress());
        setCName(from.getCName());
        setCPhone(from.getCPhone());
        setCLegal(from.getCLegal());
        setCAddress(from.getCAddress());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEContract> E into(E into) {
        into.from(this);
        return into;
    }
}
