package io.vertx.tp.optic.web;

import io.vertx.core.Future;
import io.vertx.up.runtime.soul.UriMeta;

import java.util.List;

/**
 * The tunnel for Uris
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface Routine {
    /*
     * Search `UriMeta` definition by channel
     *
     * Permission / Resource management
     */
    Future<List<UriMeta>> searchAsync(String keyword, String sigma);
}
