/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain;


import cn.vertxup.workflow.domain.tables.WFlow;
import cn.vertxup.workflow.domain.tables.WTicket;
import cn.vertxup.workflow.domain.tables.WTodo;
import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Db extends SchemaImpl {

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>DB_ETERNAL.W_FLOW</code>.
     */
    public final WFlow W_FLOW = WFlow.W_FLOW;

    /**
     * The table <code>DB_ETERNAL.W_TICKET</code>.
     */
    public final WTicket W_TICKET = WTicket.W_TICKET;

    /**
     * The table <code>DB_ETERNAL.W_TODO</code>.
     */
    public final WTodo W_TODO = WTodo.W_TODO;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            WFlow.W_FLOW,
            WTicket.W_TICKET,
            WTodo.W_TODO
        );
    }
}
