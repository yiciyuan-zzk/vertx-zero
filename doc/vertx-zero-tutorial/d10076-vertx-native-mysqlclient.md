# D10076 - Vert.x Native, MySqlClient

In zero system, we consider more freedom to developers, in this kind of situation, it provide the specific injection for
native clients such as following:

![](/doc/image/d10076-1.png)Zero system fully supported vert.x clients here. this chapter we'll focus on MySqlClient to
connect existing database.

Demo projects:

* **Standalone - 6073**: `up-gaea`

## 1. Configuration

This chapter is duplicated with [D10072 - Configuration, vertx-mysql.yml](d10072-configuration-vertx-mysqlyml.md),
because that's the preparing steps for mysql client.

### 1.1. vertx.yml

```yaml
zero:
  lime: mysql
  vertx:
    instance:
    - name: vertx-zeus
      options:
        maxEventLoopExecuteTime: 30000000000
```

### 1.2. vertx-inject.yml

```yaml
mysql: io.vertx.up.plugin.jdbc.MySqlInfix
```

### 1.3. vertx-mysql.yml

All the mysql configurations are put into `vertx-mysql.yml` the root node `mysql` as following:

```yaml
mysql:
  host: localhost
  port: 3306
  username: htl
  password: "pl,okmijn123"
  database: DB_ZERO
  provider_class: "io.vertx.ext.jdbc.spi.impl.HikariCPDataSourceProvider"
```

All above configuration is for mysql native configuration supported, but for `up-gaea` project, there need some
additional configuration \( Server Config \).

## 2. Server Configuration

### vertx-server.yml

```yaml
server:
- name: up-gaea
  type: http
  config:
    port: 6073
    host: 0.0.0.0
```

Finally when you have finished configuration, the folder structure of project should be as following:

![](/doc/image/d10076-2.png)

## 3. Source Code

### 3.1. Api

```java
package up.god.micro.tabular;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@EndPoint
@Path("/api")
public interface DbApi {

    @Path("native/{type}")
    @GET
    @Address("ZERO://QUEUE/NATIVE/GET")
    String sayDb(@PathParam("type") String type);
}
```

### 3.2. Consumer

```java
package up.god.micro.tabular;

import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.sql.ResultSet;
import io.vertx.ext.sql.SQLClient;
import io.vertx.up.aiki.Ux;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.atom.Envelop;

import javax.inject.infix.MySql;

@Queue
public class DbWorker {

    @MySql
    private transient SQLClient client;

    @Address("ZERO://QUEUE/NATIVE/GET")
    public void sayDb(final Message<Envelop> message) {
        final String type = Ux.getString(message);
        this.client.queryWithParams("SELECT * FROM SYS_TABULAR WHERE S_TYPE=?",
                new JsonArray().add(type), handler -> {
                    // Success or Failure
                    if (handler.succeeded()) {
                        final ResultSet res = handler.result();
                        // Build result json array
                        for (final JsonArray item : res.getResults()) {
                            System.out.println(item);
                        }
                        message.reply(Envelop.success(res.getResults()));
                    } else {
                        // Replied with error, now only print stack
                        handler.cause().printStackTrace();
                        message.reply(Envelop.ok());
                    }
                });
    }
}
```

## 4. Console

When you start this application you should see following logs:

```shell
infix-afflux-runner            | io.vertx.ext.asyncsql.impl.MYSQLClientImpl                   -| \
    Creating configuration for localhost:3306
```

It means that the connection has been built, then when you send following request, you should get the data as following:

**URL** : [http://localhost:6073/api/native/room.status](http://localhost:6073/api/native/room.status)

**Method** : GET

**Response** :

```json
{
    "data": [
        [
            8,
            null,
            "可操作",
            "Operation",
            null,
            "room.status",
            "{\"visible\":false}",
            1,
            1,
            "ENhwBAJPZuSgIAE5EDakR6yrIQbOoOPq",
            "cn",
            null,
            "2018-02-07T04:09:32.000",
            null,
            null
        ],
        ......
    ]
]
```

## 5. Summary

Here are some points need to be mention.

1. There is an annotation `javax.inject.infix.MySql` could be used to inject SQLClient, it's the same as `@Inject` of
   JSR303, but you must be sure your configuration of MySql has been setup correctly.
2. Another thing is that here we used `io.vertx.ext.sql.SQLClient` to hold the created reference, it's not the reference
   of `io.vertx.ext.asyncsql.MySQLClient` because the native vert.x document
   mentioned: [http://vertx.io/docs/vertx-mysql-postgresql-client/java/\#\_specifying\_a\_pool\_name](http://vertx.io/docs/vertx-mysql-postgresql-client/java/#_specifying_a_pool_name)
3. The last point is that it's best to use `Envelop.success` to build response and let message replied, do not reply the
   data directly, you can pass any type of data into `Envelop.success` method.

 

