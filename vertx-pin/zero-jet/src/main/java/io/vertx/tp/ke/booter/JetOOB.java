package io.vertx.tp.ke.booter;

import io.vertx.tp.ke.cv.KeIpc;
import io.vertx.tp.plugin.booting.AbstractBoot;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class JetOOB extends AbstractBoot {
    public JetOOB() {
        super(KeIpc.Module.JET);
    }
}
