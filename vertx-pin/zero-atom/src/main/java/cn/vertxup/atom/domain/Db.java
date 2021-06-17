/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain;


import cn.vertxup.atom.domain.tables.*;
import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Db extends SchemaImpl {

    private static final long serialVersionUID = 88375277;

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();

    /**
     * The table <code>DB_ETERNAL.M_ACC</code>.
     */
    public final MAcc M_ACC = cn.vertxup.atom.domain.tables.MAcc.M_ACC;

    /**
     * The table <code>DB_ETERNAL.M_ATTRIBUTE</code>.
     */
    public final MAttribute M_ATTRIBUTE = cn.vertxup.atom.domain.tables.MAttribute.M_ATTRIBUTE;

    /**
     * The table <code>DB_ETERNAL.M_ENTITY</code>.
     */
    public final MEntity M_ENTITY = cn.vertxup.atom.domain.tables.MEntity.M_ENTITY;

    /**
     * The table <code>DB_ETERNAL.M_FIELD</code>.
     */
    public final MField M_FIELD = cn.vertxup.atom.domain.tables.MField.M_FIELD;

    /**
     * The table <code>DB_ETERNAL.M_INDEX</code>.
     */
    public final MIndex M_INDEX = cn.vertxup.atom.domain.tables.MIndex.M_INDEX;

    /**
     * The table <code>DB_ETERNAL.M_JOIN</code>.
     */
    public final MJoin M_JOIN = cn.vertxup.atom.domain.tables.MJoin.M_JOIN;

    /**
     * The table <code>DB_ETERNAL.M_KEY</code>.
     */
    public final MKey M_KEY = cn.vertxup.atom.domain.tables.MKey.M_KEY;

    /**
     * The table <code>DB_ETERNAL.M_MODEL</code>.
     */
    public final MModel M_MODEL = cn.vertxup.atom.domain.tables.MModel.M_MODEL;

    /**
     * The table <code>DB_ETERNAL.M_RELATION</code>.
     */
    public final MRelation M_RELATION = cn.vertxup.atom.domain.tables.MRelation.M_RELATION;

    /**
     * The table <code>DB_ETERNAL.M_TPL</code>.
     */
    public final MTpl M_TPL = cn.vertxup.atom.domain.tables.MTpl.M_TPL;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                MAcc.M_ACC,
                MAttribute.M_ATTRIBUTE,
                MEntity.M_ENTITY,
                MField.M_FIELD,
                MIndex.M_INDEX,
                MJoin.M_JOIN,
                MKey.M_KEY,
                MModel.M_MODEL,
                MRelation.M_RELATION,
                MTpl.M_TPL);
    }
}
