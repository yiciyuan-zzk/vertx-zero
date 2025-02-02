package io.vertx.tp.optic.environment;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

import java.util.concurrent.ConcurrentMap;

/*
 * Application configuration for X_APP but the implementation should be provided
 * in another project instead of current one.
 */
public interface UnityApp {

    Future<Boolean> initialize(final Vertx vertx);

    ConcurrentMap<String, JsonObject> connect();
    /*
     * 新接口做配置刷新（按应用对配置执行刷新操作）
     */
    Future<JsonObject> synchro(String appId);
}
