package io.vertx.up.uca.cache;

import io.vertx.up.exception.web._501NotSupportException;
import io.vertx.up.fn.Fn;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class CcMemory<K, V> implements Cc<K, V> {
    private final transient Cd<K, V> store = new CdMap<>();

    @Override
    public Cd<K, V> store() {
        return this.store;
    }

    @Override
    public boolean isEmpty() {
        return this.store.isEmpty();
    }

    @Override
    public V pick(final Supplier<V> supplier) {
        throw new _501NotSupportException(this.getClass());
    }

    @Override
    public V pick(final Supplier<V> supplier, final K key) {
        final ConcurrentMap<K, V> pool = this.store.data();
        return Fn.pool(pool, key, supplier);
    }

    @Override
    public V store(final K key) {
        return this.store.data(key);
    }
}
