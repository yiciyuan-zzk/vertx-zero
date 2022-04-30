/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IECompany;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ECompany implements VertxPojo, IECompany {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String alias;
    private String title;
    private String code;
    private String comment;
    private String taxCode;
    private String taxTitle;
    private String email;
    private String fax;
    private String homepage;
    private String logo;
    private String phone;
    private String address;
    private String locationId;
    private String corporationName;
    private String corporationPhone;
    private String contactName;
    private String contactPhone;
    private String contactOnline;
    private String companyId;
    private String customerId;
    private String type;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public ECompany() {
    }

    public ECompany(IECompany value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.alias = value.getAlias();
        this.title = value.getTitle();
        this.code = value.getCode();
        this.comment = value.getComment();
        this.taxCode = value.getTaxCode();
        this.taxTitle = value.getTaxTitle();
        this.email = value.getEmail();
        this.fax = value.getFax();
        this.homepage = value.getHomepage();
        this.logo = value.getLogo();
        this.phone = value.getPhone();
        this.address = value.getAddress();
        this.locationId = value.getLocationId();
        this.corporationName = value.getCorporationName();
        this.corporationPhone = value.getCorporationPhone();
        this.contactName = value.getContactName();
        this.contactPhone = value.getContactPhone();
        this.contactOnline = value.getContactOnline();
        this.companyId = value.getCompanyId();
        this.customerId = value.getCustomerId();
        this.type = value.getType();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public ECompany(
        String key,
        String name,
        String alias,
        String title,
        String code,
        String comment,
        String taxCode,
        String taxTitle,
        String email,
        String fax,
        String homepage,
        String logo,
        String phone,
        String address,
        String locationId,
        String corporationName,
        String corporationPhone,
        String contactName,
        String contactPhone,
        String contactOnline,
        String companyId,
        String customerId,
        String type,
        String metadata,
        Boolean active,
        String sigma,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.alias = alias;
        this.title = title;
        this.code = code;
        this.comment = comment;
        this.taxCode = taxCode;
        this.taxTitle = taxTitle;
        this.email = email;
        this.fax = fax;
        this.homepage = homepage;
        this.logo = logo;
        this.phone = phone;
        this.address = address;
        this.locationId = locationId;
        this.corporationName = corporationName;
        this.corporationPhone = corporationPhone;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactOnline = contactOnline;
        this.companyId = companyId;
        this.customerId = customerId;
        this.type = type;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public ECompany(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    @Override
    public ECompany setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    @Override
    public ECompany setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    @Override
    public String getAlias() {
        return this.alias;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    @Override
    public ECompany setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    @Override
    public ECompany setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    @Override
    public ECompany setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    @Override
    public ECompany setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    @Override
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    @Override
    public ECompany setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public String getTaxTitle() {
        return this.taxTitle;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public ECompany setTaxTitle(String taxTitle) {
        this.taxTitle = taxTitle;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public ECompany setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    @Override
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    @Override
    public ECompany setFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    @Override
    public String getHomepage() {
        return this.homepage;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    @Override
    public ECompany setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的
     * attachment Key
     */
    @Override
    public String getLogo() {
        return this.logo;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的
     * attachment Key
     */
    @Override
    public ECompany setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    @Override
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    @Override
    public ECompany setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    @Override
    public ECompany setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」-
     * 启用LBS时对应的Location主键
     */
    @Override
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」-
     * 启用LBS时对应的Location主键
     */
    @Override
    public ECompany setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>.
     * 「corporationName」- 企业法人
     */
    @Override
    public String getCorporationName() {
        return this.corporationName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>.
     * 「corporationName」- 企业法人
     */
    @Override
    public ECompany setCorporationName(String corporationName) {
        this.corporationName = corporationName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>.
     * 「corporationPhone」- 法人电话
     */
    @Override
    public String getCorporationPhone() {
        return this.corporationPhone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>.
     * 「corporationPhone」- 法人电话
     */
    @Override
    public ECompany setCorporationPhone(String corporationPhone) {
        this.corporationPhone = corporationPhone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」-
     * 联系人电话
     */
    @Override
    public String getContactName() {
        return this.contactName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」-
     * 联系人电话
     */
    @Override
    public ECompany setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>.
     * 「contactPhone」- 联系人电话
     */
    @Override
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>.
     * 「contactPhone」- 联系人电话
     */
    @Override
    public ECompany setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>.
     * 「contactOnline」- 在线联系方式
     */
    @Override
    public String getContactOnline() {
        return this.contactOnline;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>.
     * 「contactOnline」- 在线联系方式
     */
    @Override
    public ECompany setContactOnline(String contactOnline) {
        this.contactOnline = contactOnline;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」-
     * 公司、子公司结构时需要
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」-
     * 公司、子公司结构时需要
     */
    @Override
    public ECompany setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」-
     * 公司作为客户时的客户信息
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」-
     * 公司作为客户时的客户信息
     */
    @Override
    public ECompany setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    @Override
    public ECompany setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ECompany setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ECompany setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public ECompany setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ECompany setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public ECompany setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ECompany setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public ECompany setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ECompany setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ECompany (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(alias);
        sb.append(", ").append(title);
        sb.append(", ").append(code);
        sb.append(", ").append(comment);
        sb.append(", ").append(taxCode);
        sb.append(", ").append(taxTitle);
        sb.append(", ").append(email);
        sb.append(", ").append(fax);
        sb.append(", ").append(homepage);
        sb.append(", ").append(logo);
        sb.append(", ").append(phone);
        sb.append(", ").append(address);
        sb.append(", ").append(locationId);
        sb.append(", ").append(corporationName);
        sb.append(", ").append(corporationPhone);
        sb.append(", ").append(contactName);
        sb.append(", ").append(contactPhone);
        sb.append(", ").append(contactOnline);
        sb.append(", ").append(companyId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(type);
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
    public void from(IECompany from) {
        setKey(from.getKey());
        setName(from.getName());
        setAlias(from.getAlias());
        setTitle(from.getTitle());
        setCode(from.getCode());
        setComment(from.getComment());
        setTaxCode(from.getTaxCode());
        setTaxTitle(from.getTaxTitle());
        setEmail(from.getEmail());
        setFax(from.getFax());
        setHomepage(from.getHomepage());
        setLogo(from.getLogo());
        setPhone(from.getPhone());
        setAddress(from.getAddress());
        setLocationId(from.getLocationId());
        setCorporationName(from.getCorporationName());
        setCorporationPhone(from.getCorporationPhone());
        setContactName(from.getContactName());
        setContactPhone(from.getContactPhone());
        setContactOnline(from.getContactOnline());
        setCompanyId(from.getCompanyId());
        setCustomerId(from.getCustomerId());
        setType(from.getType());
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
    public <E extends IECompany> E into(E into) {
        into.from(this);
        return into;
    }
}
