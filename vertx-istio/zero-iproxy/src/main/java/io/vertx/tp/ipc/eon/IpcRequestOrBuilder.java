// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.envelop.proto

package io.vertx.tp.ipc.eon;

public interface IpcRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.vertx.tp.ipc.eon.IpcRequest)
    com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Response format
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Format response_format = 1;</code>
     *
     * @return The enum numeric value on the wire for responseFormat.
     */
    int getResponseFormatValue();

    /**
     * <pre>
     * Response format
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Format response_format = 1;</code>
     *
     * @return The responseFormat.
     */
    io.vertx.tp.ipc.eon.em.Format getResponseFormat();

    /**
     * <pre>
     * Response type
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Category response_category = 2;</code>
     *
     * @return The enum numeric value on the wire for responseCategory.
     */
    int getResponseCategoryValue();

    /**
     * <pre>
     * Response type
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Category response_category = 2;</code>
     *
     * @return The responseCategory.
     */
    io.vertx.tp.ipc.eon.em.Category getResponseCategory();

    /**
     * <pre>
     * Size
     * </pre>
     *
     * <code>int32 response_size = 3;</code>
     *
     * @return The responseSize.
     */
    int getResponseSize();

    /**
     * <pre>
     * Content of response
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 4;</code>
     *
     * @return Whether the envelop field is set.
     */
    boolean hasEnvelop();

    /**
     * <pre>
     * Content of response
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 4;</code>
     *
     * @return The envelop.
     */
    io.vertx.tp.ipc.eon.IpcEnvelop getEnvelop();

    /**
     * <pre>
     * Content of response
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 4;</code>
     */
    io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder getEnvelopOrBuilder();

    /**
     * <pre>
     * Whether contains username
     * </pre>
     *
     * <code>bool is_client_id = 5;</code>
     *
     * @return The isClientId.
     */
    boolean getIsClientId();

    /**
     * <pre>
     * Whether contains scope
     * </pre>
     *
     * <code>bool is_oauth_scope = 6;</code>
     *
     * @return The isOauthScope.
     */
    boolean getIsOauthScope();

    /**
     * <pre>
     * Compression
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Compression algorithm = 7;</code>
     *
     * @return The enum numeric value on the wire for algorithm.
     */
    int getAlgorithmValue();

    /**
     * <pre>
     * Compression
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.em.Compression algorithm = 7;</code>
     *
     * @return The algorithm.
     */
    io.vertx.tp.ipc.eon.em.Compression getAlgorithm();

    /**
     * <pre>
     * Status
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 8;</code>
     *
     * @return Whether the responseStatus field is set.
     */
    boolean hasResponseStatus();

    /**
     * <pre>
     * Status
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 8;</code>
     *
     * @return The responseStatus.
     */
    io.vertx.tp.ipc.eon.IpcStatus getResponseStatus();

    /**
     * <pre>
     * Status
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 8;</code>
     */
    io.vertx.tp.ipc.eon.IpcStatusOrBuilder getResponseStatusOrBuilder();
}
