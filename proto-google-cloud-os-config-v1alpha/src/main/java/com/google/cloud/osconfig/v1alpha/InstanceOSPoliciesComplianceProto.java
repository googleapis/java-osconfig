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
// source: google/cloud/osconfig/v1alpha/instance_os_policies_compliance.proto

package com.google.cloud.osconfig.v1alpha;

public final class InstanceOSPoliciesComplianceProto {
  private InstanceOSPoliciesComplianceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Cgoogle/cloud/osconfig/v1alpha/instance_os_policies_compliance.proto\022\035google.cl"
          + "oud.osconfig.v1alpha\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\0321google/cloud/osconfig/v1alpha/config_common.proto\032\037google/protobuf/timestamp.proto\"\350\006\n"
          + "\034InstanceOSPoliciesCompliance\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\025\n"
          + "\010instance\030\002 \001(\tB\003\340A\003\022J\n"
          + "\005state\030\003"
          + " \001(\01626.google.cloud.osconfig.v1alpha.OSPolicyComplianceStateB\003\340A\003\022\033\n"
          + "\016detailed_state\030\004 \001(\tB\003\340A\003\022\"\n"
          + "\025detailed_state_reason\030\005 \001(\tB\003\340A\003\022r\n"
          + "\025os_policy_compliances\030\006"
          + " \003(\0132N.google.cloud.osconfig.v1alpha.InstanceOSPoliciesCompliance.OSPolicyComplianceB\003\340A\003\022C\n"
          + "\032last_compliance_check_time\030\007"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022#\n"
          + "\026last_compliance_run_id\030\010 \001(\tB\003\340A\003\032\243\002\n"
          + "\022OSPolicyCompliance\022\024\n"
          + "\014os_policy_id\030\001 \001(\t\022M\n"
          + "\024os_policy_assignment\030\002 \001(\tB/\372A,\n"
          + "*osconfig.googleapis.com/OSPolicyAssignment\022E\n"
          + "\005state\030\004"
          + " \001(\01626.google.cloud.osconfig.v1alpha.OSPolicyComplianceState\022a\n"
          + "\036os_policy_resource_compliances\030\005"
          + " \003(\01329.google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance:\214\001\352A\210\001\n"
          + "4osconfig.googleapis.com/InstanceOSPoliciesCompliance\022Pprojects/{project}/locations/{location}/instanceOSPoliciesCompliances/{instance}\"t\n"
          + "&GetInstanceOSPoliciesComplianceRequest\022J\n"
          + "\004name\030\001 \001(\tB<\340A\002\372A6\n"
          + "4osconfig.googleapis.com/InstanceOSPoliciesCompliance\"\234\001\n"
          + "(ListInstanceOSPoliciesCompliancesRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\016\n"
          + "\006filter\030\004 \001(\t\"\253\001\n"
          + ")ListInstanceOSPoliciesCompliancesResponse\022e\n"
          + " instance_os_policies_compliances\030\001"
          + " \003(\0132;.google.cloud.osconfig.v1alpha.InstanceOSPoliciesCompliance\022\027\n"
          + "\017next_page_token\030\002 \001(\tB\362\001\n"
          + "!com.google.cloud.osconfig.v1alphaB!InstanceOSPoliciesCompliancePr"
          + "otoP\001ZEgoogle.golang.org/genproto/google"
          + "apis/cloud/osconfig/v1alpha;osconfig\252\002\035G"
          + "oogle.Cloud.OsConfig.V1Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alpha\352\002"
          + " Google::Cloud::OsConfig::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.ConfigCommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor,
            new java.lang.String[] {
              "Name",
              "Instance",
              "State",
              "DetailedState",
              "DetailedStateReason",
              "OsPolicyCompliances",
              "LastComplianceCheckTime",
              "LastComplianceRunId",
            });
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor,
            new java.lang.String[] {
              "OsPolicyId", "OsPolicyAssignment", "State", "OsPolicyResourceCompliances",
            });
    internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor,
            new java.lang.String[] {
              "InstanceOsPoliciesCompliances", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1alpha.ConfigCommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
