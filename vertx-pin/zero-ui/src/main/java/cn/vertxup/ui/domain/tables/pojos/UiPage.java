/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IUiPage;

import javax.annotation.Generated;
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
public class UiPage implements IUiPage {

    private static final long serialVersionUID = 1014627302;

    private String key;
    private String app;
    private String module;
    private String page;
    private String layoutId;
    private Boolean secure;
    private String paramMap;
    private String containerName;
    private String containerConfig;
    private String state;
    private String grid;
    private String assist;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public UiPage() {
    }

    public UiPage(UiPage value) {
        this.key = value.key;
        this.app = value.app;
        this.module = value.module;
        this.page = value.page;
        this.layoutId = value.layoutId;
        this.secure = value.secure;
        this.paramMap = value.paramMap;
        this.containerName = value.containerName;
        this.containerConfig = value.containerConfig;
        this.state = value.state;
        this.grid = value.grid;
        this.assist = value.assist;
        this.active = value.active;
        this.sigma = value.sigma;
        this.metadata = value.metadata;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public UiPage(
        String key,
        String app,
        String module,
        String page,
        String layoutId,
        Boolean secure,
        String paramMap,
        String containerName,
        String containerConfig,
        String state,
        String grid,
        String assist,
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
        this.app = app;
        this.module = module;
        this.page = page;
        this.layoutId = layoutId;
        this.secure = secure;
        this.paramMap = paramMap;
        this.containerName = containerName;
        this.containerConfig = containerConfig;
        this.state = state;
        this.grid = grid;
        this.assist = assist;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public UiPage(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public UiPage setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getApp() {
        return this.app;
    }

    @Override
    public UiPage setApp(String app) {
        this.app = app;
        return this;
    }

    @Override
    public String getModule() {
        return this.module;
    }

    @Override
    public UiPage setModule(String module) {
        this.module = module;
        return this;
    }

    @Override
    public String getPage() {
        return this.page;
    }

    @Override
    public UiPage setPage(String page) {
        this.page = page;
        return this;
    }

    @Override
    public String getLayoutId() {
        return this.layoutId;
    }

    @Override
    public UiPage setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    @Override
    public Boolean getSecure() {
        return this.secure;
    }

    @Override
    public UiPage setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    @Override
    public String getParamMap() {
        return this.paramMap;
    }

    @Override
    public UiPage setParamMap(String paramMap) {
        this.paramMap = paramMap;
        return this;
    }

    @Override
    public String getContainerName() {
        return this.containerName;
    }

    @Override
    public UiPage setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    @Override
    public String getContainerConfig() {
        return this.containerConfig;
    }

    @Override
    public UiPage setContainerConfig(String containerConfig) {
        this.containerConfig = containerConfig;
        return this;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public UiPage setState(String state) {
        this.state = state;
        return this;
    }

    @Override
    public String getGrid() {
        return this.grid;
    }

    @Override
    public UiPage setGrid(String grid) {
        this.grid = grid;
        return this;
    }

    @Override
    public String getAssist() {
        return this.assist;
    }

    @Override
    public UiPage setAssist(String assist) {
        this.assist = assist;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public UiPage setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public UiPage setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public UiPage setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public UiPage setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public UiPage setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public UiPage setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public UiPage setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public UiPage setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UiPage (");

        sb.append(key);
        sb.append(", ").append(app);
        sb.append(", ").append(module);
        sb.append(", ").append(page);
        sb.append(", ").append(layoutId);
        sb.append(", ").append(secure);
        sb.append(", ").append(paramMap);
        sb.append(", ").append(containerName);
        sb.append(", ").append(containerConfig);
        sb.append(", ").append(state);
        sb.append(", ").append(grid);
        sb.append(", ").append(assist);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUiPage from) {
        setKey(from.getKey());
        setApp(from.getApp());
        setModule(from.getModule());
        setPage(from.getPage());
        setLayoutId(from.getLayoutId());
        setSecure(from.getSecure());
        setParamMap(from.getParamMap());
        setContainerName(from.getContainerName());
        setContainerConfig(from.getContainerConfig());
        setState(from.getState());
        setGrid(from.getGrid());
        setAssist(from.getAssist());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IUiPage> E into(E into) {
        into.from(this);
        return into;
    }
}
