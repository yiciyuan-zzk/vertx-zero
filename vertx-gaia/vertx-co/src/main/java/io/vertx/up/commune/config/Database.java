package io.vertx.up.commune.config;

import com.fasterxml.jackson.databind.JsonObjectDeserializer;
import com.fasterxml.jackson.databind.JsonObjectSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.vertx.aeon.eon.HEnv;
import io.vertx.core.json.JsonObject;
import io.vertx.up.commune.Copyable;
import io.vertx.up.commune.Json;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.eon.em.DatabaseType;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.yaml.Node;
import io.vertx.up.uca.yaml.ZeroUniform;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

/*
 * Database linker for JDBC
 * {
 *      "hostname": "localhost",
 *      "instance": "DB_ORIGIN_X",
 *      "username": "lang",
 *      "password": "xxxx",
 *      "port": 3306,
 *      "category": "MYSQL5",
 *      "driverClassName": "Fix driver issue here",
 *      "jdbcUrl": "jdbc:mysql://ox.engine.cn:3306/DB_ORIGIN_X?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&useSSL=false&allowPublicKeyRetrieval=true",
 * }
 * I_SERVICE -> configDatabase
 */
public class Database implements Serializable, Json, Copyable<Database> {

    private static final Annal LOGGER = Annal.get(Database.class);
    private static final Node<JsonObject> VISITOR = Ut.singleton(ZeroUniform.class);
    private static Database DATABASE;
    /*
     * Get current jooq configuration for Application / Source
     */
    /* Database options for different pool */
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserializer.class)
    private JsonObject options = new JsonObject();
    /* Database host name */
    private String hostname;
    /* Database instance name */
    private String instance;
    /* Database port number */
    private Integer port;
    /* Database category */
    private DatabaseType category;
    /* JDBC connection string */
    private String jdbcUrl;
    /* Database username */
    private String username;
    /* Database password */
    private String password;
    /* Database driver class */
    private String driverClassName;

    /* Database Connection Testing */
    public static boolean test(final Database database) {
        try {
            DriverManager.getConnection(database.getJdbcUrl(), database.getUsername(), database.getSmartPassword());
            return true;
        } catch (final SQLException ex) {
            // Debug for database connection
            ex.printStackTrace();
            Database.LOGGER.jvm(ex);
            return false;
        }
    }

    public static Database getCurrent() {
        if (Objects.isNull(DATABASE)) {
            DATABASE = getDatabase("jooq", "provider");
        }
        return DATABASE.copy();
    }

    public static Database getHistory() {
        return getDatabase("jooq", "orbit");
    }

    public static Database getCamunda() {
        return getDatabase("workflow", "database");
    }

    private static Database getDatabase(final String... keys) {
        final JsonObject raw = Database.VISITOR.read();
        final JsonObject jooq = Ut.visitJObject(raw, keys);
        return configure(jooq);
    }

    public static Database configure(final JsonObject databaseJ) {
        final JsonObject jooq = Ut.valueJObject(databaseJ);
        final Database database = new Database();
        {
            /*
             * 该方法只针对静态数据库生效
             * jooq:
             *    provider:
             *    orbit:
             *
             * 1. 读取环境变量 Z_PORT_DB 计算端口
             * 2. 执行jdbcUrl的处理（表达式）
             * 「Z_PORT_DB」
             */
            final String port = Ut.valueString(jooq, KName.PORT);
            final String portEnv = Ut.valueEnv(HEnv.Z_PORT_DB, port);
            jooq.put(KName.PORT, Integer.valueOf(portEnv));

            final String jdbcUrl = Ut.valueString(jooq, "jdbcUrl");
            final String replaced;
            if (jdbcUrl.contains(Strings.DOLLAR)) {
                final JsonObject parameters = jooq.copy();
                replaced = Ut.fromExpression("`" + jdbcUrl + "`", parameters);
            } else {
                replaced = jdbcUrl;
            }
            jooq.put("jdbcUrl", replaced);
        }
        database.fromJson(jooq);
        return database;
    }


    /* Database Connection Testing */
    public boolean test() {
        return Database.test(this);
    }

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getInstance() {
        return this.instance;
    }

    public void setInstance(final String instance) {
        this.instance = instance;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    public DatabaseType getCategory() {
        return this.category;
    }

    public void setCategory(final DatabaseType category) {
        this.category = category;
    }

    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    public void setJdbcUrl(final String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getSmartPassword() {
        return Ut.decryptRSAV(this.password);
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }

    public void setDriverClassName(final String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @SuppressWarnings("unchecked")
    public <T> T getOption(final String optionKey) {
        final JsonObject options = this.options;
        final Object value = options.getValue(optionKey);
        return Objects.isNull(value) ? null : (T) value;
    }

    public <T> T getOption(final String optionKey, final T defaultValue) {
        final T result = this.getOption(optionKey);
        return Objects.isNull(result) ? defaultValue : result;
    }

    public Long getLong(final String optionKey, final Long defaultValue) {
        final Long result = this.getLong(optionKey);
        return Objects.isNull(result) ? defaultValue : result;
    }

    public Long getLong(final String optionKey) {
        final JsonObject options = this.options;
        return options.getLong(optionKey);
    }

    public JsonObject getOptions() {
        return Objects.isNull(this.options) ? new JsonObject() : this.options;
    }

    public void setOptions(final JsonObject options) {
        this.options = options;
    }

    @Override
    public JsonObject toJson() {
        return Ut.serializeJson(this);
    }

    @Override
    public void fromJson(final JsonObject data) {
        if (Ut.notNil(data)) {
            this.category = Ut.toEnum(() -> data.getString("category"),
                DatabaseType.class, DatabaseType.MYSQL5);
            this.hostname = data.getString("hostname");
            this.port = data.getInteger("port");
            this.instance = data.getString("instance");
            this.jdbcUrl = data.getString("jdbcUrl");
            this.username = data.getString("username");
            this.password = data.getString("password");
            this.driverClassName = data.getString("driverClassName");
            /*
             * options
             */
            final JsonObject options = Ut.valueJObject(data, KName.OPTIONS);
            if (Ut.notNil(options)) {
                this.options.mergeIn(options);
                LOGGER.info("Database Options: {0}", this.options.encode());
            }
        }
    }

    @Override
    public Database copy() {
        final JsonObject json = this.toJson().copy();
        final Database database = new Database();
        database.fromJson(json);
        return database;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Database)) {
            return false;
        }
        final Database database = (Database) o;
        return this.jdbcUrl.equals(database.jdbcUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.jdbcUrl);
    }

    @Override
    public String toString() {
        return "Database{" +
            "hostname='" + this.hostname + '\'' +
            ", instance='" + this.instance + '\'' +
            ", port=" + this.port +
            ", category=" + this.category +
            ", jdbcUrl='" + this.jdbcUrl + '\'' +
            ", username='" + this.username + '\'' +
            ", password='" + this.password + '\'' +
            ", driverClassName='" + this.driverClassName + '\'' +
            ", options=" + (Objects.isNull(this.options) ? "{}" : this.options.encodePrettily()) +
            '}';
    }
}
