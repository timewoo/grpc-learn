package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AppService.proto")
public final class AppServiceGrpc {

  private AppServiceGrpc() {}

  public static final String SERVICE_NAME = "AppService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq,
      com.google.protobuf.StringValue> getUploadAppOrImgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadAppOrImg",
      requestType = com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq,
      com.google.protobuf.StringValue> getUploadAppOrImgMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq, com.google.protobuf.StringValue> getUploadAppOrImgMethod;
    if ((getUploadAppOrImgMethod = AppServiceGrpc.getUploadAppOrImgMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUploadAppOrImgMethod = AppServiceGrpc.getUploadAppOrImgMethod) == null) {
          AppServiceGrpc.getUploadAppOrImgMethod = getUploadAppOrImgMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadAppOrImg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("uploadAppOrImg"))
              .build();
        }
      }
    }
    return getUploadAppOrImgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq,
      com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> getGetAppInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAppInfo",
      requestType = com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq.class,
      responseType = com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq,
      com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> getGetAppInfoMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq, com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> getGetAppInfoMethod;
    if ((getGetAppInfoMethod = AppServiceGrpc.getGetAppInfoMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetAppInfoMethod = AppServiceGrpc.getGetAppInfoMethod) == null) {
          AppServiceGrpc.getGetAppInfoMethod = getGetAppInfoMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq, com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAppInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("getAppInfo"))
              .build();
        }
      }
    }
    return getGetAppInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceStub>() {
        @java.lang.Override
        public AppServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceStub(channel, callOptions);
        }
      };
    return AppServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceBlockingStub>() {
        @java.lang.Override
        public AppServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceBlockingStub(channel, callOptions);
        }
      };
    return AppServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceFutureStub>() {
        @java.lang.Override
        public AppServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceFutureStub(channel, callOptions);
        }
      };
    return AppServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *上传app包或者图片
     * </pre>
     */
    public void uploadAppOrImg(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadAppOrImgMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取app最新版本
     * </pre>
     */
    public void getAppInfo(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadAppOrImgMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq,
                com.google.protobuf.StringValue>(
                  this, METHODID_UPLOAD_APP_OR_IMG)))
          .addMethod(
            getGetAppInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq,
                com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo>(
                  this, METHODID_GET_APP_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class AppServiceStub extends io.grpc.stub.AbstractAsyncStub<AppServiceStub> {
    private AppServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *上传app包或者图片
     * </pre>
     */
    public void uploadAppOrImg(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadAppOrImgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取app最新版本
     * </pre>
     */
    public void getAppInfo(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppServiceBlockingStub> {
    private AppServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *上传app包或者图片
     * </pre>
     */
    public com.google.protobuf.StringValue uploadAppOrImg(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadAppOrImgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取app最新版本
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo getAppInfo(com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppServiceFutureStub> {
    private AppServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *上传app包或者图片
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> uploadAppOrImg(
        com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadAppOrImgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取app最新版本
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo> getAppInfo(
        com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_APP_OR_IMG = 0;
  private static final int METHODID_GET_APP_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_APP_OR_IMG:
          serviceImpl.uploadAppOrImg((com.aylaasia.referenceapp.grpc.AppServiceOuterClass.UploadAppOrImgReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_GET_APP_INFO:
          serviceImpl.getAppInfo((com.aylaasia.referenceapp.grpc.AppServiceOuterClass.GetAppInfoReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AppServiceOuterClass.AppInfo>) responseObserver);
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

  private static abstract class AppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.AppServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppService");
    }
  }

  private static final class AppServiceFileDescriptorSupplier
      extends AppServiceBaseDescriptorSupplier {
    AppServiceFileDescriptorSupplier() {}
  }

  private static final class AppServiceMethodDescriptorSupplier
      extends AppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppServiceFileDescriptorSupplier())
              .addMethod(getUploadAppOrImgMethod())
              .addMethod(getGetAppInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
