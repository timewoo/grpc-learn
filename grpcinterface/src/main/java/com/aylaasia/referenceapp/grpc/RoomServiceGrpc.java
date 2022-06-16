package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: RoomService.proto")
public final class RoomServiceGrpc {

  private RoomServiceGrpc() {}

  public static final String SERVICE_NAME = "RoomService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq,
      com.google.protobuf.StringValue> getCreateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRoom",
      requestType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq,
      com.google.protobuf.StringValue> getCreateRoomMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq, com.google.protobuf.StringValue> getCreateRoomMethod;
    if ((getCreateRoomMethod = RoomServiceGrpc.getCreateRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getCreateRoomMethod = RoomServiceGrpc.getCreateRoomMethod) == null) {
          RoomServiceGrpc.getCreateRoomMethod = getCreateRoomMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("createRoom"))
              .build();
        }
      }
    }
    return getCreateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getGetRoomListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRoomList",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getGetRoomListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getGetRoomListMethod;
    if ((getGetRoomListMethod = RoomServiceGrpc.getGetRoomListMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getGetRoomListMethod = RoomServiceGrpc.getGetRoomListMethod) == null) {
          RoomServiceGrpc.getGetRoomListMethod = getGetRoomListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRoomList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("getRoomList"))
              .build();
        }
      }
    }
    return getGetRoomListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getGetRoomInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRoomInfo",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getGetRoomInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getGetRoomInfoMethod;
    if ((getGetRoomInfoMethod = RoomServiceGrpc.getGetRoomInfoMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getGetRoomInfoMethod = RoomServiceGrpc.getGetRoomInfoMethod) == null) {
          RoomServiceGrpc.getGetRoomInfoMethod = getGetRoomInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRoomInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("getRoomInfo"))
              .build();
        }
      }
    }
    return getGetRoomInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getUpdateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRoom",
      requestType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.class,
      responseType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getUpdateRoomMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getUpdateRoomMethod;
    if ((getUpdateRoomMethod = RoomServiceGrpc.getUpdateRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getUpdateRoomMethod = RoomServiceGrpc.getUpdateRoomMethod) == null) {
          RoomServiceGrpc.getUpdateRoomMethod = getUpdateRoomMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("updateRoom"))
              .build();
        }
      }
    }
    return getUpdateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRoom",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteRoomMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getDeleteRoomMethod;
    if ((getDeleteRoomMethod = RoomServiceGrpc.getDeleteRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getDeleteRoomMethod = RoomServiceGrpc.getDeleteRoomMethod) == null) {
          RoomServiceGrpc.getDeleteRoomMethod = getDeleteRoomMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("deleteRoom"))
              .build();
        }
      }
    }
    return getDeleteRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getSortRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sortRooms",
      requestType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.class,
      responseType = com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp,
      com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getSortRoomsMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getSortRoomsMethod;
    if ((getSortRoomsMethod = RoomServiceGrpc.getSortRoomsMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getSortRoomsMethod = RoomServiceGrpc.getSortRoomsMethod) == null) {
          RoomServiceGrpc.getSortRoomsMethod = getSortRoomsMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp, com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sortRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("sortRooms"))
              .build();
        }
      }
    }
    return getSortRoomsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceStub>() {
        @java.lang.Override
        public RoomServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceStub(channel, callOptions);
        }
      };
    return RoomServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceBlockingStub>() {
        @java.lang.Override
        public RoomServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceBlockingStub(channel, callOptions);
        }
      };
    return RoomServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceFutureStub>() {
        @java.lang.Override
        public RoomServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceFutureStub(channel, callOptions);
        }
      };
    return RoomServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RoomServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *创建房间，roomId
     * </pre>
     */
    public void createRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取房间列表，floorId
     * </pre>
     */
    public void getRoomList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取room详情
     * </pre>
     */
    public void getRoomInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑room
     * </pre>
     */
    public void updateRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *删除房间，roomId
     * </pre>
     */
    public void deleteRoom(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *房间排序
     * </pre>
     */
    public void sortRooms(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSortRoomsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq,
                com.google.protobuf.StringValue>(
                  this, METHODID_CREATE_ROOM)))
          .addMethod(
            getGetRoomListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>(
                  this, METHODID_GET_ROOM_LIST)))
          .addMethod(
            getGetRoomInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>(
                  this, METHODID_GET_ROOM_INFO)))
          .addMethod(
            getUpdateRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room,
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>(
                  this, METHODID_UPDATE_ROOM)))
          .addMethod(
            getDeleteRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_DELETE_ROOM)))
          .addMethod(
            getSortRoomsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp,
                com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>(
                  this, METHODID_SORT_ROOMS)))
          .build();
    }
  }

  /**
   */
  public static final class RoomServiceStub extends io.grpc.stub.AbstractAsyncStub<RoomServiceStub> {
    private RoomServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建房间，roomId
     * </pre>
     */
    public void createRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取房间列表，floorId
     * </pre>
     */
    public void getRoomList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取room详情
     * </pre>
     */
    public void getRoomInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑room
     * </pre>
     */
    public void updateRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *删除房间，roomId
     * </pre>
     */
    public void deleteRoom(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *房间排序
     * </pre>
     */
    public void sortRooms(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSortRoomsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoomServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoomServiceBlockingStub> {
    private RoomServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建房间，roomId
     * </pre>
     */
    public com.google.protobuf.StringValue createRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取房间列表，floorId
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp getRoomList(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取room详情
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room getRoomInfo(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑room
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room updateRoom(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *删除房间，roomId
     * </pre>
     */
    public Base.Result deleteRoom(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *房间排序
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp sortRooms(com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSortRoomsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoomServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoomServiceFutureStub> {
    private RoomServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建房间，roomId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> createRoom(
        com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取房间列表，floorId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> getRoomList(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取room详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> getRoomInfo(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room> updateRoom(
        com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *删除房间，roomId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> deleteRoom(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *房间排序
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp> sortRooms(
        com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSortRoomsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ROOM = 0;
  private static final int METHODID_GET_ROOM_LIST = 1;
  private static final int METHODID_GET_ROOM_INFO = 2;
  private static final int METHODID_UPDATE_ROOM = 3;
  private static final int METHODID_DELETE_ROOM = 4;
  private static final int METHODID_SORT_ROOMS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ROOM:
          serviceImpl.createRoom((com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.CreateRoomReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_GET_ROOM_LIST:
          serviceImpl.getRoomList((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>) responseObserver);
          break;
        case METHODID_GET_ROOM_INFO:
          serviceImpl.getRoomInfo((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>) responseObserver);
          break;
        case METHODID_UPDATE_ROOM:
          serviceImpl.updateRoom((com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.Room>) responseObserver);
          break;
        case METHODID_DELETE_ROOM:
          serviceImpl.deleteRoom((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_SORT_ROOMS:
          serviceImpl.sortRooms((com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.GetRoomListResp>) responseObserver);
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

  private static abstract class RoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.RoomServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomService");
    }
  }

  private static final class RoomServiceFileDescriptorSupplier
      extends RoomServiceBaseDescriptorSupplier {
    RoomServiceFileDescriptorSupplier() {}
  }

  private static final class RoomServiceMethodDescriptorSupplier
      extends RoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomServiceFileDescriptorSupplier())
              .addMethod(getCreateRoomMethod())
              .addMethod(getGetRoomListMethod())
              .addMethod(getGetRoomInfoMethod())
              .addMethod(getUpdateRoomMethod())
              .addMethod(getDeleteRoomMethod())
              .addMethod(getSortRoomsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
