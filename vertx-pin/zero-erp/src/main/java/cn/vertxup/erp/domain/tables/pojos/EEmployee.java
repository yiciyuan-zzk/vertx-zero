/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEEmployee;

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
public class EEmployee implements IEEmployee {

    private static final long serialVersionUID = -506728739;

    private String key;
    private String companyId;
    private String deptId;
    private String teamId;
    private String identityId;
    private String viceName;
    private String viceEmail;
    private String viceMobile;
    private String workNumber;
    private String workTitle;
    private String workLocation;
    private String workPhone;
    private String workExtension;
    private String type;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public EEmployee() {
    }

    public EEmployee(EEmployee value) {
        this.key = value.key;
        this.companyId = value.companyId;
        this.deptId = value.deptId;
        this.teamId = value.teamId;
        this.identityId = value.identityId;
        this.viceName = value.viceName;
        this.viceEmail = value.viceEmail;
        this.viceMobile = value.viceMobile;
        this.workNumber = value.workNumber;
        this.workTitle = value.workTitle;
        this.workLocation = value.workLocation;
        this.workPhone = value.workPhone;
        this.workExtension = value.workExtension;
        this.type = value.type;
        this.metadata = value.metadata;
        this.active = value.active;
        this.sigma = value.sigma;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public EEmployee(
        String key,
        String companyId,
        String deptId,
        String teamId,
        String identityId,
        String viceName,
        String viceEmail,
        String viceMobile,
        String workNumber,
        String workTitle,
        String workLocation,
        String workPhone,
        String workExtension,
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
        this.companyId = companyId;
        this.deptId = deptId;
        this.teamId = teamId;
        this.identityId = identityId;
        this.viceName = viceName;
        this.viceEmail = viceEmail;
        this.viceMobile = viceMobile;
        this.workNumber = workNumber;
        this.workTitle = workTitle;
        this.workLocation = workLocation;
        this.workPhone = workPhone;
        this.workExtension = workExtension;
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

    public EEmployee(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public EEmployee setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    @Override
    public EEmployee setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    @Override
    public String getDeptId() {
        return this.deptId;
    }

    @Override
    public EEmployee setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    @Override
    public String getTeamId() {
        return this.teamId;
    }

    @Override
    public EEmployee setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    @Override
    public String getIdentityId() {
        return this.identityId;
    }

    @Override
    public EEmployee setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    @Override
    public String getViceName() {
        return this.viceName;
    }

    @Override
    public EEmployee setViceName(String viceName) {
        this.viceName = viceName;
        return this;
    }

    @Override
    public String getViceEmail() {
        return this.viceEmail;
    }

    @Override
    public EEmployee setViceEmail(String viceEmail) {
        this.viceEmail = viceEmail;
        return this;
    }

    @Override
    public String getViceMobile() {
        return this.viceMobile;
    }

    @Override
    public EEmployee setViceMobile(String viceMobile) {
        this.viceMobile = viceMobile;
        return this;
    }

    @Override
    public String getWorkNumber() {
        return this.workNumber;
    }

    @Override
    public EEmployee setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
        return this;
    }

    @Override
    public String getWorkTitle() {
        return this.workTitle;
    }

    @Override
    public EEmployee setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
        return this;
    }

    @Override
    public String getWorkLocation() {
        return this.workLocation;
    }

    @Override
    public EEmployee setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
        return this;
    }

    @Override
    public String getWorkPhone() {
        return this.workPhone;
    }

    @Override
    public EEmployee setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    @Override
    public String getWorkExtension() {
        return this.workExtension;
    }

    @Override
    public EEmployee setWorkExtension(String workExtension) {
        this.workExtension = workExtension;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public EEmployee setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public EEmployee setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public EEmployee setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public EEmployee setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public EEmployee setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public EEmployee setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public EEmployee setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public EEmployee setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public EEmployee setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EEmployee (");

        sb.append(key);
        sb.append(", ").append(companyId);
        sb.append(", ").append(deptId);
        sb.append(", ").append(teamId);
        sb.append(", ").append(identityId);
        sb.append(", ").append(viceName);
        sb.append(", ").append(viceEmail);
        sb.append(", ").append(viceMobile);
        sb.append(", ").append(workNumber);
        sb.append(", ").append(workTitle);
        sb.append(", ").append(workLocation);
        sb.append(", ").append(workPhone);
        sb.append(", ").append(workExtension);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IEEmployee from) {
        setKey(from.getKey());
        setCompanyId(from.getCompanyId());
        setDeptId(from.getDeptId());
        setTeamId(from.getTeamId());
        setIdentityId(from.getIdentityId());
        setViceName(from.getViceName());
        setViceEmail(from.getViceEmail());
        setViceMobile(from.getViceMobile());
        setWorkNumber(from.getWorkNumber());
        setWorkTitle(from.getWorkTitle());
        setWorkLocation(from.getWorkLocation());
        setWorkPhone(from.getWorkPhone());
        setWorkExtension(from.getWorkExtension());
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

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IEEmployee> E into(E into) {
        into.from(this);
        return into;
    }
}
