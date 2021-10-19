/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/notification_message.proto

package com.google.cloud.securitycenter.v1;

public interface NotificationMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.NotificationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   *
   * @return The notificationConfigName.
   */
  java.lang.String getNotificationConfigName();
  /**
   *
   *
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   *
   * @return The bytes for notificationConfigName.
   */
  com.google.protobuf.ByteString getNotificationConfigNameBytes();

  /**
   *
   *
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   *
   * @return Whether the finding field is set.
   */
  boolean hasFinding();
  /**
   *
   *
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   *
   * @return The finding.
   */
  com.google.cloud.securitycenter.v1.Finding getFinding();
  /**
   *
   *
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   */
  com.google.cloud.securitycenter.v1.FindingOrBuilder getFindingOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud resource tied to this notification's Finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Resource resource = 3;</code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * The Cloud resource tied to this notification's Finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Resource resource = 3;</code>
   *
   * @return The resource.
   */
  com.google.cloud.securitycenter.v1.Resource getResource();
  /**
   *
   *
   * <pre>
   * The Cloud resource tied to this notification's Finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Resource resource = 3;</code>
   */
  com.google.cloud.securitycenter.v1.ResourceOrBuilder getResourceOrBuilder();

  public com.google.cloud.securitycenter.v1.NotificationMessage.EventCase getEventCase();
}