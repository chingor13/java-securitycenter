// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/resource.proto

package com.google.cloud.securitycenter.v1;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/securitycenter/v1/resourc" +
      "e.proto\022\036google.cloud.securitycenter.v1\032" +
      "\037google/api/field_behavior.proto\032+google" +
      "/cloud/securitycenter/v1/folder.proto\032\034g" +
      "oogle/api/annotations.proto\"\300\001\n\010Resource" +
      "\022\014\n\004name\030\001 \001(\t\022\017\n\007project\030\002 \001(\t\022\034\n\024proje" +
      "ct_display_name\030\003 \001(\t\022\016\n\006parent\030\004 \001(\t\022\033\n" +
      "\023parent_display_name\030\005 \001(\t\022\014\n\004type\030\006 \001(\t" +
      "\022<\n\007folders\030\007 \003(\0132&.google.cloud.securit" +
      "ycenter.v1.FolderB\003\340A\003B\351\001\n\"com.google.cl" +
      "oud.securitycenter.v1B\rResourceProtoP\001ZL" +
      "google.golang.org/genproto/googleapis/cl" +
      "oud/securitycenter/v1;securitycenter\252\002\036G" +
      "oogle.Cloud.SecurityCenter.V1\312\002\036Google\\C" +
      "loud\\SecurityCenter\\V1\352\002!Google::Cloud::" +
      "SecurityCenter::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.FolderProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Resource_descriptor,
        new java.lang.String[] { "Name", "Project", "ProjectDisplayName", "Parent", "ParentDisplayName", "Type", "Folders", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.FolderProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}