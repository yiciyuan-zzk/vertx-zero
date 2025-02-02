package io.vertx.tp.optic.ui;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.jooq.UxJooq;

/*
 * Apeak implementation by some specific definition
 * Only full column contains render part for different usage
 * Implementation class will be rbac to read projection
 */
public interface ApeakMy {

    String ARG0 = KName.RESOURCE_ID;
    String ARG1 = KName.USER;
    String ARG2 = KName.VIEW;
    String ARG3 = KName.HABITUS;
    String ARG4 = KName.DATA_KEY;

    ApeakMy on(UxJooq jooq);

    /*
     * Read my columns with filters here.
     * config is generated by IxModule Object.
     * {
     *      "sigma": "xxx",
     *      "resourceId": "xxx",
     *      "principle": {
     *          "access_token": "token"
     *      }
     * }
     * token: {
     *      "user": "xxx"
     * }
     */
    Future<JsonArray> fetchMy(JsonObject params);

    /*
     * Save my columns with filters here.
     * config is generated by IxModule Object.
     * 1) Read full columns list from ColumnStub ( zero-ui implementation )
     * 2) Read my columns from config
     * {
     *     "identifier": "xxx",
     *     "sigma": "yyy"
     * }
     * 3) Save my columns
     * -- 3.1) Select projection result ( calculation )
     * -- 3.2) Input select projection result
     * -- 3.3) Modification for identifier projection
     * {
     *     "projection": [],
     *     "criteria": {}
     * }
     */
    Future<JsonObject> saveMy(JsonObject params, JsonObject viewData);
}
