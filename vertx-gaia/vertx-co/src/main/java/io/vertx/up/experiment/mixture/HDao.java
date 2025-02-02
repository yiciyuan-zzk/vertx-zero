package io.vertx.up.experiment.mixture;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.atom.query.Criteria;
import io.vertx.up.commune.Record;

/**
 * 数据库访问器
 */
public interface HDao extends
    HReader,       // 读取
    HWriter,       // 写入
    HSearcher,     // 搜索
    HBatch,        // 批量
    HAggregator,   // 聚集
    HPredicate     // 检查
{
    // ================ Direct =================

    /**
     * SQL语句直接执行，返回影响的行
     */
    int execute(String sql);

    /**
     * 挂载到元数据中，主要用于链接 metadata
     */
    HDao mount(HAtom atom);
}

/**
 * 内置接口：写入器接口，会被OxDao继承，主要负责Record的写入操作，包括增删改
 */
interface HWriter {
    /* 插入单条记录 identifier已经包含在了Record中 */
    Future<Record> insertAsync(Record record);

    Record insert(Record record);

    /* 删除记录集 */
    Future<Boolean> deleteAsync(Record record);

    boolean delete(Record record);
    /* 更新单条记录集 */

    Future<Record> updateAsync(Record record);

    Record update(Record record);
}

/**
 * 内置接口：批量执行
 */
@SuppressWarnings("unchecked")
interface HBatch {
    /* 批量插入 */
    Future<Record[]> insertAsync(Record... records);

    Record[] insert(Record... records);

    /* 按主键批量读取 */
    <ID> Future<Record[]> fetchByIdAsync(ID... ids);

    <ID> Record[] fetchById(ID... ids);

    /* 批量删除 */
    Future<Boolean> deleteAsync(Record... records);

    Boolean delete(Record... records);

    /* 批量更新 */
    Future<Record[]> updateAsync(Record... records);

    Record[] update(Record... records);

    /* 批量读取 */
    Future<Record[]> fetchAllAsync();

    Record[] fetchAll();
}

/**
 * 内置接口：聚集函数
 */
interface HAggregator {

    Future<Long> countAsync(Criteria criteria);

    Future<Long> countAsync(JsonObject criteria);

    Long count(Criteria criteria);

    Long count(JsonObject criteria);
}

/**
 * 内置接口：读取器
 */
interface HReader {
    /* 根据ID查找某条记录 */
    <ID> Future<Record> fetchByIdAsync(ID id);

    <ID> Record fetchById(ID id);

    /* 根据ID查找某条记录（多个ID）*/
    Future<Record> fetchOneAsync(Criteria criteria);

    Record fetchOne(Criteria criteria);

    Future<Record> fetchOneAsync(JsonObject criteria);

    Record fetchOne(JsonObject criteria);
}

/**
 * 内置接口：检查器
 */
interface HPredicate {

    Future<Boolean> existAsync(Criteria criteria);

    Boolean exist(Criteria criteria);

    Future<Boolean> existAsync(JsonObject criteria);

    Boolean exist(JsonObject criteria);

    Future<Boolean> missAsync(Criteria criteria);

    Boolean miss(Criteria criteria);

    Future<Boolean> missAsync(JsonObject criteria);

    Boolean miss(JsonObject criteria);
}

/**
 * 内置接口：搜索器
 */
interface HSearcher {

    /* 搜索专用接口，生成对应的 Pagination */
    Future<JsonObject> searchAsync(final JsonObject filters);

    JsonObject search(final JsonObject filters);

    /* 直接搜索读取 */
    Future<Record[]> fetchAsync(final JsonObject criteria);

    Record[] fetch(final JsonObject criteria);
}