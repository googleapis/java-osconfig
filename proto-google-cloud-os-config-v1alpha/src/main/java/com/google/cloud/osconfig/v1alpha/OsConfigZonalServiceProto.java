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
// source: google/cloud/osconfig/v1alpha/osconfig_zonal_service.proto

package com.google.cloud.osconfig.v1alpha;

public final class OsConfigZonalServiceProto {
  private OsConfigZonalServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/osconfig/v1alpha/osconfig"
          + "_zonal_service.proto\022\035google.cloud.oscon"
          + "fig.v1alpha\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\031google/api/r"
          + "esource.proto\032Cgoogle/cloud/osconfig/v1a"
          + "lpha/instance_os_policies_compliance.pro"
          + "to\032-google/cloud/osconfig/v1alpha/invent"
          + "ory.proto\0329google/cloud/osconfig/v1alpha"
          + "/os_policy_assignments.proto\0321google/clo"
          + "ud/osconfig/v1alpha/vulnerability.proto\032"
          + "#google/longrunning/operations.proto2\324\030\n"
          + "\024OsConfigZonalService\022\310\002\n\030CreateOSPolicy"
          + "Assignment\022>.google.cloud.osconfig.v1alp"
          + "ha.CreateOSPolicyAssignmentRequest\032\035.goo"
          + "gle.longrunning.Operation\"\314\001\202\323\344\223\002T\"</v1a"
          + "lpha/{parent=projects/*/locations/*}/osP"
          + "olicyAssignments:\024os_policy_assignment\332A"
          + "3parent,os_policy_assignment,os_policy_a"
          + "ssignment_id\312A9\n\022OSPolicyAssignment\022#OSP"
          + "olicyAssignmentOperationMetadata\022\312\002\n\030Upd"
          + "ateOSPolicyAssignment\022>.google.cloud.osc"
          + "onfig.v1alpha.UpdateOSPolicyAssignmentRe"
          + "quest\032\035.google.longrunning.Operation\"\316\001\202"
          + "\323\344\223\002i2Q/v1alpha/{os_policy_assignment.na"
          + "me=projects/*/locations/*/osPolicyAssign"
          + "ments/*}:\024os_policy_assignment\332A os_poli"
          + "cy_assignment,update_mask\312A9\n\022OSPolicyAs"
          + "signment\022#OSPolicyAssignmentOperationMet"
          + "adata\022\324\001\n\025GetOSPolicyAssignment\022;.google"
          + ".cloud.osconfig.v1alpha.GetOSPolicyAssig"
          + "nmentRequest\0321.google.cloud.osconfig.v1a"
          + "lpha.OSPolicyAssignment\"K\202\323\344\223\002>\022</v1alph"
          + "a/{name=projects/*/locations/*/osPolicyA"
          + "ssignments/*}\332A\004name\022\347\001\n\027ListOSPolicyAss"
          + "ignments\022=.google.cloud.osconfig.v1alpha"
          + ".ListOSPolicyAssignmentsRequest\032>.google"
          + ".cloud.osconfig.v1alpha.ListOSPolicyAssi"
          + "gnmentsResponse\"M\202\323\344\223\002>\022</v1alpha/{paren"
          + "t=projects/*/locations/*}/osPolicyAssign"
          + "ments\332A\006parent\022\213\002\n\037ListOSPolicyAssignmen"
          + "tRevisions\022E.google.cloud.osconfig.v1alp"
          + "ha.ListOSPolicyAssignmentRevisionsReques"
          + "t\032F.google.cloud.osconfig.v1alpha.ListOS"
          + "PolicyAssignmentRevisionsResponse\"Y\202\323\344\223\002"
          + "L\022J/v1alpha/{name=projects/*/locations/*"
          + "/osPolicyAssignments/*}:listRevisions\332A\004"
          + "name\022\206\002\n\030DeleteOSPolicyAssignment\022>.goog"
          + "le.cloud.osconfig.v1alpha.DeleteOSPolicy"
          + "AssignmentRequest\032\035.google.longrunning.O"
          + "peration\"\212\001\202\323\344\223\002>*</v1alpha/{name=projec"
          + "ts/*/locations/*/osPolicyAssignments/*}\332"
          + "A\004name\312A<\n\025google.protobuf.Empty\022#OSPoli"
          + "cyAssignmentOperationMetadata\022\374\001\n\037GetIns"
          + "tanceOSPoliciesCompliance\022E.google.cloud"
          + ".osconfig.v1alpha.GetInstanceOSPoliciesC"
          + "omplianceRequest\032;.google.cloud.osconfig"
          + ".v1alpha.InstanceOSPoliciesCompliance\"U\202"
          + "\323\344\223\002H\022F/v1alpha/{name=projects/*/locatio"
          + "ns/*/instanceOSPoliciesCompliances/*}\332A\004"
          + "name\022\217\002\n!ListInstanceOSPoliciesComplianc"
          + "es\022G.google.cloud.osconfig.v1alpha.ListI"
          + "nstanceOSPoliciesCompliancesRequest\032H.go"
          + "ogle.cloud.osconfig.v1alpha.ListInstance"
          + "OSPoliciesCompliancesResponse\"W\202\323\344\223\002H\022F/"
          + "v1alpha/{parent=projects/*/locations/*}/"
          + "instanceOSPoliciesCompliances\332A\006parent\022\271"
          + "\001\n\014GetInventory\0222.google.cloud.osconfig."
          + "v1alpha.GetInventoryRequest\032(.google.clo"
          + "ud.osconfig.v1alpha.Inventory\"K\202\323\344\223\002>\022</"
          + "v1alpha/{name=projects/*/locations/*/ins"
          + "tances/*/inventory}\332A\004name\022\323\001\n\017ListInven"
          + "tories\0225.google.cloud.osconfig.v1alpha.L"
          + "istInventoriesRequest\0326.google.cloud.osc"
          + "onfig.v1alpha.ListInventoriesResponse\"Q\202"
          + "\323\344\223\002B\022@/v1alpha/{parent=projects/*/locat"
          + "ions/*/instances/*}/inventories\332A\006parent"
          + "\022\341\001\n\026GetVulnerabilityReport\022<.google.clo"
          + "ud.osconfig.v1alpha.GetVulnerabilityRepo"
          + "rtRequest\0322.google.cloud.osconfig.v1alph"
          + "a.VulnerabilityReport\"U\202\323\344\223\002H\022F/v1alpha/"
          + "{name=projects/*/locations/*/instances/*"
          + "/vulnerabilityReport}\332A\004name\022\367\001\n\030ListVul"
          + "nerabilityReports\022>.google.cloud.osconfi"
          + "g.v1alpha.ListVulnerabilityReportsReques"
          + "t\032?.google.cloud.osconfig.v1alpha.ListVu"
          + "lnerabilityReportsResponse\"Z\202\323\344\223\002K\022I/v1a"
          + "lpha/{parent=projects/*/locations/*/inst"
          + "ances/*}/vulnerabilityReports\332A\006parent\032K"
          + "\312A\027osconfig.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\314\002\n!"
          + "com.google.cloud.osconfig.v1alphaB\031OsCon"
          + "figZonalServiceProtoP\001ZEgoogle.golang.or"
          + "g/genproto/googleapis/cloud/osconfig/v1a"
          + "lpha;osconfig\252\002\035Google.Cloud.OsConfig.V1"
          + "Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alpha\352\002 "
          + "Google::Cloud::OsConfig::V1alpha\352A_\n\037com"
          + "pute.googleapis.com/Instance\022<projects/{"
          + "project}/locations/{location}/instances/"
          + "{instance}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.InstanceOSPoliciesComplianceProto.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.Inventories.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.OSPolicyAssignments.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.VulnerabilityProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1alpha.InstanceOSPoliciesComplianceProto.getDescriptor();
    com.google.cloud.osconfig.v1alpha.Inventories.getDescriptor();
    com.google.cloud.osconfig.v1alpha.OSPolicyAssignments.getDescriptor();
    com.google.cloud.osconfig.v1alpha.VulnerabilityProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
