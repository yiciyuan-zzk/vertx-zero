/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IVQuery;

import javax.annotation.Generated;


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
public class VQuery implements IVQuery {

    private static final long serialVersionUID = 838227234;

    private String key;
    private String projection;
    private String pager;
    private String sorter;
    private String criteria;

    public VQuery() {
    }

    public VQuery(VQuery value) {
        this.key = value.key;
        this.projection = value.projection;
        this.pager = value.pager;
        this.sorter = value.sorter;
        this.criteria = value.criteria;
    }

    public VQuery(
        String key,
        String projection,
        String pager,
        String sorter,
        String criteria
    ) {
        this.key = key;
        this.projection = projection;
        this.pager = pager;
        this.sorter = sorter;
        this.criteria = criteria;
    }

    public VQuery(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public VQuery setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getProjection() {
        return this.projection;
    }

    @Override
    public VQuery setProjection(String projection) {
        this.projection = projection;
        return this;
    }

    @Override
    public String getPager() {
        return this.pager;
    }

    @Override
    public VQuery setPager(String pager) {
        this.pager = pager;
        return this;
    }

    @Override
    public String getSorter() {
        return this.sorter;
    }

    @Override
    public VQuery setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }

    @Override
    public String getCriteria() {
        return this.criteria;
    }

    @Override
    public VQuery setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VQuery (");

        sb.append(key);
        sb.append(", ").append(projection);
        sb.append(", ").append(pager);
        sb.append(", ").append(sorter);
        sb.append(", ").append(criteria);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IVQuery from) {
        setKey(from.getKey());
        setProjection(from.getProjection());
        setPager(from.getPager());
        setSorter(from.getSorter());
        setCriteria(from.getCriteria());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVQuery> E into(E into) {
        into.from(this);
        return into;
    }
}
