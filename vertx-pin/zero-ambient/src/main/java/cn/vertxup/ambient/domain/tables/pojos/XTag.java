/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXTag;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class XTag implements VertxPojo, IXTag {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String type;
    private String icon;
    private Long sort;
    private Boolean show;
    private String description;
    private String appId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public XTag() {
    }

    public XTag(IXTag value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.type = value.getType();
        this.icon = value.getIcon();
        this.sort = value.getSort();
        this.show = value.getShow();
        this.description = value.getDescription();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XTag(
        String key,
        String name,
        String type,
        String icon,
        Long sort,
        Boolean show,
        String description,
        String appId,
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
        this.name = name;
        this.type = type;
        this.icon = icon;
        this.sort = sort;
        this.show = show;
        this.description = description;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public XTag(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.KEY</code>. 「key」- 标签主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.KEY</code>. 「key」- 标签主键
     */
    @Override
    public XTag setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.NAME</code>. 「name」- 标签名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.NAME</code>. 「name」- 标签名称
     */
    @Override
    public XTag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.TYPE</code>. 「type」- 标签类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.TYPE</code>. 「type」- 标签类型
     */
    @Override
    public XTag setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.ICON</code>. 「icon」- 标签使用的图标
     */
    @Override
    public String getIcon() {
        return this.icon;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.ICON</code>. 「icon」- 标签使用的图标
     */
    @Override
    public XTag setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.SORT</code>. 「sort」- 标签排序
     */
    @Override
    public Long getSort() {
        return this.sort;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.SORT</code>. 「sort」- 标签排序
     */
    @Override
    public XTag setSort(Long sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.SHOW</code>. 「show」- 是否显示在导航栏
     */
    @Override
    public Boolean getShow() {
        return this.show;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.SHOW</code>. 「show」- 是否显示在导航栏
     */
    @Override
    public XTag setShow(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.DESCRIPTION</code>. 「description」- 标签描述
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.DESCRIPTION</code>. 「description」- 标签描述
     */
    @Override
    public XTag setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public XTag setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XTag setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XTag setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XTag setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XTag setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XTag setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XTag setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XTag setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XTag setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XTag (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(icon);
        sb.append(", ").append(sort);
        sb.append(", ").append(show);
        sb.append(", ").append(description);
        sb.append(", ").append(appId);
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
    public void from(IXTag from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setIcon(from.getIcon());
        setSort(from.getSort());
        setShow(from.getShow());
        setDescription(from.getDescription());
        setAppId(from.getAppId());
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
    public <E extends IXTag> E into(E into) {
        into.from(this);
        return into;
    }
}
