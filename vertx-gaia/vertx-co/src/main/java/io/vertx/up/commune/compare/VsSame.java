package io.vertx.up.commune.compare;

import java.util.Objects;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
interface VsSame {

    static VsSame get(final Class<?> type) {
        return Objects.isNull(type) ? null : Pool.POOL_SAME.getOrDefault(type, null);
    }

    /**
     * Bind subset when comparing JsonArray or JsonObject
     *
     * @param subset {@link Set}
     *
     * @return {@link VsSame} Fluent returned
     */
    VsSame bind(Set<String> subset);

    /**
     * Comparing
     *
     * 1. Internal Vs
     * 2. Extension VsPlugin -> Adjuster ( For Extension Here )
     *
     * @param valueOld {@link Object} input old
     * @param valueNew {@link Object} input new
     *
     * @return {@link Boolean} true when Same.
     */
    boolean is(Object valueOld, Object valueNew);

    /**
     * 1. Any one input is `null`
     * 2. Both are not be null at the same time.
     *
     * @param valueOld {@link Object} input old
     * @param valueNew {@link Object} input new
     *
     * @return {@link Boolean} true when Same.
     */
    default boolean isXor(final Object valueOld, final Object valueNew) {
        return false;
    }
}
