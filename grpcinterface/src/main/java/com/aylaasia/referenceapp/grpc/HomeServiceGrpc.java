package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: HomeService.proto")
public final class HomeServiceGrpc {

  private HomeServiceGrpc() {}

  public static final String SERVICE_NAME = "HomeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> getGetHomeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHomeList",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> getGetHomeListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> getGetHomeListMethod;
    if ((getGetHomeListMethod = HomeServiceGrpc.getGetHomeListMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getGetHomeListMethod = HomeServiceGrpc.getGetHomeListMethod) == null) {
          HomeServiceGrpc.getGetHomeListMethod = getGetHomeListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHomeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("getHomeList"))
              .build();
        }
      }
    }
    return getGetHomeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getGetHomeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHomeInfo",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getGetHomeInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getGetHomeInfoMethod;
    if ((getGetHomeInfoMethod = HomeServiceGrpc.getGetHomeInfoMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getGetHomeInfoMethod = HomeServiceGrpc.getGetHomeInfoMethod) == null) {
          HomeServiceGrpc.getGetHomeInfoMethod = getGetHomeInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHomeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("getHomeInfo"))
              .build();
        }
      }
    }
    return getGetHomeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getUpdateHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateHome",
      requestType = com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.class,
      responseType = com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home,
      com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getUpdateHomeMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getUpdateHomeMethod;
    if ((getUpdateHomeMethod = HomeServiceGrpc.getUpdateHomeMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getUpdateHomeMethod = HomeServiceGrpc.getUpdateHomeMethod) == null) {
          HomeServiceGrpc.getUpdateHomeMethod = getUpdateHomeMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home, com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("updateHome"))
              .build();
        }
      }
    }
    return getUpdateHomeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceStub>() {
        @java.lang.Override
        public HomeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceStub(channel, callOptions);
        }
      };
    return HomeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceBlockingStub>() {
        @java.lang.Override
        public HomeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceBlockingStub(channel, callOptions);
        }
      };
    return HomeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceFutureStub>() {
        @java.lang.Override
        public HomeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceFutureStub(channel, callOptions);
        }
      };
    return HomeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HomeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *家庭列表
     * </pre>
     */
    public void getHomeList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHomeListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *家庭详情，homeId
     * </pre>
     */
    public void getHomeInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHomeInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑家庭
     * </pre>
     */
    public void updateHome(com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHomeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHomeListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp>(
                  this, METHODID_GET_HOME_LIST)))
          .addMethod(
            getGetHomeInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>(
                  this, METHODID_GET_HOME_INFO)))
          .addMethod(
            getUpdateHomeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home,
                com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>(
                  this, METHODID_UPDATE_HOME)))
          .build();
    }
  }

  /**
   */
  public static final class HomeServiceStub extends io.grpc.stub.AbstractAsyncStub<HomeServiceStub> {
    private HomeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *家庭列表
     * </pre>
     */
    public void getHomeList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHomeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *家庭详情，homeId
     * </pre>
     */
    public void getHomeInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHomeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑家庭
     * </pre>
     */
    public void updateHome(com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHomeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HomeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HomeServiceBlockingStub> {
    private HomeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *家庭列表
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp getHomeList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHomeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *家庭详情，homeId
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home getHomeInfo(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHomeInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑家庭
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home updateHome(com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHomeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HomeServiceFutureStub> {
    private HomeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *家庭列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp> getHomeList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHomeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *家庭详情，homeId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> getHomeInfo(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHomeInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑家庭
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home> updateHome(
        com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHomeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOME_LIST = 0;
  private static final int METHODID_GET_HOME_INFO = 1;
  private static final int METHODID_UPDATE_HOME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOME_LIST:
          serviceImpl.getHomeList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.HomeListResp>) responseObserver);
          break;
        case METHODID_GET_HOME_INFO:
          serviceImpl.getHomeInfo((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>) responseObserver);
          break;
        case METHODID_UPDATE_HOME:
          serviceImpl.updateHome((com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.Home>) responseObserver);
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

  private static abstract class HomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HomeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.HomeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HomeService");
    }
  }

  private static final class HomeServiceFileDescriptorSupplier
      extends HomeServiceBaseDescriptorSupplier {
    HomeServiceFileDescriptorSupplier() {}
  }

  private static final class HomeServiceMethodDescriptorSupplier
      extends HomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HomeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HomeServiceFileDescriptorSupplier())
              .addMethod(getGetHomeListMethod())
              .addMethod(getGetHomeInfoMethod())
              .addMethod(getUpdateHomeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
