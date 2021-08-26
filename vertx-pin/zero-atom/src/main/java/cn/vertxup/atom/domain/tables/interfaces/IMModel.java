/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.interfaces;


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
public interface IMModel extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.KEY</code>. 「key」- 模型ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.KEY</code>. 「key」- 模型ID
     */
    public IMModel setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.IDENTIFIER</code>. 「identifier」- 当前模型全局唯一ID
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.IDENTIFIER</code>. 「identifier」- 当前模型全局唯一ID
     */
    public IMModel setIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.NAMESPACE</code>. 「namespace」- 当前模型使用的名空间
     */
    public String getNamespace();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.NAMESPACE</code>. 「namespace」- 当前模型使用的名空间
     */
    public IMModel setNamespace(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.NAME</code>. 「name」- 当前模型的名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.NAME</code>. 「name」- 当前模型的名称
     */
    public IMModel setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.ALIAS</code>. 「alias」- 模型别名（业务名）
     */
    public String getAlias();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.ALIAS</code>. 「alias」- 模型别名（业务名）
     */
    public IMModel setAlias(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.TYPE</code>. 「type」- 当前模型的类型信息
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.TYPE</code>. 「type」- 当前模型的类型信息
     */
    public IMModel setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.COMMENTS</code>. 「comments」- 当前模型的描述信息
     */
    public String getComments();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.COMMENTS</code>. 「comments」- 当前模型的描述信息
     */
    public IMModel setComments(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CATEGORY_TREE</code>. 「categoryTree」- 当前模型所属的类型树
     */
    public String getCategoryTree();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CATEGORY_TREE</code>. 「categoryTree」- 当前模型所属的类型树
     */
    public IMModel setCategoryTree(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CATEGORY_ID</code>. 「categoryId」- 关联的类型的ID
     */
    public String getCategoryId();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CATEGORY_ID</code>. 「categoryId」- 关联的类型的ID
     */
    public IMModel setCategoryId(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.RULE_UNIQUE</code>. 「ruleUnique」- 当前模型的标识规则
     */
    public String getRuleUnique();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.RULE_UNIQUE</code>. 「ruleUnique」- 当前模型的标识规则
     */
    public IMModel setRuleUnique(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.IS_TRACK</code>. 「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）
     */
    public Boolean getIsTrack();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.IS_TRACK</code>. 「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）
     */
    public IMModel setIsTrack(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SPIDER</code>. 「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张
     */
    public String getSpider();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SPIDER</code>. 「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张
     */
    public IMModel setSpider(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SPIDER_COMPONENT</code>. 「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容
     */
    public String getSpiderComponent();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SPIDER_COMPONENT</code>. 「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容
     */
    public IMModel setSpiderComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMModel setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMModel setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    public IMModel setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IMModel setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMModel setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMModel setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMModel setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMModel setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMModel
     */
    public void from(cn.vertxup.atom.domain.tables.interfaces.IMModel from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMModel
     */
    public <E extends cn.vertxup.atom.domain.tables.interfaces.IMModel> E into(E into);

    default IMModel fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setIdentifier(json.getString("IDENTIFIER"));
        setNamespace(json.getString("NAMESPACE"));
        setName(json.getString("NAME"));
        setAlias(json.getString("ALIAS"));
        setType(json.getString("TYPE"));
        setComments(json.getString("COMMENTS"));
        setCategoryTree(json.getString("CATEGORY_TREE"));
        setCategoryId(json.getString("CATEGORY_ID"));
        setRuleUnique(json.getString("RULE_UNIQUE"));
        setIsTrack(json.getBoolean("IS_TRACK"));
        setSpider(json.getString("SPIDER"));
        setSpiderComponent(json.getString("SPIDER_COMPONENT"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("IDENTIFIER", getIdentifier());
        json.put("NAMESPACE", getNamespace());
        json.put("NAME", getName());
        json.put("ALIAS", getAlias());
        json.put("TYPE", getType());
        json.put("COMMENTS", getComments());
        json.put("CATEGORY_TREE", getCategoryTree());
        json.put("CATEGORY_ID", getCategoryId());
        json.put("RULE_UNIQUE", getRuleUnique());
        json.put("IS_TRACK", getIsTrack());
        json.put("SPIDER", getSpider());
        json.put("SPIDER_COMPONENT", getSpiderComponent());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
