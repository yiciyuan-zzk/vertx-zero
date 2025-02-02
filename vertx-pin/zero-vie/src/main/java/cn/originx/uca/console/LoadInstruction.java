package cn.originx.uca.console;

import cn.originx.scaffold.console.AbstractInstruction;
import cn.originx.stellaris.Ok;
import io.vertx.core.Future;
import io.vertx.tp.ke.booter.Bt;
import io.vertx.tp.plugin.shell.atom.CommandInput;
import io.vertx.tp.plugin.shell.cv.em.TermStatus;
import io.vertx.tp.plugin.shell.refine.Sl;
import io.vertx.up.unity.Ux;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class LoadInstruction extends AbstractInstruction {
    @Override
    public Future<TermStatus> executeAsync(final CommandInput args) {
        final Boolean isOob = this.inBoolean(args, "o");
        // Fix Issue
        final boolean oob;
        if (Objects.isNull(isOob)) {
            oob = false;
        } else {
            oob = isOob;
        }
        return Ok.app().compose(ok -> Bt.initAsync("init/oob/", oob).compose(done -> {
            Sl.output("您的元数据仓库已重置初始化完成！重置结果：{0}", done);
            return Ux.future(done ? TermStatus.SUCCESS : TermStatus.FAILURE);
        }));
    }
}
