// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

package com.google.cloud.osconfig.v1alpha;

public final class OsPolicyAssignmentsProto {
  private OsPolicyAssignmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_Inventory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_Inventory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_Rollout_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_Rollout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_CreateOSPolicyAssignmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_CreateOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_DeleteOSPolicyAssignmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_DeleteOSPolicyAssignmentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/osconfig/v1alpha/os_polic" +
      "y_assignments.proto\022\035google.cloud.osconf" +
      "ig.v1alpha\032\034google/api/annotations.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032-google/cloud/oscon" +
      "fig/v1alpha/os_policy.proto\0323google/clou" +
      "d/osconfig/v1alpha/osconfig_common.proto" +
      "\032\036google/protobuf/duration.proto\032 google" +
      "/protobuf/field_mask.proto\032\037google/proto" +
      "buf/timestamp.proto\"\354\013\n\022OSPolicyAssignme" +
      "nt\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022A\n" +
      "\013os_policies\030\003 \003(\0132\'.google.cloud.osconf" +
      "ig.v1alpha.OSPolicyB\003\340A\002\022^\n\017instance_fil" +
      "ter\030\004 \001(\0132@.google.cloud.osconfig.v1alph" +
      "a.OSPolicyAssignment.InstanceFilterB\003\340A\002" +
      "\022O\n\007rollout\030\005 \001(\01329.google.cloud.osconfi" +
      "g.v1alpha.OSPolicyAssignment.RolloutB\003\340A" +
      "\002\022\030\n\013revision_id\030\006 \001(\tB\003\340A\003\022=\n\024revision_" +
      "create_time\030\007 \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\022\014\n\004etag\030\010 \001(\t\022Z\n\rrollout_stat" +
      "e\030\t \001(\0162>.google.cloud.osconfig.v1alpha." +
      "OSPolicyAssignment.RolloutStateB\003\340A\003\022\025\n\010" +
      "baseline\030\n \001(\010B\003\340A\003\022\024\n\007deleted\030\013 \001(\010B\003\340A" +
      "\003\022\030\n\013reconciling\030\014 \001(\010B\003\340A\003\022\020\n\003uid\030\r \001(\t" +
      "B\003\340A\003\032\221\001\n\010LabelSet\022V\n\006labels\030\001 \003(\0132F.goo" +
      "gle.cloud.osconfig.v1alpha.OSPolicyAssig" +
      "nment.LabelSet.LabelsEntry\032-\n\013LabelsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032\203\003\n\016In" +
      "stanceFilter\022\013\n\003all\030\001 \001(\010\022\032\n\016os_short_na" +
      "mes\030\002 \003(\tB\002\030\001\022T\n\020inclusion_labels\030\003 \003(\0132" +
      ":.google.cloud.osconfig.v1alpha.OSPolicy" +
      "Assignment.LabelSet\022T\n\020exclusion_labels\030" +
      "\004 \003(\0132:.google.cloud.osconfig.v1alpha.OS" +
      "PolicyAssignment.LabelSet\022_\n\013inventories" +
      "\030\005 \003(\0132J.google.cloud.osconfig.v1alpha.O" +
      "SPolicyAssignment.InstanceFilter.Invento" +
      "ry\032;\n\tInventory\022\032\n\ros_short_name\030\001 \001(\tB\003" +
      "\340A\002\022\022\n\nos_version\030\002 \001(\t\032\223\001\n\007Rollout\022M\n\021d" +
      "isruption_budget\030\001 \001(\0132-.google.cloud.os" +
      "config.v1alpha.FixedOrPercentB\003\340A\002\0229\n\021mi" +
      "n_wait_duration\030\002 \001(\0132\031.google.protobuf." +
      "DurationB\003\340A\002\"l\n\014RolloutState\022\035\n\031ROLLOUT" +
      "_STATE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\016\n" +
      "\nCANCELLING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDE" +
      "D\020\004:\204\001\352A\200\001\n*osconfig.googleapis.com/OSPo" +
      "licyAssignment\022Rprojects/{project}/locat" +
      "ions/{location}/osPolicyAssignments/{os_" +
      "policy_assignment}\"\352\004\n#OSPolicyAssignmen" +
      "tOperationMetadata\022M\n\024os_policy_assignme" +
      "nt\030\001 \001(\tB/\372A,\n*osconfig.googleapis.com/O" +
      "SPolicyAssignment\022`\n\napi_method\030\002 \001(\0162L." +
      "google.cloud.osconfig.v1alpha.OSPolicyAs" +
      "signmentOperationMetadata.APIMethod\022f\n\rr" +
      "ollout_state\030\003 \001(\0162O.google.cloud.osconf" +
      "ig.v1alpha.OSPolicyAssignmentOperationMe" +
      "tadata.RolloutState\0226\n\022rollout_start_tim" +
      "e\030\004 \001(\0132\032.google.protobuf.Timestamp\0227\n\023r" +
      "ollout_update_time\030\005 \001(\0132\032.google.protob" +
      "uf.Timestamp\"K\n\tAPIMethod\022\032\n\026API_METHOD_" +
      "UNSPECIFIED\020\000\022\n\n\006CREATE\020\001\022\n\n\006UPDATE\020\002\022\n\n" +
      "\006DELETE\020\003\"l\n\014RolloutState\022\035\n\031ROLLOUT_STA" +
      "TE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\016\n\nCAN" +
      "CELLING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDED\020\004\"" +
      "\330\001\n\037CreateOSPolicyAssignmentRequest\0229\n\006p" +
      "arent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapi" +
      "s.com/Location\022T\n\024os_policy_assignment\030\002" +
      " \001(\01321.google.cloud.osconfig.v1alpha.OSP" +
      "olicyAssignmentB\003\340A\002\022$\n\027os_policy_assign" +
      "ment_id\030\003 \001(\tB\003\340A\002\"\255\001\n\037UpdateOSPolicyAss" +
      "ignmentRequest\022T\n\024os_policy_assignment\030\001" +
      " \001(\01321.google.cloud.osconfig.v1alpha.OSP" +
      "olicyAssignmentB\003\340A\002\0224\n\013update_mask\030\002 \001(" +
      "\0132\032.google.protobuf.FieldMaskB\003\340A\001\"`\n\034Ge" +
      "tOSPolicyAssignmentRequest\022@\n\004name\030\001 \001(\t" +
      "B2\340A\002\372A,\n*osconfig.googleapis.com/OSPoli" +
      "cyAssignment\"\202\001\n\036ListOSPolicyAssignments" +
      "Request\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locatio" +
      "ns.googleapis.com/Location\022\021\n\tpage_size\030" +
      "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\214\001\n\037ListOSPoli" +
      "cyAssignmentsResponse\022P\n\025os_policy_assig" +
      "nments\030\001 \003(\01321.google.cloud.osconfig.v1a" +
      "lpha.OSPolicyAssignment\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"\221\001\n&ListOSPolicyAssignmentRevis" +
      "ionsRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*oscon" +
      "fig.googleapis.com/OSPolicyAssignment\022\021\n" +
      "\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\224\001\n" +
      "\'ListOSPolicyAssignmentRevisionsResponse" +
      "\022P\n\025os_policy_assignments\030\001 \003(\01321.google" +
      ".cloud.osconfig.v1alpha.OSPolicyAssignme" +
      "nt\022\027\n\017next_page_token\030\002 \001(\t\"c\n\037DeleteOSP" +
      "olicyAssignmentRequest\022@\n\004name\030\001 \001(\tB2\340A" +
      "\002\372A,\n*osconfig.googleapis.com/OSPolicyAs" +
      "signmentB\351\001\n!com.google.cloud.osconfig.v" +
      "1alphaB\030OsPolicyAssignmentsProtoP\001ZEgoog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "osconfig/v1alpha;osconfig\252\002\035Google.Cloud" +
      ".OsConfig.V1Alpha\312\002\035Google\\Cloud\\OsConfi" +
      "g\\V1alpha\352\002 Google::Cloud::OsConfig::V1a" +
      "lphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.osconfig.v1alpha.OsPolicyProto.getDescriptor(),
          com.google.cloud.osconfig.v1alpha.Common.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor,
        new java.lang.String[] { "Name", "Description", "OsPolicies", "InstanceFilter", "Rollout", "RevisionId", "RevisionCreateTime", "Etag", "RolloutState", "Baseline", "Deleted", "Reconciling", "Uid", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_descriptor,
        new java.lang.String[] { "Labels", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_descriptor,
        new java.lang.String[] { "All", "OsShortNames", "InclusionLabels", "ExclusionLabels", "Inventories", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_Inventory_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_Inventory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_InstanceFilter_Inventory_descriptor,
        new java.lang.String[] { "OsShortName", "OsVersion", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_Rollout_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_Rollout_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignment_Rollout_descriptor,
        new java.lang.String[] { "DisruptionBudget", "MinWaitDuration", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentOperationMetadata_descriptor,
        new java.lang.String[] { "OsPolicyAssignment", "ApiMethod", "RolloutState", "RolloutStartTime", "RolloutUpdateTime", });
    internal_static_google_cloud_osconfig_v1alpha_CreateOSPolicyAssignmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_CreateOSPolicyAssignmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_CreateOSPolicyAssignmentRequest_descriptor,
        new java.lang.String[] { "Parent", "OsPolicyAssignment", "OsPolicyAssignmentId", });
    internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_UpdateOSPolicyAssignmentRequest_descriptor,
        new java.lang.String[] { "OsPolicyAssignment", "UpdateMask", });
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentsResponse_descriptor,
        new java.lang.String[] { "OsPolicyAssignments", "NextPageToken", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsRequest_descriptor,
        new java.lang.String[] { "Name", "PageSize", "PageToken", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentRevisionsResponse_descriptor,
        new java.lang.String[] { "OsPolicyAssignments", "NextPageToken", });
    internal_static_google_cloud_osconfig_v1alpha_DeleteOSPolicyAssignmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_osconfig_v1alpha_DeleteOSPolicyAssignmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_DeleteOSPolicyAssignmentRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1alpha.OsPolicyProto.getDescriptor();
    com.google.cloud.osconfig.v1alpha.Common.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
