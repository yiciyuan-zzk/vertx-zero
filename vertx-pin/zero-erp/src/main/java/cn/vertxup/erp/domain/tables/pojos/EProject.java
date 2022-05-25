/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEProject;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EProject implements VertxPojo, IEProject {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private String        status;
    private String        title;
    private String        icon;
    private String        description;
    private String        leadBy;
    private String        metadata;
    private Boolean       active;
    private String        sigma;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public EProject() {}

    public EProject(IEProject value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.title = value.getTitle();
        this.icon = value.getIcon();
        this.description = value.getDescription();
        this.leadBy = value.getLeadBy();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EProject(
        String        key,
        String        name,
        String        code,
        String        type,
        String        status,
        String        title,
        String        icon,
        String        description,
        String        leadBy,
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
        this.icon = icon;
        this.description = description;
        this.leadBy = leadBy;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EProject(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public EProject setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public EProject setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public EProject setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.TYPE</code>. 「type」-
     * 项目分类（不同类型代表不同项目）
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.TYPE</code>. 「type」-
     * 项目分类（不同类型代表不同项目）
     */
    @Override
    public EProject setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.STATUS</code>. 「status」- 项目状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.STATUS</code>. 「status」- 项目状态
     */
    @Override
    public EProject setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public EProject setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public String getIcon() {
        return this.icon;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public EProject setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public EProject setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public String getLeadBy() {
        return this.leadBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public EProject setLeadBy(String leadBy) {
        this.leadBy = leadBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EProject setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EProject setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public EProject setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EProject setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public EProject setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EProject setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public EProject setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EProject setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EProject (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(title);
        sb.append(", ").append(icon);
        sb.append(", ").append(description);
        sb.append(", ").append(leadBy);
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
    public void from(IEProject from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setTitle(from.getTitle());
        setIcon(from.getIcon());
        setDescription(from.getDescription());
        setLeadBy(from.getLeadBy());
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
    public <E extends IEProject> E into(E into) {
        into.from(this);
        return into;
    }
}
