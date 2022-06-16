package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: ScheduleTaskService.proto")
public final class ScheduleTaskServiceGrpc {

  private ScheduleTaskServiceGrpc() {}

  public static final String SERVICE_NAME = "ScheduleTaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
      com.google.protobuf.StringValue> getCreateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createJob",
      requestType = com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
      com.google.protobuf.StringValue> getCreateJobMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job, com.google.protobuf.StringValue> getCreateJobMethod;
    if ((getCreateJobMethod = ScheduleTaskServiceGrpc.getCreateJobMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getCreateJobMethod = ScheduleTaskServiceGrpc.getCreateJobMethod) == null) {
          ScheduleTaskServiceGrpc.getCreateJobMethod = getCreateJobMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("createJob"))
              .build();
        }
      }
    }
    return getCreateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
      Base.Result> getUpdateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateJob",
      requestType = com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
      Base.Result> getUpdateJobMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job, Base.Result> getUpdateJobMethod;
    if ((getUpdateJobMethod = ScheduleTaskServiceGrpc.getUpdateJobMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getUpdateJobMethod = ScheduleTaskServiceGrpc.getUpdateJobMethod) == null) {
          ScheduleTaskServiceGrpc.getUpdateJobMethod = getUpdateJobMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("updateJob"))
              .build();
        }
      }
    }
    return getUpdateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getRemoveJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeJob",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getRemoveJobMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getRemoveJobMethod;
    if ((getRemoveJobMethod = ScheduleTaskServiceGrpc.getRemoveJobMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getRemoveJobMethod = ScheduleTaskServiceGrpc.getRemoveJobMethod) == null) {
          ScheduleTaskServiceGrpc.getRemoveJobMethod = getRemoveJobMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("removeJob"))
              .build();
        }
      }
    }
    return getRemoveJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getStartJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startJob",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getStartJobMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getStartJobMethod;
    if ((getStartJobMethod = ScheduleTaskServiceGrpc.getStartJobMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getStartJobMethod = ScheduleTaskServiceGrpc.getStartJobMethod) == null) {
          ScheduleTaskServiceGrpc.getStartJobMethod = getStartJobMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "startJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("startJob"))
              .build();
        }
      }
    }
    return getStartJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getStopJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stopJob",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getStopJobMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getStopJobMethod;
    if ((getStopJobMethod = ScheduleTaskServiceGrpc.getStopJobMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getStopJobMethod = ScheduleTaskServiceGrpc.getStopJobMethod) == null) {
          ScheduleTaskServiceGrpc.getStopJobMethod = getStopJobMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "stopJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("stopJob"))
              .build();
        }
      }
    }
    return getStopJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> getGetJobListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJobList",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> getGetJobListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> getGetJobListMethod;
    if ((getGetJobListMethod = ScheduleTaskServiceGrpc.getGetJobListMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getGetJobListMethod = ScheduleTaskServiceGrpc.getGetJobListMethod) == null) {
          ScheduleTaskServiceGrpc.getGetJobListMethod = getGetJobListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getJobList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("getJobList"))
              .build();
        }
      }
    }
    return getGetJobListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> getGetJobInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJobInfo",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> getGetJobInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> getGetJobInfoMethod;
    if ((getGetJobInfoMethod = ScheduleTaskServiceGrpc.getGetJobInfoMethod) == null) {
      synchronized (ScheduleTaskServiceGrpc.class) {
        if ((getGetJobInfoMethod = ScheduleTaskServiceGrpc.getGetJobInfoMethod) == null) {
          ScheduleTaskServiceGrpc.getGetJobInfoMethod = getGetJobInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getJobInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job.getDefaultInstance()))
              .setSchemaDescriptor(new ScheduleTaskServiceMethodDescriptorSupplier("getJobInfo"))
              .build();
        }
      }
    }
    return getGetJobInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScheduleTaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceStub>() {
        @java.lang.Override
        public ScheduleTaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduleTaskServiceStub(channel, callOptions);
        }
      };
    return ScheduleTaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScheduleTaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceBlockingStub>() {
        @java.lang.Override
        public ScheduleTaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduleTaskServiceBlockingStub(channel, callOptions);
        }
      };
    return ScheduleTaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScheduleTaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScheduleTaskServiceFutureStub>() {
        @java.lang.Override
        public ScheduleTaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScheduleTaskServiceFutureStub(channel, callOptions);
        }
      };
    return ScheduleTaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ScheduleTaskServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *创建任务，taskId
     * </pre>
     */
    public void createJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑任务
     * </pre>
     */
    public void updateJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *移除任务，taskId
     * </pre>
     */
    public void removeJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveJobMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *开启任务，taskId
     * </pre>
     */
    public void startJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartJobMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *停止任务，taskId
     * </pre>
     */
    public void stopJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopJobMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *任务列表
     * </pre>
     */
    public void getJobList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *任务详情
     * </pre>
     */
    public void getJobInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
                com.google.protobuf.StringValue>(
                  this, METHODID_CREATE_JOB)))
          .addMethod(
            getUpdateJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job,
                Base.Result>(
                  this, METHODID_UPDATE_JOB)))
          .addMethod(
            getRemoveJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_REMOVE_JOB)))
          .addMethod(
            getStartJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_START_JOB)))
          .addMethod(
            getStopJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_STOP_JOB)))
          .addMethod(
            getGetJobListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp>(
                  this, METHODID_GET_JOB_LIST)))
          .addMethod(
            getGetJobInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job>(
                  this, METHODID_GET_JOB_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class ScheduleTaskServiceStub extends io.grpc.stub.AbstractAsyncStub<ScheduleTaskServiceStub> {
    private ScheduleTaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleTaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduleTaskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建任务，taskId
     * </pre>
     */
    public void createJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑任务
     * </pre>
     */
    public void updateJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *移除任务，taskId
     * </pre>
     */
    public void removeJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *开启任务，taskId
     * </pre>
     */
    public void startJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *停止任务，taskId
     * </pre>
     */
    public void stopJob(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *任务列表
     * </pre>
     */
    public void getJobList(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *任务详情
     * </pre>
     */
    public void getJobInfo(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScheduleTaskServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScheduleTaskServiceBlockingStub> {
    private ScheduleTaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleTaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduleTaskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建任务，taskId
     * </pre>
     */
    public com.google.protobuf.StringValue createJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑任务
     * </pre>
     */
    public Base.Result updateJob(com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *移除任务，taskId
     * </pre>
     */
    public Base.Result removeJob(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *开启任务，taskId
     * </pre>
     */
    public Base.Result startJob(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *停止任务，taskId
     * </pre>
     */
    public Base.Result stopJob(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *任务列表
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp getJobList(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *任务详情
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job getJobInfo(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScheduleTaskServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScheduleTaskServiceFutureStub> {
    private ScheduleTaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleTaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScheduleTaskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *创建任务，taskId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> createJob(
        com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑任务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> updateJob(
        com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *移除任务，taskId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> removeJob(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *开启任务，taskId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> startJob(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *停止任务，taskId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> stopJob(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *任务列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp> getJobList(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *任务详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job> getJobInfo(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_JOB = 0;
  private static final int METHODID_UPDATE_JOB = 1;
  private static final int METHODID_REMOVE_JOB = 2;
  private static final int METHODID_START_JOB = 3;
  private static final int METHODID_STOP_JOB = 4;
  private static final int METHODID_GET_JOB_LIST = 5;
  private static final int METHODID_GET_JOB_INFO = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScheduleTaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScheduleTaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_JOB:
          serviceImpl.createJob((com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_UPDATE_JOB:
          serviceImpl.updateJob((com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_REMOVE_JOB:
          serviceImpl.removeJob((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_START_JOB:
          serviceImpl.startJob((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_STOP_JOB:
          serviceImpl.stopJob((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_JOB_LIST:
          serviceImpl.getJobList((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.GetJobListResp>) responseObserver);
          break;
        case METHODID_GET_JOB_INFO:
          serviceImpl.getJobInfo((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.Job>) responseObserver);
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

  private static abstract class ScheduleTaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScheduleTaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.ScheduleTaskServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScheduleTaskService");
    }
  }

  private static final class ScheduleTaskServiceFileDescriptorSupplier
      extends ScheduleTaskServiceBaseDescriptorSupplier {
    ScheduleTaskServiceFileDescriptorSupplier() {}
  }

  private static final class ScheduleTaskServiceMethodDescriptorSupplier
      extends ScheduleTaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScheduleTaskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScheduleTaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScheduleTaskServiceFileDescriptorSupplier())
              .addMethod(getCreateJobMethod())
              .addMethod(getUpdateJobMethod())
              .addMethod(getRemoveJobMethod())
              .addMethod(getStartJobMethod())
              .addMethod(getStopJobMethod())
              .addMethod(getGetJobListMethod())
              .addMethod(getGetJobInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
