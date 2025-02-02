package io.vertx.tp.battery.init;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.tp.battery.refine.Bk;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.optic.business.ExModulat;
import io.vertx.tp.optic.feature.Modulat;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

public class BkInit {

    public static Future<Boolean> initModulat(final Vertx vertx) {
        return Ke.mapApp(appJ -> {
            final String appKey = Ut.valueString(appJ, KName.KEY);
            if (Objects.isNull(appKey)) {
                Bk.Log.warnInit(BkInit.class, "App Id = null, ignored initialized!!");
                return Ux.futureF();
            }
            final Modulat modulat = new ExModulat();
            return modulat.extension(appJ).compose(nil -> Ux.futureT());
        }, (result) -> {
            final boolean initialized = result.stream().allMatch(item -> item);
            Bk.Log.warnInit(BkInit.class, "Modulat configuration initialized!! Size = {0}, Ret = {1}",
                String.valueOf(result.size()), initialized);
            return Ux.future(initialized);
        });
    }
}
