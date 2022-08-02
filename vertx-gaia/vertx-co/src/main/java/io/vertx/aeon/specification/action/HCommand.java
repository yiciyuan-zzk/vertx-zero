package io.vertx.aeon.specification.action;

import io.vertx.core.Vertx;

/**
 * 「指令」指令抽象到底层某个单独行为中（底层封装）
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface HCommand<I, R> {

    // 合法性检查（异步）
    @SuppressWarnings("unchecked")
    default <T> T bind(final Vertx vertx) {
        return (T) this;
    }

    // 步骤1：初始化/配置
    R configure(I input);

    // 步骤2：一致性保持最新，同步
    R synchro(I input);

    // 步骤3：验证后期处理环节
    R compile(I input);
}
