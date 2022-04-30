/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ITAssetKo extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_KO.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public ITAssetKo setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_KO.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_KO.COMMENT_KO</code>. 「commentKo」-
     * 报废原因
     */
    public ITAssetKo setCommentKo(String value);

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_KO.COMMENT_KO</code>. 「commentKo」-
     * 报废原因
     */
    public String getCommentKo();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ITAssetKo
     */
    public void from(ITAssetKo from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ITAssetKo
     */
    public <E extends ITAssetKo> E into(E into);

    @Override
    public default ITAssetKo fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCommentKo, json::getString, "COMMENT_KO", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("COMMENT_KO", getCommentKo());
        return json;
    }

}
