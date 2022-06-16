import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *用户相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: UserService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserServiceOuterClass.User> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = UserServiceOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserServiceOuterClass.User> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, UserServiceOuterClass.User> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
          UserServiceGrpc.getGetUserInfoMethod = getGetUserInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, UserServiceOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserInfo"))
              .build();
        }
      }
    }
    return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Base.Result> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Base.Result> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, Base.Result> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = UserServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteAccountMethod = UserServiceGrpc.getDeleteAccountMethod) == null) {
          UserServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("deleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AuthServiceOuterClass.VerificationCodeReq,
      Base.Result> getSendVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendVerificationCode",
      requestType = AuthServiceOuterClass.VerificationCodeReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AuthServiceOuterClass.VerificationCodeReq,
      Base.Result> getSendVerificationCodeMethod() {
    io.grpc.MethodDescriptor<AuthServiceOuterClass.VerificationCodeReq, Base.Result> getSendVerificationCodeMethod;
    if ((getSendVerificationCodeMethod = UserServiceGrpc.getSendVerificationCodeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSendVerificationCodeMethod = UserServiceGrpc.getSendVerificationCodeMethod) == null) {
          UserServiceGrpc.getSendVerificationCodeMethod = getSendVerificationCodeMethod =
              io.grpc.MethodDescriptor.<AuthServiceOuterClass.VerificationCodeReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendVerificationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AuthServiceOuterClass.VerificationCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("sendVerificationCode"))
              .build();
        }
      }
    }
    return getSendVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq,
      Base.Result> getCheckVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkVerificationCode",
      requestType = UserServiceOuterClass.CheckVerificationCodeReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq,
      Base.Result> getCheckVerificationCodeMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq, Base.Result> getCheckVerificationCodeMethod;
    if ((getCheckVerificationCodeMethod = UserServiceGrpc.getCheckVerificationCodeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCheckVerificationCodeMethod = UserServiceGrpc.getCheckVerificationCodeMethod) == null) {
          UserServiceGrpc.getCheckVerificationCodeMethod = getCheckVerificationCodeMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.CheckVerificationCodeReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkVerificationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.CheckVerificationCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkVerificationCode"))
              .build();
        }
      }
    }
    return getCheckVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq,
      Base.Result> getUpdatePhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePhone",
      requestType = UserServiceOuterClass.CheckVerificationCodeReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq,
      Base.Result> getUpdatePhoneMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.CheckVerificationCodeReq, Base.Result> getUpdatePhoneMethod;
    if ((getUpdatePhoneMethod = UserServiceGrpc.getUpdatePhoneMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdatePhoneMethod = UserServiceGrpc.getUpdatePhoneMethod) == null) {
          UserServiceGrpc.getUpdatePhoneMethod = getUpdatePhoneMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.CheckVerificationCodeReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.CheckVerificationCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updatePhone"))
              .build();
        }
      }
    }
    return getUpdatePhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.CheckPasswordReq,
      Base.Result> getCheckPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkPassword",
      requestType = UserServiceOuterClass.CheckPasswordReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.CheckPasswordReq,
      Base.Result> getCheckPasswordMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.CheckPasswordReq, Base.Result> getCheckPasswordMethod;
    if ((getCheckPasswordMethod = UserServiceGrpc.getCheckPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCheckPasswordMethod = UserServiceGrpc.getCheckPasswordMethod) == null) {
          UserServiceGrpc.getCheckPasswordMethod = getCheckPasswordMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.CheckPasswordReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.CheckPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkPassword"))
              .build();
        }
      }
    }
    return getCheckPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.SetPasswordReq,
      Base.Result> getSetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPassword",
      requestType = UserServiceOuterClass.SetPasswordReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.SetPasswordReq,
      Base.Result> getSetPasswordMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.SetPasswordReq, Base.Result> getSetPasswordMethod;
    if ((getSetPasswordMethod = UserServiceGrpc.getSetPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetPasswordMethod = UserServiceGrpc.getSetPasswordMethod) == null) {
          UserServiceGrpc.getSetPasswordMethod = getSetPasswordMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.SetPasswordReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.SetPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setPassword"))
              .build();
        }
      }
    }
    return getSetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.RecoverPasswordReq,
      Base.Result> getRecoverPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recoverPassword",
      requestType = UserServiceOuterClass.RecoverPasswordReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.RecoverPasswordReq,
      Base.Result> getRecoverPasswordMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.RecoverPasswordReq, Base.Result> getRecoverPasswordMethod;
    if ((getRecoverPasswordMethod = UserServiceGrpc.getRecoverPasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRecoverPasswordMethod = UserServiceGrpc.getRecoverPasswordMethod) == null) {
          UserServiceGrpc.getRecoverPasswordMethod = getRecoverPasswordMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.RecoverPasswordReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recoverPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.RecoverPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("recoverPassword"))
              .build();
        }
      }
    }
    return getRecoverPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getCheckPhoneExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkPhoneExist",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getCheckPhoneExistMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getCheckPhoneExistMethod;
    if ((getCheckPhoneExistMethod = UserServiceGrpc.getCheckPhoneExistMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCheckPhoneExistMethod = UserServiceGrpc.getCheckPhoneExistMethod) == null) {
          UserServiceGrpc.getCheckPhoneExistMethod = getCheckPhoneExistMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkPhoneExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkPhoneExist"))
              .build();
        }
      }
    }
    return getCheckPhoneExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceOuterClass.User,
      UserServiceOuterClass.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = UserServiceOuterClass.User.class,
      responseType = UserServiceOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceOuterClass.User,
      UserServiceOuterClass.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<UserServiceOuterClass.User, UserServiceOuterClass.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<UserServiceOuterClass.User, UserServiceOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.StringValue> getCreateQrCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createQrCode",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.StringValue> getCreateQrCodeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.StringValue> getCreateQrCodeMethod;
    if ((getCreateQrCodeMethod = UserServiceGrpc.getCreateQrCodeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateQrCodeMethod = UserServiceGrpc.getCreateQrCodeMethod) == null) {
          UserServiceGrpc.getCreateQrCodeMethod = getCreateQrCodeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createQrCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("createQrCode"))
              .build();
        }
      }
    }
    return getCreateQrCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *用户相关接口
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *获取用户信息
     * </pre>
     */
    public void getUserInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *注销账户
     * </pre>
     */
    public void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *发送验证码
     * </pre>
     */
    public void sendVerificationCode(AuthServiceOuterClass.VerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendVerificationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *检验验证码
     * </pre>
     */
    public void checkVerificationCode(UserServiceOuterClass.CheckVerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckVerificationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑手机号
     * </pre>
     */
    public void updatePhone(UserServiceOuterClass.CheckVerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePhoneMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *校验密码
     * </pre>
     */
    public void checkPassword(UserServiceOuterClass.CheckPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设置密码
     * </pre>
     */
    public void setPassword(UserServiceOuterClass.SetPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *密码找回
     * </pre>
     */
    public void recoverPassword(UserServiceOuterClass.RecoverPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoverPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *判断手机号注册，phone
     * </pre>
     */
    public void checkPhoneExist(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPhoneExistMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑用户
     * </pre>
     */
    public void updateUser(UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *生成/刷新二维码
     * </pre>
     */
    public void createQrCode(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQrCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                UserServiceOuterClass.User>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            getDeleteAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                Base.Result>(
                  this, METHODID_DELETE_ACCOUNT)))
          .addMethod(
            getSendVerificationCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AuthServiceOuterClass.VerificationCodeReq,
                Base.Result>(
                  this, METHODID_SEND_VERIFICATION_CODE)))
          .addMethod(
            getCheckVerificationCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.CheckVerificationCodeReq,
                Base.Result>(
                  this, METHODID_CHECK_VERIFICATION_CODE)))
          .addMethod(
            getUpdatePhoneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.CheckVerificationCodeReq,
                Base.Result>(
                  this, METHODID_UPDATE_PHONE)))
          .addMethod(
            getCheckPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.CheckPasswordReq,
                Base.Result>(
                  this, METHODID_CHECK_PASSWORD)))
          .addMethod(
            getSetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.SetPasswordReq,
                Base.Result>(
                  this, METHODID_SET_PASSWORD)))
          .addMethod(
            getRecoverPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.RecoverPasswordReq,
                Base.Result>(
                  this, METHODID_RECOVER_PASSWORD)))
          .addMethod(
            getCheckPhoneExistMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_CHECK_PHONE_EXIST)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceOuterClass.User,
                UserServiceOuterClass.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getCreateQrCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.StringValue>(
                  this, METHODID_CREATE_QR_CODE)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *用户相关接口
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取用户信息
     * </pre>
     */
    public void getUserInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *注销账户
     * </pre>
     */
    public void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *发送验证码
     * </pre>
     */
    public void sendVerificationCode(AuthServiceOuterClass.VerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *检验验证码
     * </pre>
     */
    public void checkVerificationCode(UserServiceOuterClass.CheckVerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckVerificationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑手机号
     * </pre>
     */
    public void updatePhone(UserServiceOuterClass.CheckVerificationCodeReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePhoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *校验密码
     * </pre>
     */
    public void checkPassword(UserServiceOuterClass.CheckPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设置密码
     * </pre>
     */
    public void setPassword(UserServiceOuterClass.SetPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *密码找回
     * </pre>
     */
    public void recoverPassword(UserServiceOuterClass.RecoverPasswordReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoverPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *判断手机号注册，phone
     * </pre>
     */
    public void checkPhoneExist(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPhoneExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑用户
     * </pre>
     */
    public void updateUser(UserServiceOuterClass.User request,
        io.grpc.stub.StreamObserver<UserServiceOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *生成/刷新二维码
     * </pre>
     */
    public void createQrCode(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQrCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *用户相关接口
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取用户信息
     * </pre>
     */
    public UserServiceOuterClass.User getUserInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *注销账户
     * </pre>
     */
    public Base.Result deleteAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *发送验证码
     * </pre>
     */
    public Base.Result sendVerificationCode(AuthServiceOuterClass.VerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendVerificationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *检验验证码
     * </pre>
     */
    public Base.Result checkVerificationCode(UserServiceOuterClass.CheckVerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckVerificationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑手机号
     * </pre>
     */
    public Base.Result updatePhone(UserServiceOuterClass.CheckVerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePhoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *校验密码
     * </pre>
     */
    public Base.Result checkPassword(UserServiceOuterClass.CheckPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设置密码
     * </pre>
     */
    public Base.Result setPassword(UserServiceOuterClass.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *密码找回
     * </pre>
     */
    public Base.Result recoverPassword(UserServiceOuterClass.RecoverPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *判断手机号注册，phone
     * </pre>
     */
    public Base.Result checkPhoneExist(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPhoneExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑用户
     * </pre>
     */
    public UserServiceOuterClass.User updateUser(UserServiceOuterClass.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *生成/刷新二维码
     * </pre>
     */
    public com.google.protobuf.StringValue createQrCode(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQrCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *用户相关接口
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *获取用户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserServiceOuterClass.User> getUserInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *注销账户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> deleteAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *发送验证码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> sendVerificationCode(
        AuthServiceOuterClass.VerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *检验验证码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> checkVerificationCode(
        UserServiceOuterClass.CheckVerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckVerificationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑手机号
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> updatePhone(
        UserServiceOuterClass.CheckVerificationCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePhoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *校验密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> checkPassword(
        UserServiceOuterClass.CheckPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设置密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> setPassword(
        UserServiceOuterClass.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *密码找回
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> recoverPassword(
        UserServiceOuterClass.RecoverPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoverPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *判断手机号注册，phone
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> checkPhoneExist(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPhoneExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserServiceOuterClass.User> updateUser(
        UserServiceOuterClass.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *生成/刷新二维码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> createQrCode(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQrCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INFO = 0;
  private static final int METHODID_DELETE_ACCOUNT = 1;
  private static final int METHODID_SEND_VERIFICATION_CODE = 2;
  private static final int METHODID_CHECK_VERIFICATION_CODE = 3;
  private static final int METHODID_UPDATE_PHONE = 4;
  private static final int METHODID_CHECK_PASSWORD = 5;
  private static final int METHODID_SET_PASSWORD = 6;
  private static final int METHODID_RECOVER_PASSWORD = 7;
  private static final int METHODID_CHECK_PHONE_EXIST = 8;
  private static final int METHODID_UPDATE_USER = 9;
  private static final int METHODID_CREATE_QR_CODE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserServiceOuterClass.User>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_SEND_VERIFICATION_CODE:
          serviceImpl.sendVerificationCode((AuthServiceOuterClass.VerificationCodeReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_CHECK_VERIFICATION_CODE:
          serviceImpl.checkVerificationCode((UserServiceOuterClass.CheckVerificationCodeReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE:
          serviceImpl.updatePhone((UserServiceOuterClass.CheckVerificationCodeReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_CHECK_PASSWORD:
          serviceImpl.checkPassword((UserServiceOuterClass.CheckPasswordReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_SET_PASSWORD:
          serviceImpl.setPassword((UserServiceOuterClass.SetPasswordReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_RECOVER_PASSWORD:
          serviceImpl.recoverPassword((UserServiceOuterClass.RecoverPasswordReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_CHECK_PHONE_EXIST:
          serviceImpl.checkPhoneExist((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((UserServiceOuterClass.User) request,
              (io.grpc.stub.StreamObserver<UserServiceOuterClass.User>) responseObserver);
          break;
        case METHODID_CREATE_QR_CODE:
          serviceImpl.createQrCode((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getSendVerificationCodeMethod())
              .addMethod(getCheckVerificationCodeMethod())
              .addMethod(getUpdatePhoneMethod())
              .addMethod(getCheckPasswordMethod())
              .addMethod(getSetPasswordMethod())
              .addMethod(getRecoverPasswordMethod())
              .addMethod(getCheckPhoneExistMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getCreateQrCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
