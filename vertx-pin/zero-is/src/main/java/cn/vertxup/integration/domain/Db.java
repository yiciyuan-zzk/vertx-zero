/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain;


import cn.vertxup.integration.domain.tables.IDirectory;
import cn.vertxup.integration.domain.tables.IIntegration;
import cn.vertxup.integration.domain.tables.IMessage;
import cn.vertxup.integration.domain.tables.IMessageTpl;
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
     * The table <code>DB_ETERNAL.I_DIRECTORY</code>.
     */
    public final IDirectory I_DIRECTORY = IDirectory.I_DIRECTORY;

    /**
     * The table <code>DB_ETERNAL.I_INTEGRATION</code>.
     */
    public final IIntegration I_INTEGRATION = IIntegration.I_INTEGRATION;

    /**
     * The table <code>DB_ETERNAL.I_MESSAGE</code>.
     */
    public final IMessage I_MESSAGE = IMessage.I_MESSAGE;

    /**
     * The table <code>DB_ETERNAL.I_MESSAGE_TPL</code>.
     */
    public final IMessageTpl I_MESSAGE_TPL = IMessageTpl.I_MESSAGE_TPL;

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
            IDirectory.I_DIRECTORY,
            IIntegration.I_INTEGRATION,
            IMessage.I_MESSAGE,
            IMessageTpl.I_MESSAGE_TPL
        );
    }
}
