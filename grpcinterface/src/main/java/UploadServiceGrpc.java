import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: UploadService.proto")
public final class UploadServiceGrpc {

  private UploadServiceGrpc() {}

  public static final String SERVICE_NAME = "UploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq,
      com.google.protobuf.BoolValue> getUploadStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadStream",
      requestType = UploadServiceOuterClass.UploadReq.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq,
      com.google.protobuf.BoolValue> getUploadStreamMethod() {
    io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq, com.google.protobuf.BoolValue> getUploadStreamMethod;
    if ((getUploadStreamMethod = UploadServiceGrpc.getUploadStreamMethod) == null) {
      synchronized (UploadServiceGrpc.class) {
        if ((getUploadStreamMethod = UploadServiceGrpc.getUploadStreamMethod) == null) {
          UploadServiceGrpc.getUploadStreamMethod = getUploadStreamMethod =
              io.grpc.MethodDescriptor.<UploadServiceOuterClass.UploadReq, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UploadServiceOuterClass.UploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new UploadServiceMethodDescriptorSupplier("uploadStream"))
              .build();
        }
      }
    }
    return getUploadStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq,
      com.google.protobuf.BoolValue> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = UploadServiceOuterClass.UploadReq.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq,
      com.google.protobuf.BoolValue> getUploadMethod() {
    io.grpc.MethodDescriptor<UploadServiceOuterClass.UploadReq, com.google.protobuf.BoolValue> getUploadMethod;
    if ((getUploadMethod = UploadServiceGrpc.getUploadMethod) == null) {
      synchronized (UploadServiceGrpc.class) {
        if ((getUploadMethod = UploadServiceGrpc.getUploadMethod) == null) {
          UploadServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<UploadServiceOuterClass.UploadReq, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UploadServiceOuterClass.UploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new UploadServiceMethodDescriptorSupplier("upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceStub>() {
        @java.lang.Override
        public UploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceStub(channel, callOptions);
        }
      };
    return UploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceBlockingStub>() {
        @java.lang.Override
        public UploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceBlockingStub(channel, callOptions);
        }
      };
    return UploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceFutureStub>() {
        @java.lang.Override
        public UploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceFutureStub(channel, callOptions);
        }
      };
    return UploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UploadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<UploadServiceOuterClass.UploadReq> uploadStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadStreamMethod(), responseObserver);
    }

    /**
     */
    public void upload(UploadServiceOuterClass.UploadReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                UploadServiceOuterClass.UploadReq,
                com.google.protobuf.BoolValue>(
                  this, METHODID_UPLOAD_STREAM)))
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UploadServiceOuterClass.UploadReq,
                com.google.protobuf.BoolValue>(
                  this, METHODID_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class UploadServiceStub extends io.grpc.stub.AbstractAsyncStub<UploadServiceStub> {
    private UploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<UploadServiceOuterClass.UploadReq> uploadStream(
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void upload(UploadServiceOuterClass.UploadReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UploadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UploadServiceBlockingStub> {
    private UploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.BoolValue upload(UploadServiceOuterClass.UploadReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UploadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UploadServiceFutureStub> {
    private UploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> upload(
        UploadServiceOuterClass.UploadReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_UPLOAD_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((UploadServiceOuterClass.UploadReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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
        case METHODID_UPLOAD_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadStream(
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UploadServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploadService");
    }
  }

  private static final class UploadServiceFileDescriptorSupplier
      extends UploadServiceBaseDescriptorSupplier {
    UploadServiceFileDescriptorSupplier() {}
  }

  private static final class UploadServiceMethodDescriptorSupplier
      extends UploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploadServiceFileDescriptorSupplier())
              .addMethod(getUploadStreamMethod())
              .addMethod(getUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
