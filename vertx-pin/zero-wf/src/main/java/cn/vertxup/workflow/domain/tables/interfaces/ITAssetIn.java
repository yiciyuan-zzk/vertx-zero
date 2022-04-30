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
public interface ITAssetIn extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_IN.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public ITAssetIn setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_IN.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_IN.COMMENT_IN</code>. 「commentIn」-
     * 入库备注
     */
    public ITAssetIn setCommentIn(String value);

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_IN.COMMENT_IN</code>. 「commentIn」-
     * 入库备注
     */
    public String getCommentIn();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ITAssetIn
     */
    public void from(ITAssetIn from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ITAssetIn
     */
    public <E extends ITAssetIn> E into(E into);

    @Override
    public default ITAssetIn fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCommentIn, json::getString, "COMMENT_IN", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("COMMENT_IN", getCommentIn());
        return json;
    }

}
