package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *群组相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: GroupService.proto")
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "GroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq,
      com.google.protobuf.StringValue> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createGroup",
      requestType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq,
      com.google.protobuf.StringValue> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq, com.google.protobuf.StringValue> getCreateGroupMethod;
    if ((getCreateGroupMethod = GroupServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getCreateGroupMethod = GroupServiceGrpc.getCreateGroupMethod) == null) {
          GroupServiceGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("createGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> getGetGroupPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroupProperties",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> getGetGroupPropertiesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> getGetGroupPropertiesMethod;
    if ((getGetGroupPropertiesMethod = GroupServiceGrpc.getGetGroupPropertiesMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupPropertiesMethod = GroupServiceGrpc.getGetGroupPropertiesMethod) == null) {
          GroupServiceGrpc.getGetGroupPropertiesMethod = getGetGroupPropertiesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroupProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("getGroupProperties"))
              .build();
        }
      }
    }
    return getGetGroupPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq,
      Base.Result> getSetGroupPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setGroupProperty",
      requestType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq,
      Base.Result> getSetGroupPropertyMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq, Base.Result> getSetGroupPropertyMethod;
    if ((getSetGroupPropertyMethod = GroupServiceGrpc.getSetGroupPropertyMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getSetGroupPropertyMethod = GroupServiceGrpc.getSetGroupPropertyMethod) == null) {
          GroupServiceGrpc.getSetGroupPropertyMethod = getSetGroupPropertyMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setGroupProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("setGroupProperty"))
              .build();
        }
      }
    }
    return getSetGroupPropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getGetGroupInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroupInfo",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getGetGroupInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getGetGroupInfoMethod;
    if ((getGetGroupInfoMethod = GroupServiceGrpc.getGetGroupInfoMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupInfoMethod = GroupServiceGrpc.getGetGroupInfoMethod) == null) {
          GroupServiceGrpc.getGetGroupInfoMethod = getGetGroupInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroupInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("getGroupInfo"))
              .build();
        }
      }
    }
    return getGetGroupInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> getGetGroupPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroupProperty",
      requestType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq.class,
      responseType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> getGetGroupPropertyMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> getGetGroupPropertyMethod;
    if ((getGetGroupPropertyMethod = GroupServiceGrpc.getGetGroupPropertyMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupPropertyMethod = GroupServiceGrpc.getGetGroupPropertyMethod) == null) {
          GroupServiceGrpc.getGetGroupPropertyMethod = getGetGroupPropertyMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroupProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("getGroupProperty"))
              .build();
        }
      }
    }
    return getGetGroupPropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateGroup",
      requestType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq.class,
      responseType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = GroupServiceGrpc.getUpdateGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getUpdateGroupMethod = GroupServiceGrpc.getUpdateGroupMethod) == null) {
          GroupServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("updateGroup"))
              .build();
        }
      }
    }
    return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteGroup",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteGroupMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getDeleteGroupMethod;
    if ((getDeleteGroupMethod = GroupServiceGrpc.getDeleteGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getDeleteGroupMethod = GroupServiceGrpc.getDeleteGroupMethod) == null) {
          GroupServiceGrpc.getDeleteGroupMethod = getDeleteGroupMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("deleteGroup"))
              .build();
        }
      }
    }
    return getDeleteGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> getGetGroupListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroupList",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> getGetGroupListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> getGetGroupListMethod;
    if ((getGetGroupListMethod = GroupServiceGrpc.getGetGroupListMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupListMethod = GroupServiceGrpc.getGetGroupListMethod) == null) {
          GroupServiceGrpc.getGetGroupListMethod = getGetGroupListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroupList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("getGroupList"))
              .build();
        }
      }
    }
    return getGetGroupListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceStub>() {
        @java.lang.Override
        public GroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceStub(channel, callOptions);
        }
      };
    return GroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceBlockingStub>() {
        @java.lang.Override
        public GroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceBlockingStub(channel, callOptions);
        }
      };
    return GroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceFutureStub>() {
        @java.lang.Override
        public GroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceFutureStub(channel, callOptions);
        }
      };
    return GroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *群组相关接口
   * </pre>
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *创建群组，返回群组id
     * </pre>
     */
    public void createGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *群组属性列表
     * </pre>
     */
    public void getGroupProperties(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *群组属性控制
     * </pre>
     */
    public void setGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGroupPropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *群组详情，群组id
     * </pre>
     */
    public void getGroupInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *群组获取单个属性
     * </pre>
     */
    public void getGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupPropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑群组
     * </pre>
     */
    public void updateGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *解散群组，群组id
     * </pre>
     */
    public void deleteGroup(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *群组列表
     * </pre>
     */
    public void getGroupList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq,
                com.google.protobuf.StringValue>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getGetGroupPropertiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp>(
                  this, METHODID_GET_GROUP_PROPERTIES)))
          .addMethod(
            getSetGroupPropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq,
                Base.Result>(
                  this, METHODID_SET_GROUP_PROPERTY)))
          .addMethod(
            getGetGroupInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>(
                  this, METHODID_GET_GROUP_INFO)))
          .addMethod(
            getGetGroupPropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq,
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp>(
                  this, METHODID_GET_GROUP_PROPERTY)))
          .addMethod(
            getUpdateGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq,
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getDeleteGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_DELETE_GROUP)))
          .addMethod(
            getGetGroupListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp>(
                  this, METHODID_GET_GROUP_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *群组相关接口
   * </pre>
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractAsyncStub<GroupServiceStub> {
    private GroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建群组，返回群组id
     * </pre>
     */
    public void createGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *群组属性列表
     * </pre>
     */
    public void getGroupProperties(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *群组属性控制
     * </pre>
     */
    public void setGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGroupPropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *群组详情，群组id
     * </pre>
     */
    public void getGroupInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *群组获取单个属性
     * </pre>
     */
    public void getGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupPropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑群组
     * </pre>
     */
    public void updateGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *解散群组，群组id
     * </pre>
     */
    public void deleteGroup(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *群组列表
     * </pre>
     */
    public void getGroupList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *群组相关接口
   * </pre>
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建群组，返回群组id
     * </pre>
     */
    public com.google.protobuf.StringValue createGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *群组属性列表
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp getGroupProperties(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *群组属性控制
     * </pre>
     */
    public Base.Result setGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGroupPropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *群组详情，群组id
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group getGroupInfo(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *群组获取单个属性
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp getGroupProperty(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupPropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑群组
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group updateGroup(com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *解散群组，群组id
     * </pre>
     */
    public Base.Result deleteGroup(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *群组列表
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp getGroupList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *群组相关接口
   * </pre>
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建群组，返回群组id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> createGroup(
        com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *群组属性列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp> getGroupProperties(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *群组属性控制
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> setGroupProperty(
        com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGroupPropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *群组详情，群组id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> getGroupInfo(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *群组获取单个属性
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp> getGroupProperty(
        com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupPropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑群组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group> updateGroup(
        com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *解散群组，群组id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> deleteGroup(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *群组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp> getGroupList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GROUP = 0;
  private static final int METHODID_GET_GROUP_PROPERTIES = 1;
  private static final int METHODID_SET_GROUP_PROPERTY = 2;
  private static final int METHODID_GET_GROUP_INFO = 3;
  private static final int METHODID_GET_GROUP_PROPERTY = 4;
  private static final int METHODID_UPDATE_GROUP = 5;
  private static final int METHODID_DELETE_GROUP = 6;
  private static final int METHODID_GET_GROUP_LIST = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.CreateGroupReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_GET_GROUP_PROPERTIES:
          serviceImpl.getGroupProperties((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertiesResp>) responseObserver);
          break;
        case METHODID_SET_GROUP_PROPERTY:
          serviceImpl.setGroupProperty((com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.SetGroupPropertyReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_GROUP_INFO:
          serviceImpl.getGroupInfo((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>) responseObserver);
          break;
        case METHODID_GET_GROUP_PROPERTY:
          serviceImpl.getGroupProperty((com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupPropertyResp>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.UpdateGroupReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.Group>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_GROUP_LIST:
          serviceImpl.getGroupList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.GetGroupListResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.GroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupService");
    }
  }

  private static final class GroupServiceFileDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier {
    GroupServiceFileDescriptorSupplier() {}
  }

  private static final class GroupServiceMethodDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceFileDescriptorSupplier())
              .addMethod(getCreateGroupMethod())
              .addMethod(getGetGroupPropertiesMethod())
              .addMethod(getSetGroupPropertyMethod())
              .addMethod(getGetGroupInfoMethod())
              .addMethod(getGetGroupPropertyMethod())
              .addMethod(getUpdateGroupMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getGetGroupListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
