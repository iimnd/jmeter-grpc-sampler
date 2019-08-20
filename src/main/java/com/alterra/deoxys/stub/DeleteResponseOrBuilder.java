// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo-service.proto

package com.alterra.deoxys.stub;

public interface DeleteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.DeleteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  java.lang.String getApi();
  /**
   * <pre>
   * API versioning: it is my best practice to specify version explicitly
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  com.google.protobuf.ByteString
      getApiBytes();

  /**
   * <pre>
   * Contains number of entities have beed deleted
   * Equals 1 in case of succesfull delete
   * </pre>
   *
   * <code>int64 deleted = 2;</code>
   */
  long getDeleted();
}
