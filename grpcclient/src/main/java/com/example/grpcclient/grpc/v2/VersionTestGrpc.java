package com.example.grpcclient.grpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *import "Version.proto";
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: v2/Version.proto")
public final class VersionTestGrpc {

  private VersionTestGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpcclient.grpc.v2.VersionTest";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Version.Request,
      Version.Response> getVersionServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "versionService",
      requestType = Version.Request.class,
      responseType = Version.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Version.Request,
      Version.Response> getVersionServiceMethod() {
    io.grpc.MethodDescriptor<Version.Request, Version.Response> getVersionServiceMethod;
    if ((getVersionServiceMethod = VersionTestGrpc.getVersionServiceMethod) == null) {
      synchronized (VersionTestGrpc.class) {
        if ((getVersionServiceMethod = VersionTestGrpc.getVersionServiceMethod) == null) {
          VersionTestGrpc.getVersionServiceMethod = getVersionServiceMethod =
              io.grpc.MethodDescriptor.<Version.Request, Version.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "versionService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Version.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Version.Response.getDefaultInstance()))
              .setSchemaDescriptor(new VersionTestMethodDescriptorSupplier("versionService"))
              .build();
        }
      }
    }
    return getVersionServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionTestStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionTestStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionTestStub>() {
        @Override
        public VersionTestStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionTestStub(channel, callOptions);
        }
      };
    return VersionTestStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionTestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionTestBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionTestBlockingStub>() {
        @Override
        public VersionTestBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionTestBlockingStub(channel, callOptions);
        }
      };
    return VersionTestBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionTestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionTestFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionTestFutureStub>() {
        @Override
        public VersionTestFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionTestFutureStub(channel, callOptions);
        }
      };
    return VersionTestFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *import "Version.proto";
   * </pre>
   */
  public static abstract class VersionTestImplBase implements io.grpc.BindableService {

    /**
     */
    public void versionService(Version.Request request,
                               io.grpc.stub.StreamObserver<Version.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVersionServiceMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVersionServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Version.Request,
                Version.Response>(
                  this, METHODID_VERSION_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   *import "Version.proto";
   * </pre>
   */
  public static final class VersionTestStub extends io.grpc.stub.AbstractAsyncStub<VersionTestStub> {
    private VersionTestStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VersionTestStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionTestStub(channel, callOptions);
    }

    /**
     */
    public void versionService(Version.Request request,
                               io.grpc.stub.StreamObserver<Version.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVersionServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *import "Version.proto";
   * </pre>
   */
  public static final class VersionTestBlockingStub extends io.grpc.stub.AbstractBlockingStub<VersionTestBlockingStub> {
    private VersionTestBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VersionTestBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionTestBlockingStub(channel, callOptions);
    }

    /**
     */
    public Version.Response versionService(Version.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVersionServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *import "Version.proto";
   * </pre>
   */
  public static final class VersionTestFutureStub extends io.grpc.stub.AbstractFutureStub<VersionTestFutureStub> {
    private VersionTestFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VersionTestFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionTestFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Version.Response> versionService(
        Version.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVersionServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERSION_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionTestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VersionTestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VERSION_SERVICE:
          serviceImpl.versionService((Version.Request) request,
              (io.grpc.stub.StreamObserver<Version.Response>) responseObserver);
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

  private static abstract class VersionTestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionTestBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Version.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VersionTest");
    }
  }

  private static final class VersionTestFileDescriptorSupplier
      extends VersionTestBaseDescriptorSupplier {
    VersionTestFileDescriptorSupplier() {}
  }

  private static final class VersionTestMethodDescriptorSupplier
      extends VersionTestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VersionTestMethodDescriptorSupplier(String methodName) {
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
      synchronized (VersionTestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionTestFileDescriptorSupplier())
              .addMethod(getVersionServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
