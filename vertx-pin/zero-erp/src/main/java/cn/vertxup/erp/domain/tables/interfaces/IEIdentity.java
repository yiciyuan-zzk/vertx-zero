/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IEIdentity extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    public IEIdentity setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    public IEIdentity setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    public IEIdentity setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    public IEIdentity setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    public String getCountry();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    public IEIdentity setCountry(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    public String getNativePlace();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    public IEIdentity setNativePlace(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    public String getNation();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    public IEIdentity setNation(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    public String getAddress();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    public IEIdentity setAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    public String getRealname();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    public IEIdentity setRealname(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    public LocalDateTime getBirthday();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    public IEIdentity setBirthday(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」- 驾驶证
     */
    public String getDriverLicense();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」- 驾驶证
     */
    public IEIdentity setDriverLicense(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    public String getCarPlate();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    public IEIdentity setCarPlate(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    public String getPassport();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    public IEIdentity setPassport(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    public Boolean getGender();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    public IEIdentity setGender(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    public String getMarital();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    public IEIdentity setMarital(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」- 联系手机
     */
    public String getContactMobile();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」- 联系手机
     */
    public IEIdentity setContactMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    public String getContactPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    public IEIdentity setContactPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」- 联系地址
     */
    public String getContactAddress();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」- 联系地址
     */
    public IEIdentity setContactAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」- 联系Email
     */
    public String getContactEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」- 联系Email
     */
    public IEIdentity setContactEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    public String getUrgentName();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    public IEIdentity setUrgentName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」- 紧急联系电话
     */
    public String getUrgentPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」- 紧急联系电话
     */
    public IEIdentity setUrgentPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    public String getEcQq();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    public IEIdentity setEcQq(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    public String getEcAlipay();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    public IEIdentity setEcAlipay(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    public String getEcWechat();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    public IEIdentity setEcWechat(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    public String getIdcType();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    public IEIdentity setIdcType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    public String getIdcNumber();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    public IEIdentity setIdcNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    public String getIdcAddress();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    public IEIdentity setIdcAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」- 证件过期时间
     */
    public LocalDateTime getIdcExpiredAt();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」- 证件过期时间
     */
    public IEIdentity setIdcExpiredAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    public String getIdcFront();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    public IEIdentity setIdcFront(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    public String getIdcBack();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    public IEIdentity setIdcBack(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    public String getIdcIssuer();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    public IEIdentity setIdcIssuer(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    public LocalDateTime getIdcIssueAt();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    public IEIdentity setIdcIssueAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    public Boolean getVerified();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    public IEIdentity setVerified(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    public IEIdentity setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    public IEIdentity setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public IEIdentity setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEIdentity setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IEIdentity setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IEIdentity setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IEIdentity setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IEIdentity setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IEIdentity
     */
    public void from(cn.vertxup.erp.domain.tables.interfaces.IEIdentity from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IEIdentity
     */
    public <E extends cn.vertxup.erp.domain.tables.interfaces.IEIdentity> E into(E into);

    default IEIdentity fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setCode(json.getString("CODE"));
        setType(json.getString("TYPE"));
        setStatus(json.getString("STATUS"));
        setCountry(json.getString("COUNTRY"));
        setNativePlace(json.getString("NATIVE_PLACE"));
        setNation(json.getString("NATION"));
        setAddress(json.getString("ADDRESS"));
        setRealname(json.getString("REALNAME"));
        // Omitting unrecognized type java.time.LocalDateTime for column BIRTHDAY!
        setDriverLicense(json.getString("DRIVER_LICENSE"));
        setCarPlate(json.getString("CAR_PLATE"));
        setPassport(json.getString("PASSPORT"));
        setGender(json.getBoolean("GENDER"));
        setMarital(json.getString("MARITAL"));
        setContactMobile(json.getString("CONTACT_MOBILE"));
        setContactPhone(json.getString("CONTACT_PHONE"));
        setContactAddress(json.getString("CONTACT_ADDRESS"));
        setContactEmail(json.getString("CONTACT_EMAIL"));
        setUrgentName(json.getString("URGENT_NAME"));
        setUrgentPhone(json.getString("URGENT_PHONE"));
        setEcQq(json.getString("EC_QQ"));
        setEcAlipay(json.getString("EC_ALIPAY"));
        setEcWechat(json.getString("EC_WECHAT"));
        setIdcType(json.getString("IDC_TYPE"));
        setIdcNumber(json.getString("IDC_NUMBER"));
        setIdcAddress(json.getString("IDC_ADDRESS"));
        // Omitting unrecognized type java.time.LocalDateTime for column IDC_EXPIRED_AT!
        setIdcFront(json.getString("IDC_FRONT"));
        setIdcBack(json.getString("IDC_BACK"));
        setIdcIssuer(json.getString("IDC_ISSUER"));
        // Omitting unrecognized type java.time.LocalDateTime for column IDC_ISSUE_AT!
        setVerified(json.getBoolean("VERIFIED"));
        setMetadata(json.getString("METADATA"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("CODE", getCode());
        json.put("TYPE", getType());
        json.put("STATUS", getStatus());
        json.put("COUNTRY", getCountry());
        json.put("NATIVE_PLACE", getNativePlace());
        json.put("NATION", getNation());
        json.put("ADDRESS", getAddress());
        json.put("REALNAME", getRealname());
        // Omitting unrecognized type java.time.LocalDateTime for column BIRTHDAY!
        json.put("DRIVER_LICENSE", getDriverLicense());
        json.put("CAR_PLATE", getCarPlate());
        json.put("PASSPORT", getPassport());
        json.put("GENDER", getGender());
        json.put("MARITAL", getMarital());
        json.put("CONTACT_MOBILE", getContactMobile());
        json.put("CONTACT_PHONE", getContactPhone());
        json.put("CONTACT_ADDRESS", getContactAddress());
        json.put("CONTACT_EMAIL", getContactEmail());
        json.put("URGENT_NAME", getUrgentName());
        json.put("URGENT_PHONE", getUrgentPhone());
        json.put("EC_QQ", getEcQq());
        json.put("EC_ALIPAY", getEcAlipay());
        json.put("EC_WECHAT", getEcWechat());
        json.put("IDC_TYPE", getIdcType());
        json.put("IDC_NUMBER", getIdcNumber());
        json.put("IDC_ADDRESS", getIdcAddress());
        // Omitting unrecognized type java.time.LocalDateTime for column IDC_EXPIRED_AT!
        json.put("IDC_FRONT", getIdcFront());
        json.put("IDC_BACK", getIdcBack());
        json.put("IDC_ISSUER", getIdcIssuer());
        // Omitting unrecognized type java.time.LocalDateTime for column IDC_ISSUE_AT!
        json.put("VERIFIED", getVerified());
        json.put("METADATA", getMetadata());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
