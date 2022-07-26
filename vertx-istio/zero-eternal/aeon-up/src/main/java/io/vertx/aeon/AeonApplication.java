package io.vertx.aeon;

import io.vertx.aeon.atom.HSwitcher;
import io.vertx.aeon.atom.configuration.HAeon;
import io.vertx.aeon.component.boot.AeonOn;
import io.vertx.aeon.exception.heart.AeonConfigureException;
import io.vertx.aeon.exception.heart.ClusterRequiredException;
import io.vertx.aeon.specification.boot.HOn;
import io.vertx.up.VertxApplication;
import io.vertx.up.fn.Fn;
import io.vertx.up.runtime.ZeroHeart;
import io.vertx.up.uca.cache.Cc;

import java.util.Objects;

/**
 * 启动器
 *
 * 1 - 云环境自检
 * 2 - 低代码环境对接
 * 3 - VertxApplication应用启动
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AeonApplication {

    private static final Cc<String, HOn> CC_UP = Cc.openThread();

    public static void run(final Class<?> clazz, final Object... args) {
        final HAeon aeon = HSwitcher.aeon();

        // Error-50001
        Fn.out(Objects.isNull(aeon), AeonConfigureException.class, clazz);
        // Error-50002
        Fn.out(!ZeroHeart.isCluster(), ClusterRequiredException.class, clazz);

        // HUp 接口（启动检查）
        final HOn up = CC_UP.pick(AeonOn::new);
        up.configure(aeon).onComplete(res -> {
            if (res.succeeded()) {
                // Aeon 启动流程（准备工作）
                VertxApplication.run(clazz, args);
            } else {
                // Aeon 启动失败
                final Throwable error = res.cause();
                if (Objects.nonNull(error)) {
                    error.printStackTrace();
                }
            }
        });
    }
}
