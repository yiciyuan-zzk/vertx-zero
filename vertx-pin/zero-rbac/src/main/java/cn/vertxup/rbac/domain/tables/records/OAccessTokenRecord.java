/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.OAccessToken;
import cn.vertxup.rbac.domain.tables.interfaces.IOAccessToken;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class OAccessTokenRecord extends UpdatableRecordImpl<OAccessTokenRecord> implements Record10<String, byte[], byte[], Long, byte[], String, Boolean, String, LocalDateTime, String>, IOAccessToken {

    private static final long serialVersionUID = -1099457930;

    /**
     * Create a detached OAccessTokenRecord
     */
    public OAccessTokenRecord() {
        super(OAccessToken.O_ACCESS_TOKEN);
    }

    /**
     * Create a detached, initialised OAccessTokenRecord
     */
    public OAccessTokenRecord(String key, byte[] token, byte[] auth, Long expiredTime, byte[] refreshToken, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy) {
        super(OAccessToken.O_ACCESS_TOKEN);

        set(0, key);
        set(1, token);
        set(2, auth);
        set(3, expiredTime);
        set(4, refreshToken);
        set(5, language);
        set(6, active);
        set(7, metadata);
        set(8, createdAt);
        set(9, createdBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.KEY</code>. 「key」- 令牌主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.KEY</code>. 「key」- 令牌主键
     */
    @Override
    public OAccessTokenRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.TOKEN</code>. 「token」- 用户的Token信息
     */
    @Override
    public byte[] getToken() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.TOKEN</code>. 「token」- 用户的Token信息
     */
    @Override
    public OAccessTokenRecord setToken(byte... value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.AUTH</code>. 「auth」- 用户的ID的 byte[] 信息
     */
    @Override
    public byte[] getAuth() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.AUTH</code>. 「auth」- 用户的ID的 byte[] 信息
     */
    @Override
    public OAccessTokenRecord setAuth(byte... value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.EXPIRED_TIME</code>. 「expiredTime」- 用户的Token过期时间
     */
    @Override
    public Long getExpiredTime() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.EXPIRED_TIME</code>. 「expiredTime」- 用户的Token过期时间
     */
    @Override
    public OAccessTokenRecord setExpiredTime(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.REFRESH_TOKEN</code>. 「refreshToken」- 用户的刷新令牌
     */
    @Override
    public byte[] getRefreshToken() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.REFRESH_TOKEN</code>. 「refreshToken」- 用户的刷新令牌
     */
    @Override
    public OAccessTokenRecord setRefreshToken(byte... value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public OAccessTokenRecord setLanguage(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public OAccessTokenRecord setActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public OAccessTokenRecord setMetadata(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public OAccessTokenRecord setCreatedAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public OAccessTokenRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, byte[], byte[], Long, byte[], String, Boolean, String, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, byte[], byte[], Long, byte[], String, Boolean, String, LocalDateTime, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return OAccessToken.O_ACCESS_TOKEN.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return OAccessToken.O_ACCESS_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return OAccessToken.O_ACCESS_TOKEN.AUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return OAccessToken.O_ACCESS_TOKEN.EXPIRED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return OAccessToken.O_ACCESS_TOKEN.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OAccessToken.O_ACCESS_TOKEN.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return OAccessToken.O_ACCESS_TOKEN.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OAccessToken.O_ACCESS_TOKEN.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return OAccessToken.O_ACCESS_TOKEN.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return OAccessToken.O_ACCESS_TOKEN.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getAuth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getExpiredTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getAuth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getExpiredTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value2(byte... value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value3(byte... value) {
        setAuth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value4(Long value) {
        setExpiredTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value5(byte... value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value6(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value8(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value9(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord value10(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessTokenRecord values(String value1, byte[] value2, byte[] value3, Long value4, byte[] value5, String value6, Boolean value7, String value8, LocalDateTime value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IOAccessToken from) {
        setKey(from.getKey());
        setToken(from.getToken());
        setAuth(from.getAuth());
        setExpiredTime(from.getExpiredTime());
        setRefreshToken(from.getRefreshToken());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IOAccessToken> E into(E into) {
        into.from(this);
        return into;
    }
}
