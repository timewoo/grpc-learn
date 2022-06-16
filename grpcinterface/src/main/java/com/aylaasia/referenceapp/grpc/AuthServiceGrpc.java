package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *登录相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AuthService.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq,
      com.aylaasia.referenceapp.grpc.Base.Result> getSendVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendVerificationCode",
      requestType = com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq.class,
      responseType = com.aylaasia.referenceapp.grpc.Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq,
      com.aylaasia.referenceapp.grpc.Base.Result> getSendVerificationCodeMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq, com.aylaasia.referenceapp.grpc.Base.Result> getSendVerificationCodeMethod;
    if ((getSendVerificationCodeMethod = AuthServiceGrpc.getSendVerificationCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendVerificationCodeMethod = AuthServiceGrpc.getSendVerificationCodeMethod) == null) {
          AuthServiceGrpc.getSendVerificationCodeMethod = getSendVerificationCodeMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq, com.aylaasia.referenceapp.grpc.Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendVerificationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("sendVerificationCode"))
              .build();
        }
      }
    }
    return getSendVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq,
      com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq.class,
      responseType = com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq,
      com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getLoginMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq, com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getLoginMethod;
    if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
          AuthServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq, com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq,
      com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refreshToken",
      requestType = com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq.class,
      responseType = com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq,
      com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq, com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> getRefreshTokenMethod;
    if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
          AuthServiceGrpc.getRefreshTokenMethod = getRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq, com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("refreshToken"))
              .build();
        }
      }
    }
    return getRefreshTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *登录相关接口
   * </pre>
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *发送验证码
     *&#64;NoAuth
     * </pre>
     */
    public void sendVerificationCode(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendVerificationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *登录
     *&#64;NoAuth
     * </pre>
     */
    public void login(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *刷新token
     * </pre>
     */
    public void refreshToken(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendVerificationCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq,
                com.aylaasia.referenceapp.grpc.Base.Result>(
                  this, METHODID_SEND_VERIFICATION_CODE)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq,
                com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getRefreshTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq,
                com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>(
                  this, METHODID_REFRESH_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *登录相关接口
   * </pre>
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *发送验证码
     *&#64;NoAuth
     * </pre>
     */
    public void sendVerificationCode(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *登录
     *&#64;NoAuth
     * </pre>
     */
    public void login(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *刷新token
     * </pre>
     */
    public void refreshToken(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *登录相关接口
   * </pre>
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *发送验证码
     *&#64;NoAuth
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.Base.Result sendVerificationCode(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendVerificationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *登录
     *&#64;NoAuth
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token login(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *刷新token
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token refreshToken(com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *登录相关接口
   * </pre>
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *发送验证码
     *&#64;NoAuth
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.Base.Result> sendVerificationCode(
        com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *登录
     *&#64;NoAuth
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> login(
        com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *刷新token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token> refreshToken(
        com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_VERIFICATION_CODE = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_REFRESH_TOKEN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_VERIFICATION_CODE:
          serviceImpl.sendVerificationCode((com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.VerificationCodeReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.Base.Result>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.LoginReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>) responseObserver);
          break;
        case METHODID_REFRESH_TOKEN:
          serviceImpl.refreshToken((com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.RefreshTokenReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.Token>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getSendVerificationCodeMethod())
              .addMethod(getLoginMethod())
              .addMethod(getRefreshTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
