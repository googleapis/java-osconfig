// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1alpha;

public final class OSPolicyAssignmentReportsProto {
  private OSPolicyAssignmentReportsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/osconfig/v1alpha/os_polic" +
      "y_assignment_reports.proto\022\035google.cloud" +
      ".osconfig.v1alpha\032\034google/api/annotation" +
      "s.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\037google/prot" +
      "obuf/timestamp.proto\"l\n\"GetOSPolicyAssig" +
      "nmentReportRequest\022F\n\004name\030\001 \001(\tB8\340A\002\372A2" +
      "\n0osconfig.googleapis.com/OSPolicyAssign" +
      "mentReport\"\250\001\n$ListOSPolicyAssignmentRep" +
      "ortsRequest\022I\n\006parent\030\001 \001(\tB9\340A\002\372A3\n1com" +
      "pute.googleapis.com/InstanceOSPolicyAssi" +
      "gnment\022\021\n\tpage_size\030\002 \001(\005\022\016\n\006filter\030\003 \001(" +
      "\t\022\022\n\npage_token\030\004 \001(\t\"\237\001\n%ListOSPolicyAs" +
      "signmentReportsResponse\022]\n\034os_policy_ass" +
      "ignment_reports\030\001 \003(\01327.google.cloud.osc" +
      "onfig.v1alpha.OSPolicyAssignmentReport\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"\361\016\n\030OSPolicyAssi" +
      "gnmentReport\022\014\n\004name\030\001 \001(\t\022\020\n\010instance\030\002" +
      " \001(\t\022M\n\024os_policy_assignment\030\003 \001(\tB/\372A,\n" +
      "*osconfig.googleapis.com/OSPolicyAssignm" +
      "ent\022i\n\025os_policy_compliances\030\004 \003(\0132J.goo" +
      "gle.cloud.osconfig.v1alpha.OSPolicyAssig" +
      "nmentReport.OSPolicyCompliance\022/\n\013update" +
      "_time\030\005 \001(\0132\032.google.protobuf.Timestamp\022" +
      "\023\n\013last_run_id\030\006 \001(\t\032\225\013\n\022OSPolicyComplia" +
      "nce\022\024\n\014os_policy_id\030\001 \001(\t\022t\n\020compliance_" +
      "state\030\002 \001(\0162Z.google.cloud.osconfig.v1al" +
      "pha.OSPolicyAssignmentReport.OSPolicyCom" +
      "pliance.ComplianceState\022\037\n\027compliance_st" +
      "ate_reason\030\003 \001(\t\022\215\001\n\036os_policy_resource_" +
      "compliances\030\004 \003(\0132e.google.cloud.osconfi" +
      "g.v1alpha.OSPolicyAssignmentReport.OSPol" +
      "icyCompliance.OSPolicyResourceCompliance" +
      "\032\377\007\n\032OSPolicyResourceCompliance\022\035\n\025os_po" +
      "licy_resource_id\030\001 \001(\t\022\227\001\n\014config_steps\030" +
      "\002 \003(\0132\200\001.google.cloud.osconfig.v1alpha.O" +
      "SPolicyAssignmentReport.OSPolicyComplian" +
      "ce.OSPolicyResourceCompliance.OSPolicyRe" +
      "sourceConfigStep\022\217\001\n\020compliance_state\030\003 " +
      "\001(\0162u.google.cloud.osconfig.v1alpha.OSPo" +
      "licyAssignmentReport.OSPolicyCompliance." +
      "OSPolicyResourceCompliance.ComplianceSta" +
      "te\022\037\n\027compliance_state_reason\030\004 \001(\t\022\230\001\n\024" +
      "exec_resource_output\030\005 \001(\0132x.google.clou" +
      "d.osconfig.v1alpha.OSPolicyAssignmentRep" +
      "ort.OSPolicyCompliance.OSPolicyResourceC" +
      "ompliance.ExecResourceOutputH\000\032\333\002\n\032OSPol" +
      "icyResourceConfigStep\022\224\001\n\004type\030\001 \001(\0162\205\001." +
      "google.cloud.osconfig.v1alpha.OSPolicyAs" +
      "signmentReport.OSPolicyCompliance.OSPoli" +
      "cyResourceCompliance.OSPolicyResourceCon" +
      "figStep.Type\022\025\n\rerror_message\030\002 \001(\t\"\216\001\n\004" +
      "Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\016\n\nVALIDATION" +
      "\020\001\022\027\n\023DESIRED_STATE_CHECK\020\002\022\035\n\031DESIRED_S" +
      "TATE_ENFORCEMENT\020\003\022(\n$DESIRED_STATE_CHEC" +
      "K_POST_ENFORCEMENT\020\004\0320\n\022ExecResourceOutp" +
      "ut\022\032\n\022enforcement_output\030\002 \001(\014\"@\n\017Compli" +
      "anceState\022\013\n\007UNKNOWN\020\000\022\r\n\tCOMPLIANT\020\001\022\021\n" +
      "\rNON_COMPLIANT\020\002B\010\n\006output\"@\n\017Compliance" +
      "State\022\013\n\007UNKNOWN\020\000\022\r\n\tCOMPLIANT\020\001\022\021\n\rNON" +
      "_COMPLIANT\020\002:\234\001\352A\230\001\n0osconfig.googleapis" +
      ".com/OSPolicyAssignmentReport\022dprojects/" +
      "{project}/locations/{location}/instances" +
      "/{instance}/osPolicyAssignments/{assignm" +
      "ent}/reportB\205\003\n!com.google.cloud.osconfi" +
      "g.v1alphaB\036OSPolicyAssignmentReportsProt" +
      "oP\001ZEgoogle.golang.org/genproto/googleap" +
      "is/cloud/osconfig/v1alpha;osconfig\252\002\035Goo" +
      "gle.Cloud.OsConfig.V1Alpha\312\002\035Google\\Clou" +
      "d\\OsConfig\\V1alpha\352\002 Google::Cloud::OsCo" +
      "nfig::V1alpha\352A\222\001\n1compute.googleapis.co" +
      "m/InstanceOSPolicyAssignment\022]projects/{" +
      "project}/locations/{location}/instances/" +
      "{instance}/osPolicyAssignments/{assignme" +
      "nt}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "Filter", "PageToken", });
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_ListOSPolicyAssignmentReportsResponse_descriptor,
        new java.lang.String[] { "OsPolicyAssignmentReports", "NextPageToken", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_descriptor,
        new java.lang.String[] { "Name", "Instance", "OsPolicyAssignment", "OsPolicyCompliances", "UpdateTime", "LastRunId", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor,
        new java.lang.String[] { "OsPolicyId", "ComplianceState", "ComplianceStateReason", "OsPolicyResourceCompliances", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor,
        new java.lang.String[] { "OsPolicyResourceId", "ConfigSteps", "ComplianceState", "ComplianceStateReason", "ExecResourceOutput", "Output", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_OSPolicyResourceConfigStep_descriptor,
        new java.lang.String[] { "Type", "ErrorMessage", });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor =
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyAssignmentReport_OSPolicyCompliance_OSPolicyResourceCompliance_ExecResourceOutput_descriptor,
        new java.lang.String[] { "EnforcementOutput", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
