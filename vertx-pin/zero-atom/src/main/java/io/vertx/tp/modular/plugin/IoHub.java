package io.vertx.tp.modular.plugin;

import io.vertx.core.Future;
import io.vertx.tp.atom.modeling.element.DataTpl;
import io.vertx.up.commune.Record;
import io.vertx.up.uca.cache.Cc;

/**
 * ## Nerve System
 *
 * ### 1. Intro
 *
 * It's plug-in channel for `M_MODEL` to process different attribute in Sync mode ( Jooq < 3.10.8 ), the work phases are
 * as following:
 *
 * #### 1.1. Input
 *
 * - 1. IComponent ( Record )
 * - 2. INormalizer ( Attribute )
 *
 * #### 1.2. Output
 *
 * - 1. OComponent ( Record )
 * - 2. Reference Calculation
 * - 3. OExpression ( Attribute )
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface IoHub {
    /**
     * For `IoHub` reference create, there should be only one IoHub in each thread here.
     */
    Cc<String, IoHub> CC_HUB = Cc.openThread();

    static IoHub instance() {
        return CC_HUB.pick(IoNerve::new); // Fn.po?lThread(HUB_MAP, IoNerve::new);
    }

    /**
     * Processing input data record
     *
     * @param record {@link Record} Input data record
     * @param tpl    {@link DataTpl} The model template definition
     *
     * @return {@link Record}
     */
    Record in(Record record, DataTpl tpl);

    /**
     * Processing input data records
     *
     * @param records {@link Record}[] Input data record
     * @param tpl     {@link DataTpl} The model template definition
     *
     * @return {@link Record}[]
     */
    Record[] in(Record[] records, DataTpl tpl);

    /**
     * Processing output data record in response
     *
     * @param record {@link Record} Input data record
     * @param tpl    {@link DataTpl} The model template definition
     *
     * @return {@link Record}
     */
    Record out(Record record, DataTpl tpl);

    Future<Record> outAsync(Record record, DataTpl tpl);

    /**
     * Processing output data records in response
     *
     * @param records {@link Record}[] Input data record
     * @param tpl     {@link DataTpl} The model template definition
     *
     * @return {@link Record}[]
     */
    Record[] out(Record[] records, DataTpl tpl);

    Future<Record[]> outAsync(Record[] records, DataTpl tpl);
}
