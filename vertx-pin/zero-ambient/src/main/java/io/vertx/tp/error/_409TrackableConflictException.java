package io.vertx.tp.error;

import io.vertx.core.http.HttpStatusCode;
import io.vertx.up.exception.WebException;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class _409TrackableConflictException extends WebException {

    public _409TrackableConflictException(final Class<?> clazz,
                                          final String identifier) {
        super(clazz, identifier);
    }

    @Override
    public int getCode() {
        return -80304;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.CONFLICT;
    }
}
