package io.vertx.up.uca.serialization;

import io.vertx.up.eon.Values;
import io.vertx.up.fn.Fn;

public class ByteArraySaber extends BaseSaber {

    @Override
    public Object from(final Class<?> paramType,
                       final String literal) {
        return Fn.orNull(() -> Fn.orSemi(Byte[].class == paramType ||
                    byte[].class == paramType, this.getLogger(),
                () -> literal.getBytes(Values.DEFAULT_CHARSET), () -> new byte[0]),
            paramType, literal);
    }
}
