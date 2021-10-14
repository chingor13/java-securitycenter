// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

/**
 * <pre>
 * Request message for updating a notification config.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest}
 */
public final class UpdateNotificationConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)
    UpdateNotificationConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateNotificationConfigRequest.newBuilder() to construct.
  private UpdateNotificationConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateNotificationConfigRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateNotificationConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateNotificationConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder subBuilder = null;
            if (notificationConfig_ != null) {
              subBuilder = notificationConfig_.toBuilder();
            }
            notificationConfig_ = input.readMessage(com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(notificationConfig_);
              notificationConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_UpdateNotificationConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_UpdateNotificationConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.class, com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.Builder.class);
  }

  public static final int NOTIFICATION_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1p1beta1.NotificationConfig notificationConfig_;
  /**
   * <pre>
   * Required. The notification config to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the notificationConfig field is set.
   */
  @java.lang.Override
  public boolean hasNotificationConfig() {
    return notificationConfig_ != null;
  }
  /**
   * <pre>
   * Required. The notification config to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The notificationConfig.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.NotificationConfig getNotificationConfig() {
    return notificationConfig_ == null ? com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.getDefaultInstance() : notificationConfig_;
  }
  /**
   * <pre>
   * Required. The notification config to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.NotificationConfigOrBuilder getNotificationConfigOrBuilder() {
    return getNotificationConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The FieldMask to use when updating the notification config.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The FieldMask to use when updating the notification config.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The FieldMask to use when updating the notification config.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (notificationConfig_ != null) {
      output.writeMessage(1, getNotificationConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (notificationConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNotificationConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest other = (com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest) obj;

    if (hasNotificationConfig() != other.hasNotificationConfig()) return false;
    if (hasNotificationConfig()) {
      if (!getNotificationConfig()
          .equals(other.getNotificationConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNotificationConfig()) {
      hash = (37 * hash) + NOTIFICATION_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for updating a notification config.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)
      com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_UpdateNotificationConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_UpdateNotificationConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.class, com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (notificationConfigBuilder_ == null) {
        notificationConfig_ = null;
      } else {
        notificationConfig_ = null;
        notificationConfigBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1p1beta1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1p1beta1_UpdateNotificationConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest build() {
      com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest buildPartial() {
      com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest result = new com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest(this);
      if (notificationConfigBuilder_ == null) {
        result.notificationConfig_ = notificationConfig_;
      } else {
        result.notificationConfig_ = notificationConfigBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest other) {
      if (other == com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest.getDefaultInstance()) return this;
      if (other.hasNotificationConfig()) {
        mergeNotificationConfig(other.getNotificationConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.securitycenter.v1p1beta1.NotificationConfig notificationConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.NotificationConfig, com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder, com.google.cloud.securitycenter.v1p1beta1.NotificationConfigOrBuilder> notificationConfigBuilder_;
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the notificationConfig field is set.
     */
    public boolean hasNotificationConfig() {
      return notificationConfigBuilder_ != null || notificationConfig_ != null;
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The notificationConfig.
     */
    public com.google.cloud.securitycenter.v1p1beta1.NotificationConfig getNotificationConfig() {
      if (notificationConfigBuilder_ == null) {
        return notificationConfig_ == null ? com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.getDefaultInstance() : notificationConfig_;
      } else {
        return notificationConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNotificationConfig(com.google.cloud.securitycenter.v1p1beta1.NotificationConfig value) {
      if (notificationConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notificationConfig_ = value;
        onChanged();
      } else {
        notificationConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNotificationConfig(
        com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder builderForValue) {
      if (notificationConfigBuilder_ == null) {
        notificationConfig_ = builderForValue.build();
        onChanged();
      } else {
        notificationConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNotificationConfig(com.google.cloud.securitycenter.v1p1beta1.NotificationConfig value) {
      if (notificationConfigBuilder_ == null) {
        if (notificationConfig_ != null) {
          notificationConfig_ =
            com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.newBuilder(notificationConfig_).mergeFrom(value).buildPartial();
        } else {
          notificationConfig_ = value;
        }
        onChanged();
      } else {
        notificationConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNotificationConfig() {
      if (notificationConfigBuilder_ == null) {
        notificationConfig_ = null;
        onChanged();
      } else {
        notificationConfig_ = null;
        notificationConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder getNotificationConfigBuilder() {
      
      onChanged();
      return getNotificationConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1p1beta1.NotificationConfigOrBuilder getNotificationConfigOrBuilder() {
      if (notificationConfigBuilder_ != null) {
        return notificationConfigBuilder_.getMessageOrBuilder();
      } else {
        return notificationConfig_ == null ?
            com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.getDefaultInstance() : notificationConfig_;
      }
    }
    /**
     * <pre>
     * Required. The notification config to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig notification_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1p1beta1.NotificationConfig, com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder, com.google.cloud.securitycenter.v1p1beta1.NotificationConfigOrBuilder> 
        getNotificationConfigFieldBuilder() {
      if (notificationConfigBuilder_ == null) {
        notificationConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1p1beta1.NotificationConfig, com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.Builder, com.google.cloud.securitycenter.v1p1beta1.NotificationConfigOrBuilder>(
                getNotificationConfig(),
                getParentForChildren(),
                isClean());
        notificationConfig_ = null;
      }
      return notificationConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The FieldMask to use when updating the notification config.
     * If empty all mutable fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest)
  private static final com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest();
  }

  public static com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNotificationConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateNotificationConfigRequest>() {
    @java.lang.Override
    public UpdateNotificationConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateNotificationConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateNotificationConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNotificationConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1p1beta1.UpdateNotificationConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
