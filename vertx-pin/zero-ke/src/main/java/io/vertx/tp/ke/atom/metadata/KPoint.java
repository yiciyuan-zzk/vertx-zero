package io.vertx.tp.ke.atom.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ClassDeserializer;
import com.fasterxml.jackson.databind.ClassSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.vertx.tp.error._409JoinTargetException;
import io.vertx.tp.ke.cv.em.JoinMode;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.Objects;

/**
 * ## 「Pojo」Source/Target
 *
 * ### 1. Intro
 *
 * Here defined the field for join point such as `source` and `target`.
 *
 * ### 2. Attribute
 *
 * |Name|Comment|
 * |---|:---|
 * |key|The default value is `key`, primary key field.|
 * |keyJoin|Required, the join key field of the record.|
 * |crud|Optional, When it has value, you can search `identifier`( targetKey ) by CRUD.|
 * |classDao|Optional, When it has value, you can join with the Dao class instead of CRUD seeking.|
 * |classDefine|Optional, When it has value, you can seek target by defined component.|
 *
 * ### 3. Data Format
 *
 * ```json
 * // <pre><code class="json">
 *     {
 *         "crud": "xxx",
 *         "classDao": "xxx",
 *         "keyJoin": "fieldx",
 *         "key": "key"
 *     }
 * // </code></pre>
 * ```
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class KPoint implements Serializable {
    /**
     * `identifier`
     */
    @JsonIgnore
    private transient String identifier;
    /**
     * `crud`, <strong>filename</strong> that could be parsed.
     */
    private transient String crud;
    /**
     * `classDao`, <strong>Dao class</strong> that could be convert to java class.
     */
    @JsonSerialize(using = ClassSerializer.class)
    @JsonDeserialize(using = ClassDeserializer.class)
    private transient Class<?> classDao;


    /**
     * `classDefine`, <strong>Defined class</strong> that could be convert to java class.
     */
    @JsonSerialize(using = ClassSerializer.class)
    @JsonDeserialize(using = ClassDeserializer.class)
    private transient Class<?> classDefine;
    /**
     * `key`, primary key field.
     */
    private transient String key;
    /**
     * `keyJoin`, join key that are related to join point.
     */
    private transient String keyJoin;

    public String getCrud() {
        return this.crud;
    }

    public void setCrud(final String crud) {
        this.crud = crud;
    }

    public String getKey() {
        return Ut.isNil(this.key) ? "key" : this.key;
    }

    public void setKey(final String key) {
        if (Ut.notNil(key)) {
            this.key = key;
        }
    }

    public String getKeyJoin() {
        return this.keyJoin;
    }

    public void setKeyJoin(final String keyJoin) {
        this.keyJoin = keyJoin;
    }

    public Class<?> getClassDao() {
        return this.classDao;
    }

    public void setClassDao(final Class<?> classDao) {
        this.classDao = classDao;
    }

    public Class<?> getClassDefine() {
        return this.classDefine;
    }

    public void setClassDefine(final Class<?> classDefine) {
        this.classDefine = classDefine;
    }

    /**
     * Get target configuration mode here for calculation.
     *
     * @return {@link JoinMode}
     */
    public JoinMode modeTarget() {
        /* P1: CRUD */
        if (Ut.notNil(this.crud)) {
            return JoinMode.CRUD;
        }
        /* P2: classDao */
        if (Objects.nonNull(this.classDao)) {
            return JoinMode.DAO;
        }
        /* P3: classDefine also null, throw error out. */
        Fn.out(Objects.isNull(this.classDefine), _409JoinTargetException.class, this.getClass());
        return JoinMode.DEFINE;
    }

    /**
     * Get source configuration mode here for calculation.
     *
     * @return {@link JoinMode}
     */
    public JoinMode modeSource() {
        /* P1: classDao */
        if (Objects.nonNull(this.classDao)) {
            return JoinMode.DAO;
        }
        /* P2: classDefine */
        if (Objects.nonNull(this.classDefine)) {
            return JoinMode.DEFINE;
        }
        /* P3: keyJoin */
        Fn.out(Ut.isNil(this.keyJoin), _409JoinTargetException.class, this.getClass());
        return JoinMode.CRUD;
    }

    public KPoint indent(final String identifier) {
        this.identifier = identifier;
        return this;
    }

    public String indent() {
        return this.identifier;
    }

    @Override
    public String toString() {
        return "KPoint{" +
                "crud='" + this.crud + '\'' +
                ", classDao=" + this.classDao +
                ", classDefine=" + this.classDefine +
                ", key='" + this.key + '\'' +
                ", keyJoin='" + this.keyJoin + '\'' +
                '}';
    }
}
