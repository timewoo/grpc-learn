package com.example.grpcclient.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: TimeZoneService.proto")
public final class TimeZoneServiceGrpc {

  private TimeZoneServiceGrpc() {}

  public static final String SERVICE_NAME = "TimeZoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      TimeZoneServiceOuterClass.TimeZoneListResp> getGetTimeZonListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimeZonList",
      requestType = com.google.protobuf.Empty.class,
      responseType = TimeZoneServiceOuterClass.TimeZoneListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      TimeZoneServiceOuterClass.TimeZoneListResp> getGetTimeZonListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, TimeZoneServiceOuterClass.TimeZoneListResp> getGetTimeZonListMethod;
    if ((getGetTimeZonListMethod = TimeZoneServiceGrpc.getGetTimeZonListMethod) == null) {
      synchronized (TimeZoneServiceGrpc.class) {
        if ((getGetTimeZonListMethod = TimeZoneServiceGrpc.getGetTimeZonListMethod) == null) {
          TimeZoneServiceGrpc.getGetTimeZonListMethod = getGetTimeZonListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, TimeZoneServiceOuterClass.TimeZoneListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTimeZonList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TimeZoneServiceOuterClass.TimeZoneListResp.getDefaultInstance()))
              .setSchemaDescriptor(new TimeZoneServiceMethodDescriptorSupplier("getTimeZonList"))
              .build();
        }
      }
    }
    return getGetTimeZonListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      UserServiceOuterClass.User> getSetTimeZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTimeZone",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = UserServiceOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      UserServiceOuterClass.User> getSetTimeZoneMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, UserServiceOuterClass.User> getSetTimeZoneMethod;
    if ((getSetTimeZoneMethod = TimeZoneServiceGrpc.getSetTimeZoneMethod) == null) {
      synchronized (TimeZoneServiceGrpc.class) {
        if ((getSetTimeZoneMethod = TimeZoneServiceGrpc.getSetTimeZoneMethod) == null) {
          TimeZoneServiceGrpc.getSetTimeZoneMethod = getSetTimeZoneMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, UserServiceOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setTimeZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new TimeZoneServiceMethodDescriptorSupplier("setTimeZone"))
              .build();
        }
      }
    }
    return getSetTimeZoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimeZoneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceStub>() {
        @Override
        public TimeZoneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeZoneServiceStub(channel, callOptions);
        }
      };
    return TimeZoneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimeZoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceBlockingStub>() {
        @Override
        public TimeZoneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeZoneServiceBlockingStub(channel, callOptions);
        }
      };
    return TimeZoneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimeZoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeZoneServiceFutureStub>() {
        @Override
        public TimeZoneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeZoneServiceFutureStub(channel, callOptions);
        }
      };
    return TimeZoneServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TimeZoneServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *获取时区列表
     * </pre>
     */
    public void getTimeZonList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<TimeZoneServiceOuterClass.TimeZoneListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimeZonListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设置时区
     * </pre>
     */
    public void setTimeZone(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTimeZoneMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimeZonListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                TimeZoneServiceOuterClass.TimeZoneListResp>(
                  this, METHODID_GET_TIME_ZON_LIST)))
          .addMethod(
            getSetTimeZoneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                UserServiceOuterClass.User>(
                  this, METHODID_SET_TIME_ZONE)))
          .build();
    }
  }

  /**
   */
  public static final class TimeZoneServiceStub extends io.grpc.stub.AbstractAsyncStub<TimeZoneServiceStub> {
    private TimeZoneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TimeZoneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeZoneServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取时区列表
     * </pre>
     */
    public void getTimeZonList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<TimeZoneServiceOuterClass.TimeZoneListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimeZonListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设置时区
     * </pre>
     */
    public void setTimeZone(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTimeZoneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TimeZoneServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TimeZoneServiceBlockingStub> {
    private TimeZoneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TimeZoneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeZoneServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取时区列表
     * </pre>
     */
    public TimeZoneServiceOuterClass.TimeZoneListResp getTimeZonList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimeZonListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设置时区
     * </pre>
     */
    public UserServiceOuterClass.User setTimeZone(com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTimeZoneMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimeZoneServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TimeZoneServiceFutureStub> {
    private TimeZoneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TimeZoneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeZoneServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取时区列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TimeZoneServiceOuterClass.TimeZoneListResp> getTimeZonList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimeZonListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设置时区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserServiceOuterClass.User> setTimeZone(
        com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTimeZoneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TIME_ZON_LIST = 0;
  private static final int METHODID_SET_TIME_ZONE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimeZoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimeZoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TIME_ZON_LIST:
          serviceImpl.getTimeZonList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<TimeZoneServiceOuterClass.TimeZoneListResp>) responseObserver);
          break;
        case METHODID_SET_TIME_ZONE:
          serviceImpl.setTimeZone((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<UserServiceOuterClass.User>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TimeZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimeZoneServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TimeZoneServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TimeZoneService");
    }
  }

  private static final class TimeZoneServiceFileDescriptorSupplier
      extends TimeZoneServiceBaseDescriptorSupplier {
    TimeZoneServiceFileDescriptorSupplier() {}
  }

  private static final class TimeZoneServiceMethodDescriptorSupplier
      extends TimeZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TimeZoneServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TimeZoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimeZoneServiceFileDescriptorSupplier())
              .addMethod(getGetTimeZonListMethod())
              .addMethod(getSetTimeZoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
