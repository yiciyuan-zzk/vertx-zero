/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IUiColumn;

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
public class UiColumn implements IUiColumn {

    private static final long serialVersionUID = 959200518;

    private String key;
    private String title;
    private String dataIndex;
    private Integer position;
    private String render;
    private Integer width;
    private Boolean fixed;
    private String className;
    private Boolean sorter;
    private String filterType;
    private String filterConfig;
    private String empty;
    private String mapping;
    private String config;
    private String option;
    private String format;
    private String datum;
    private String controlId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public UiColumn() {
    }

    public UiColumn(UiColumn value) {
        this.key = value.key;
        this.title = value.title;
        this.dataIndex = value.dataIndex;
        this.position = value.position;
        this.render = value.render;
        this.width = value.width;
        this.fixed = value.fixed;
        this.className = value.className;
        this.sorter = value.sorter;
        this.filterType = value.filterType;
        this.filterConfig = value.filterConfig;
        this.empty = value.empty;
        this.mapping = value.mapping;
        this.config = value.config;
        this.option = value.option;
        this.format = value.format;
        this.datum = value.datum;
        this.controlId = value.controlId;
        this.active = value.active;
        this.sigma = value.sigma;
        this.metadata = value.metadata;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public UiColumn(
        String key,
        String title,
        String dataIndex,
        Integer position,
        String render,
        Integer width,
        Boolean fixed,
        String className,
        Boolean sorter,
        String filterType,
        String filterConfig,
        String empty,
        String mapping,
        String config,
        String option,
        String format,
        String datum,
        String controlId,
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
        this.title = title;
        this.dataIndex = dataIndex;
        this.position = position;
        this.render = render;
        this.width = width;
        this.fixed = fixed;
        this.className = className;
        this.sorter = sorter;
        this.filterType = filterType;
        this.filterConfig = filterConfig;
        this.empty = empty;
        this.mapping = mapping;
        this.config = config;
        this.option = option;
        this.format = format;
        this.datum = datum;
        this.controlId = controlId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public UiColumn(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public UiColumn setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public UiColumn setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String getDataIndex() {
        return this.dataIndex;
    }

    @Override
    public UiColumn setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
        return this;
    }

    @Override
    public Integer getPosition() {
        return this.position;
    }

    @Override
    public UiColumn setPosition(Integer position) {
        this.position = position;
        return this;
    }

    @Override
    public String getRender() {
        return this.render;
    }

    @Override
    public UiColumn setRender(String render) {
        this.render = render;
        return this;
    }

    @Override
    public Integer getWidth() {
        return this.width;
    }

    @Override
    public UiColumn setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public Boolean getFixed() {
        return this.fixed;
    }

    @Override
    public UiColumn setFixed(Boolean fixed) {
        this.fixed = fixed;
        return this;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public UiColumn setClassName(String className) {
        this.className = className;
        return this;
    }

    @Override
    public Boolean getSorter() {
        return this.sorter;
    }

    @Override
    public UiColumn setSorter(Boolean sorter) {
        this.sorter = sorter;
        return this;
    }

    @Override
    public String getFilterType() {
        return this.filterType;
    }

    @Override
    public UiColumn setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    @Override
    public String getFilterConfig() {
        return this.filterConfig;
    }

    @Override
    public UiColumn setFilterConfig(String filterConfig) {
        this.filterConfig = filterConfig;
        return this;
    }

    @Override
    public String getEmpty() {
        return this.empty;
    }

    @Override
    public UiColumn setEmpty(String empty) {
        this.empty = empty;
        return this;
    }

    @Override
    public String getMapping() {
        return this.mapping;
    }

    @Override
    public UiColumn setMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }

    @Override
    public String getConfig() {
        return this.config;
    }

    @Override
    public UiColumn setConfig(String config) {
        this.config = config;
        return this;
    }

    @Override
    public String getOption() {
        return this.option;
    }

    @Override
    public UiColumn setOption(String option) {
        this.option = option;
        return this;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public UiColumn setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String getDatum() {
        return this.datum;
    }

    @Override
    public UiColumn setDatum(String datum) {
        this.datum = datum;
        return this;
    }

    @Override
    public String getControlId() {
        return this.controlId;
    }

    @Override
    public UiColumn setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public UiColumn setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public UiColumn setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public UiColumn setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public UiColumn setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public UiColumn setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public UiColumn setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public UiColumn setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public UiColumn setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UiColumn (");

        sb.append(key);
        sb.append(", ").append(title);
        sb.append(", ").append(dataIndex);
        sb.append(", ").append(position);
        sb.append(", ").append(render);
        sb.append(", ").append(width);
        sb.append(", ").append(fixed);
        sb.append(", ").append(className);
        sb.append(", ").append(sorter);
        sb.append(", ").append(filterType);
        sb.append(", ").append(filterConfig);
        sb.append(", ").append(empty);
        sb.append(", ").append(mapping);
        sb.append(", ").append(config);
        sb.append(", ").append(option);
        sb.append(", ").append(format);
        sb.append(", ").append(datum);
        sb.append(", ").append(controlId);
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
    public void from(IUiColumn from) {
        setKey(from.getKey());
        setTitle(from.getTitle());
        setDataIndex(from.getDataIndex());
        setPosition(from.getPosition());
        setRender(from.getRender());
        setWidth(from.getWidth());
        setFixed(from.getFixed());
        setClassName(from.getClassName());
        setSorter(from.getSorter());
        setFilterType(from.getFilterType());
        setFilterConfig(from.getFilterConfig());
        setEmpty(from.getEmpty());
        setMapping(from.getMapping());
        setConfig(from.getConfig());
        setOption(from.getOption());
        setFormat(from.getFormat());
        setDatum(from.getDatum());
        setControlId(from.getControlId());
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
    public <E extends IUiColumn> E into(E into) {
        into.from(this);
        return into;
    }
}
