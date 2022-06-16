package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: FloorService.proto")
public final class FloorServiceGrpc {

  private FloorServiceGrpc() {}

  public static final String SERVICE_NAME = "FloorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq,
      com.google.protobuf.StringValue> getCreateFloorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createFloor",
      requestType = com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq,
      com.google.protobuf.StringValue> getCreateFloorMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq, com.google.protobuf.StringValue> getCreateFloorMethod;
    if ((getCreateFloorMethod = FloorServiceGrpc.getCreateFloorMethod) == null) {
      synchronized (FloorServiceGrpc.class) {
        if ((getCreateFloorMethod = FloorServiceGrpc.getCreateFloorMethod) == null) {
          FloorServiceGrpc.getCreateFloorMethod = getCreateFloorMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createFloor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new FloorServiceMethodDescriptorSupplier("createFloor"))
              .build();
        }
      }
    }
    return getCreateFloorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> getGetFloorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFloorList",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> getGetFloorListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> getGetFloorListMethod;
    if ((getGetFloorListMethod = FloorServiceGrpc.getGetFloorListMethod) == null) {
      synchronized (FloorServiceGrpc.class) {
        if ((getGetFloorListMethod = FloorServiceGrpc.getGetFloorListMethod) == null) {
          FloorServiceGrpc.getGetFloorListMethod = getGetFloorListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFloorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp.getDefaultInstance()))
              .setSchemaDescriptor(new FloorServiceMethodDescriptorSupplier("getFloorList"))
              .build();
        }
      }
    }
    return getGetFloorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteFloorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFloor",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getDeleteFloorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getDeleteFloorMethod;
    if ((getDeleteFloorMethod = FloorServiceGrpc.getDeleteFloorMethod) == null) {
      synchronized (FloorServiceGrpc.class) {
        if ((getDeleteFloorMethod = FloorServiceGrpc.getDeleteFloorMethod) == null) {
          FloorServiceGrpc.getDeleteFloorMethod = getDeleteFloorMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFloor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new FloorServiceMethodDescriptorSupplier("deleteFloor"))
              .build();
        }
      }
    }
    return getDeleteFloorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> getGetFloorRoomListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFloorRoomList",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> getGetFloorRoomListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> getGetFloorRoomListMethod;
    if ((getGetFloorRoomListMethod = FloorServiceGrpc.getGetFloorRoomListMethod) == null) {
      synchronized (FloorServiceGrpc.class) {
        if ((getGetFloorRoomListMethod = FloorServiceGrpc.getGetFloorRoomListMethod) == null) {
          FloorServiceGrpc.getGetFloorRoomListMethod = getGetFloorRoomListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFloorRoomList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp.getDefaultInstance()))
              .setSchemaDescriptor(new FloorServiceMethodDescriptorSupplier("getFloorRoomList"))
              .build();
        }
      }
    }
    return getGetFloorRoomListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq,
      Base.Result> getRememberFloorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rememberFloor",
      requestType = com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq,
      Base.Result> getRememberFloorMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq, Base.Result> getRememberFloorMethod;
    if ((getRememberFloorMethod = FloorServiceGrpc.getRememberFloorMethod) == null) {
      synchronized (FloorServiceGrpc.class) {
        if ((getRememberFloorMethod = FloorServiceGrpc.getRememberFloorMethod) == null) {
          FloorServiceGrpc.getRememberFloorMethod = getRememberFloorMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rememberFloor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new FloorServiceMethodDescriptorSupplier("rememberFloor"))
              .build();
        }
      }
    }
    return getRememberFloorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FloorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FloorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FloorServiceStub>() {
        @java.lang.Override
        public FloorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FloorServiceStub(channel, callOptions);
        }
      };
    return FloorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FloorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FloorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FloorServiceBlockingStub>() {
        @java.lang.Override
        public FloorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FloorServiceBlockingStub(channel, callOptions);
        }
      };
    return FloorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FloorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FloorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FloorServiceFutureStub>() {
        @java.lang.Override
        public FloorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FloorServiceFutureStub(channel, callOptions);
        }
      };
    return FloorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FloorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *创建楼层，floorId
     * </pre>
     */
    public void createFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFloorMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *楼层列表，homeId
     * </pre>
     */
    public void getFloorList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFloorListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *删除楼层，floorId
     * </pre>
     */
    public void deleteFloor(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFloorMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *楼层房间列表，homeId
     * </pre>
     */
    public void getFloorRoomList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFloorRoomListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *记住楼层，floorId
     * </pre>
     */
    public void rememberFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRememberFloorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFloorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq,
                com.google.protobuf.StringValue>(
                  this, METHODID_CREATE_FLOOR)))
          .addMethod(
            getGetFloorListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp>(
                  this, METHODID_GET_FLOOR_LIST)))
          .addMethod(
            getDeleteFloorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_DELETE_FLOOR)))
          .addMethod(
            getGetFloorRoomListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp>(
                  this, METHODID_GET_FLOOR_ROOM_LIST)))
          .addMethod(
            getRememberFloorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq,
                Base.Result>(
                  this, METHODID_REMEMBER_FLOOR)))
          .build();
    }
  }

  /**
   */
  public static final class FloorServiceStub extends io.grpc.stub.AbstractAsyncStub<FloorServiceStub> {
    private FloorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FloorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FloorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建楼层，floorId
     * </pre>
     */
    public void createFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFloorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *楼层列表，homeId
     * </pre>
     */
    public void getFloorList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFloorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *删除楼层，floorId
     * </pre>
     */
    public void deleteFloor(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFloorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *楼层房间列表，homeId
     * </pre>
     */
    public void getFloorRoomList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFloorRoomListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *记住楼层，floorId
     * </pre>
     */
    public void rememberFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRememberFloorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FloorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FloorServiceBlockingStub> {
    private FloorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FloorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FloorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建楼层，floorId
     * </pre>
     */
    public com.google.protobuf.StringValue createFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFloorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *楼层列表，homeId
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp getFloorList(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFloorListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *删除楼层，floorId
     * </pre>
     */
    public Base.Result deleteFloor(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFloorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *楼层房间列表，homeId
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp getFloorRoomList(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFloorRoomListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *记住楼层，floorId
     * </pre>
     */
    public Base.Result rememberFloor(com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRememberFloorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FloorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FloorServiceFutureStub> {
    private FloorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FloorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FloorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建楼层，floorId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> createFloor(
        com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFloorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *楼层列表，homeId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp> getFloorList(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFloorListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *删除楼层，floorId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> deleteFloor(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFloorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *楼层房间列表，homeId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp> getFloorRoomList(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFloorRoomListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *记住楼层，floorId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> rememberFloor(
        com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRememberFloorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FLOOR = 0;
  private static final int METHODID_GET_FLOOR_LIST = 1;
  private static final int METHODID_DELETE_FLOOR = 2;
  private static final int METHODID_GET_FLOOR_ROOM_LIST = 3;
  private static final int METHODID_REMEMBER_FLOOR = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FloorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FloorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FLOOR:
          serviceImpl.createFloor((com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.CreateFloorReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_GET_FLOOR_LIST:
          serviceImpl.getFloorList((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorListResp>) responseObserver);
          break;
        case METHODID_DELETE_FLOOR:
          serviceImpl.deleteFloor((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_FLOOR_ROOM_LIST:
          serviceImpl.getFloorRoomList((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.GetFloorRoomListResp>) responseObserver);
          break;
        case METHODID_REMEMBER_FLOOR:
          serviceImpl.rememberFloor((com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.RememberFloorReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
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

  private static abstract class FloorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FloorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.FloorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FloorService");
    }
  }

  private static final class FloorServiceFileDescriptorSupplier
      extends FloorServiceBaseDescriptorSupplier {
    FloorServiceFileDescriptorSupplier() {}
  }

  private static final class FloorServiceMethodDescriptorSupplier
      extends FloorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FloorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FloorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FloorServiceFileDescriptorSupplier())
              .addMethod(getCreateFloorMethod())
              .addMethod(getGetFloorListMethod())
              .addMethod(getDeleteFloorMethod())
              .addMethod(getGetFloorRoomListMethod())
              .addMethod(getRememberFloorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
