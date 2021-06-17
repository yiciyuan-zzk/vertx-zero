/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMAcc;

import java.time.LocalDateTime;

import javax.annotation.Generated;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MAcc implements IMAcc {

    private static final long serialVersionUID = 1815548291;

    private String        key;
    private String        modelId;
    private String        modelKey;
    private String        recordJson;
    private String        recordRaw;
    private String        recordUnique;
    private String        sigma;
    private String        language;
    private Boolean       active;
    private String        metadata;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public MAcc() {}

    public MAcc(MAcc value) {
        this.key = value.key;
        this.modelId = value.modelId;
        this.modelKey = value.modelKey;
        this.recordJson = value.recordJson;
        this.recordRaw = value.recordRaw;
        this.recordUnique = value.recordUnique;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public MAcc(
        String        key,
        String        modelId,
        String        modelKey,
        String        recordJson,
        String        recordRaw,
        String        recordUnique,
        String        sigma,
        String        language,
        Boolean       active,
        String        metadata,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.recordJson = recordJson;
        this.recordRaw = recordRaw;
        this.recordUnique = recordUnique;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public MAcc setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getModelId() {
        return this.modelId;
    }

    @Override
    public MAcc setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    @Override
    public MAcc setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    @Override
    public String getRecordJson() {
        return this.recordJson;
    }

    @Override
    public MAcc setRecordJson(String recordJson) {
        this.recordJson = recordJson;
        return this;
    }

    @Override
    public String getRecordRaw() {
        return this.recordRaw;
    }

    @Override
    public MAcc setRecordRaw(String recordRaw) {
        this.recordRaw = recordRaw;
        return this;
    }

    @Override
    public String getRecordUnique() {
        return this.recordUnique;
    }

    @Override
    public MAcc setRecordUnique(String recordUnique) {
        this.recordUnique = recordUnique;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public MAcc setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public MAcc setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public MAcc setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public MAcc setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public MAcc setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public MAcc setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public MAcc setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public MAcc setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MAcc (");

        sb.append(key);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(recordJson);
        sb.append(", ").append(recordRaw);
        sb.append(", ").append(recordUnique);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMAcc from) {
        setKey(from.getKey());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setRecordJson(from.getRecordJson());
        setRecordRaw(from.getRecordRaw());
        setRecordUnique(from.getRecordUnique());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMAcc> E into(E into) {
        into.from(this);
        return into;
    }

    public MAcc(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
