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
// source: google/cloud/securitycenter/v1/vulnerability.proto

package com.google.cloud.securitycenter.v1;

public interface CveOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Cve)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier for the vulnerability. e.g. CVE-2021-34527
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The unique identifier for the vulnerability. e.g. CVE-2021-34527
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.Reference> getReferencesList();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v1.Reference getReferences(int index);
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  int getReferencesCount();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.ReferenceOrBuilder>
      getReferencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional information about the CVE.
   * e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Reference references = 2;</code>
   */
  com.google.cloud.securitycenter.v1.ReferenceOrBuilder getReferencesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   *
   * @return Whether the cvssv3 field is set.
   */
  boolean hasCvssv3();
  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   *
   * @return The cvssv3.
   */
  com.google.cloud.securitycenter.v1.Cvssv3 getCvssv3();
  /**
   *
   *
   * <pre>
   * Describe Common Vulnerability Scoring System specified at
   * https://www.first.org/cvss/v3.1/specification-document
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Cvssv3 cvssv3 = 3;</code>
   */
  com.google.cloud.securitycenter.v1.Cvssv3OrBuilder getCvssv3OrBuilder();
}
