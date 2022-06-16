package com.example.grpcserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: Test.proto")
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayTest",
      requestType = Test.Request.class,
      responseType = Test.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestMethod() {
    io.grpc.MethodDescriptor<Test.Request, Test.Response> getSayTestMethod;
    if ((getSayTestMethod = TestServiceGrpc.getSayTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSayTestMethod = TestServiceGrpc.getSayTestMethod) == null) {
          TestServiceGrpc.getSayTestMethod = getSayTestMethod =
              io.grpc.MethodDescriptor.<Test.Request, Test.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("sayTest"))
              .build();
        }
      }
    }
    return getSayTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestResStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayTestResStream",
      requestType = Test.Request.class,
      responseType = Test.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestResStreamMethod() {
    io.grpc.MethodDescriptor<Test.Request, Test.Response> getSayTestResStreamMethod;
    if ((getSayTestResStreamMethod = TestServiceGrpc.getSayTestResStreamMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSayTestResStreamMethod = TestServiceGrpc.getSayTestResStreamMethod) == null) {
          TestServiceGrpc.getSayTestResStreamMethod = getSayTestResStreamMethod =
              io.grpc.MethodDescriptor.<Test.Request, Test.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayTestResStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("sayTestResStream"))
              .build();
        }
      }
    }
    return getSayTestResStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestReqStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayTestReqStream",
      requestType = Test.Request.class,
      responseType = Test.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestReqStreamMethod() {
    io.grpc.MethodDescriptor<Test.Request, Test.Response> getSayTestReqStreamMethod;
    if ((getSayTestReqStreamMethod = TestServiceGrpc.getSayTestReqStreamMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSayTestReqStreamMethod = TestServiceGrpc.getSayTestReqStreamMethod) == null) {
          TestServiceGrpc.getSayTestReqStreamMethod = getSayTestReqStreamMethod =
              io.grpc.MethodDescriptor.<Test.Request, Test.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayTestReqStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("sayTestReqStream"))
              .build();
        }
      }
    }
    return getSayTestReqStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestAllStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayTestAllStream",
      requestType = Test.Request.class,
      responseType = Test.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Test.Request,
      Test.Response> getSayTestAllStreamMethod() {
    io.grpc.MethodDescriptor<Test.Request, Test.Response> getSayTestAllStreamMethod;
    if ((getSayTestAllStreamMethod = TestServiceGrpc.getSayTestAllStreamMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSayTestAllStreamMethod = TestServiceGrpc.getSayTestAllStreamMethod) == null) {
          TestServiceGrpc.getSayTestAllStreamMethod = getSayTestAllStreamMethod =
              io.grpc.MethodDescriptor.<Test.Request, Test.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayTestAllStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Test.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("sayTestAllStream"))
              .build();
        }
      }
    }
    return getSayTestAllStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceStub>() {
        @Override
        public TestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceStub(channel, callOptions);
        }
      };
    return TestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub>() {
        @Override
        public TestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceBlockingStub(channel, callOptions);
        }
      };
    return TestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub>() {
        @Override
        public TestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceFutureStub(channel, callOptions);
        }
      };
    return TestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayTest(Test.Request request,
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayTestMethod(), responseObserver);
    }

    /**
     */
    public void sayTestResStream(Test.Request request,
        io.grpc.stub.StreamObserver<Test.Response> responseObserver){
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayTestResStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Test.Request> sayTestReqStream(
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayTestReqStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Test.Request> sayTestAllStream(
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayTestAllStreamMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayTestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Test.Request,
                Test.Response>(
                  this, METHODID_SAY_TEST)))
          .addMethod(
            getSayTestResStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Test.Request,
                Test.Response>(
                  this, METHODID_SAY_TEST_RES_STREAM)))
          .addMethod(
            getSayTestReqStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                Test.Request,
                Test.Response>(
                  this, METHODID_SAY_TEST_REQ_STREAM)))
          .addMethod(
            getSayTestAllStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                Test.Request,
                Test.Response>(
                  this, METHODID_SAY_TEST_ALL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractAsyncStub<TestServiceStub> {
    private TestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayTest(Test.Request request,
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayTestResStream(Test.Request request,
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayTestResStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Test.Request> sayTestReqStream(
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayTestReqStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Test.Request> sayTestAllStream(
        io.grpc.stub.StreamObserver<Test.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayTestAllStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Test.Response sayTest(Test.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayTestMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Test.Response> sayTestResStream(
        Test.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayTestResStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestServiceFutureStub> {
    private TestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Test.Response> sayTest(
        Test.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_TEST = 0;
  private static final int METHODID_SAY_TEST_RES_STREAM = 1;
  private static final int METHODID_SAY_TEST_REQ_STREAM = 2;
  private static final int METHODID_SAY_TEST_ALL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_TEST:
          serviceImpl.sayTest((Test.Request) request,
              (io.grpc.stub.StreamObserver<Test.Response>) responseObserver);
          break;
        case METHODID_SAY_TEST_RES_STREAM:
          serviceImpl.sayTestResStream((Test.Request) request,
              (io.grpc.stub.StreamObserver<Test.Response>) responseObserver);
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
        case METHODID_SAY_TEST_REQ_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayTestReqStream(
              (io.grpc.stub.StreamObserver<Test.Response>) responseObserver);
        case METHODID_SAY_TEST_ALL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayTestAllStream(
              (io.grpc.stub.StreamObserver<Test.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Test.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getSayTestMethod())
              .addMethod(getSayTestResStreamMethod())
              .addMethod(getSayTestReqStreamMethod())
              .addMethod(getSayTestAllStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
