package com.aylaasia.referenceapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *设备相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: DeviceService.proto")
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq,
      Base.Result> getBindDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bindDevice",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq,
      Base.Result> getBindDeviceMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq, Base.Result> getBindDeviceMethod;
    if ((getBindDeviceMethod = DeviceServiceGrpc.getBindDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getBindDeviceMethod = DeviceServiceGrpc.getBindDeviceMethod) == null) {
          DeviceServiceGrpc.getBindDeviceMethod = getBindDeviceMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bindDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("bindDevice"))
              .build();
        }
      }
    }
    return getBindDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> getGetDeviceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceList",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> getGetDeviceListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> getGetDeviceListMethod;
    if ((getGetDeviceListMethod = DeviceServiceGrpc.getGetDeviceListMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceListMethod = DeviceServiceGrpc.getGetDeviceListMethod) == null) {
          DeviceServiceGrpc.getGetDeviceListMethod = getGetDeviceListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceList"))
              .build();
        }
      }
    }
    return getGetDeviceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getGetDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceInfo",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getGetDeviceInfoMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getGetDeviceInfoMethod;
    if ((getGetDeviceInfoMethod = DeviceServiceGrpc.getGetDeviceInfoMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceInfoMethod = DeviceServiceGrpc.getGetDeviceInfoMethod) == null) {
          DeviceServiceGrpc.getGetDeviceInfoMethod = getGetDeviceInfoMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceInfo"))
              .build();
        }
      }
    }
    return getGetDeviceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> getUnBindDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unBindDevice",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> getUnBindDeviceMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> getUnBindDeviceMethod;
    if ((getUnBindDeviceMethod = DeviceServiceGrpc.getUnBindDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getUnBindDeviceMethod = DeviceServiceGrpc.getUnBindDeviceMethod) == null) {
          DeviceServiceGrpc.getUnBindDeviceMethod = getUnBindDeviceMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unBindDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("unBindDevice"))
              .build();
        }
      }
    }
    return getUnBindDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq,
      Base.Result> getSetDevicePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setDeviceProperty",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq,
      Base.Result> getSetDevicePropertyMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq, Base.Result> getSetDevicePropertyMethod;
    if ((getSetDevicePropertyMethod = DeviceServiceGrpc.getSetDevicePropertyMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getSetDevicePropertyMethod = DeviceServiceGrpc.getSetDevicePropertyMethod) == null) {
          DeviceServiceGrpc.getSetDevicePropertyMethod = getSetDevicePropertyMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setDeviceProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("setDeviceProperty"))
              .build();
        }
      }
    }
    return getSetDevicePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> getGetDevicePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceProperty",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> getGetDevicePropertyMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> getGetDevicePropertyMethod;
    if ((getGetDevicePropertyMethod = DeviceServiceGrpc.getGetDevicePropertyMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDevicePropertyMethod = DeviceServiceGrpc.getGetDevicePropertyMethod) == null) {
          DeviceServiceGrpc.getGetDevicePropertyMethod = getGetDevicePropertyMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceProperty"))
              .build();
        }
      }
    }
    return getGetDevicePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> getGetDevicePropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceProperties",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> getGetDevicePropertiesMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> getGetDevicePropertiesMethod;
    if ((getGetDevicePropertiesMethod = DeviceServiceGrpc.getGetDevicePropertiesMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDevicePropertiesMethod = DeviceServiceGrpc.getGetDevicePropertiesMethod) == null) {
          DeviceServiceGrpc.getGetDevicePropertiesMethod = getGetDevicePropertiesMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceProperties"))
              .build();
        }
      }
    }
    return getGetDevicePropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getUpdateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDevice",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getUpdateDeviceMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getUpdateDeviceMethod;
    if ((getUpdateDeviceMethod = DeviceServiceGrpc.getUpdateDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getUpdateDeviceMethod = DeviceServiceGrpc.getUpdateDeviceMethod) == null) {
          DeviceServiceGrpc.getUpdateDeviceMethod = getUpdateDeviceMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("updateDevice"))
              .build();
        }
      }
    }
    return getUpdateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected,
      Base.Result> getGetDeviceConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceConnected",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected,
      Base.Result> getGetDeviceConnectedMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected, Base.Result> getGetDeviceConnectedMethod;
    if ((getGetDeviceConnectedMethod = DeviceServiceGrpc.getGetDeviceConnectedMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceConnectedMethod = DeviceServiceGrpc.getGetDeviceConnectedMethod) == null) {
          DeviceServiceGrpc.getGetDeviceConnectedMethod = getGetDeviceConnectedMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceConnected"))
              .build();
        }
      }
    }
    return getGetDeviceConnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getFactoryResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "factoryReset",
      requestType = com.google.protobuf.StringValue.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      Base.Result> getFactoryResetMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, Base.Result> getFactoryResetMethod;
    if ((getFactoryResetMethod = DeviceServiceGrpc.getFactoryResetMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getFactoryResetMethod = DeviceServiceGrpc.getFactoryResetMethod) == null) {
          DeviceServiceGrpc.getFactoryResetMethod = getFactoryResetMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "factoryReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("factoryReset"))
              .build();
        }
      }
    }
    return getFactoryResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> getGetDeviceDefaultNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceDefaultName",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> getGetDeviceDefaultNameMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> getGetDeviceDefaultNameMethod;
    if ((getGetDeviceDefaultNameMethod = DeviceServiceGrpc.getGetDeviceDefaultNameMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceDefaultNameMethod = DeviceServiceGrpc.getGetDeviceDefaultNameMethod) == null) {
          DeviceServiceGrpc.getGetDeviceDefaultNameMethod = getGetDeviceDefaultNameMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDeviceDefaultName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceDefaultName"))
              .build();
        }
      }
    }
    return getGetDeviceDefaultNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq,
      Base.Result> getSortFrontPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sortFrontPage",
      requestType = com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq.class,
      responseType = Base.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq,
      Base.Result> getSortFrontPageMethod() {
    io.grpc.MethodDescriptor<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq, Base.Result> getSortFrontPageMethod;
    if ((getSortFrontPageMethod = DeviceServiceGrpc.getSortFrontPageMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getSortFrontPageMethod = DeviceServiceGrpc.getSortFrontPageMethod) == null) {
          DeviceServiceGrpc.getSortFrontPageMethod = getSortFrontPageMethod =
              io.grpc.MethodDescriptor.<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq, Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sortFrontPage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Base.Result.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("sortFrontPage"))
              .build();
        }
      }
    }
    return getSortFrontPageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub>() {
        @java.lang.Override
        public DeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceStub(channel, callOptions);
        }
      };
    return DeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub>() {
        @java.lang.Override
        public DeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return DeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub>() {
        @java.lang.Override
        public DeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceFutureStub(channel, callOptions);
        }
      };
    return DeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *设备相关接口
   * </pre>
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *绑定设备
     * </pre>
     */
    public void bindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设备列表
     * </pre>
     */
    public void getDeviceList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设备详情
     * </pre>
     */
    public void getDeviceInfo(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设备解绑
     * </pre>
     */
    public void unBindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnBindDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *设置设备属性值
     * </pre>
     */
    public void setDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDevicePropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备属性值
     * </pre>
     */
    public void getDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDevicePropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备所有属性值
     * </pre>
     */
    public void getDeviceProperties(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDevicePropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *编辑设备信息
     * </pre>
     */
    public void updateDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备联网状态
     * </pre>
     */
    public void getDeviceConnected(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceConnectedMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *恢复出厂设置
     *入参：deviceId
     * </pre>
     */
    public void factoryReset(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFactoryResetMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备默认产品名称，deviceId
     * </pre>
     */
    public void getDeviceDefaultName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceDefaultNameMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *首页排序，设备+群组
     * </pre>
     */
    public void sortFrontPage(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSortFrontPageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBindDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq,
                Base.Result>(
                  this, METHODID_BIND_DEVICE)))
          .addMethod(
            getGetDeviceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp>(
                  this, METHODID_GET_DEVICE_LIST)))
          .addMethod(
            getGetDeviceInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>(
                  this, METHODID_GET_DEVICE_INFO)))
          .addMethod(
            getUnBindDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp>(
                  this, METHODID_UN_BIND_DEVICE)))
          .addMethod(
            getSetDevicePropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq,
                Base.Result>(
                  this, METHODID_SET_DEVICE_PROPERTY)))
          .addMethod(
            getGetDevicePropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp>(
                  this, METHODID_GET_DEVICE_PROPERTY)))
          .addMethod(
            getGetDevicePropertiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp>(
                  this, METHODID_GET_DEVICE_PROPERTIES)))
          .addMethod(
            getUpdateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>(
                  this, METHODID_UPDATE_DEVICE)))
          .addMethod(
            getGetDeviceConnectedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected,
                Base.Result>(
                  this, METHODID_GET_DEVICE_CONNECTED)))
          .addMethod(
            getFactoryResetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                Base.Result>(
                  this, METHODID_FACTORY_RESET)))
          .addMethod(
            getGetDeviceDefaultNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp>(
                  this, METHODID_GET_DEVICE_DEFAULT_NAME)))
          .addMethod(
            getSortFrontPageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq,
                Base.Result>(
                  this, METHODID_SORT_FRONT_PAGE)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *设备相关接口
   * </pre>
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
    private DeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *绑定设备
     * </pre>
     */
    public void bindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设备列表
     * </pre>
     */
    public void getDeviceList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设备详情
     * </pre>
     */
    public void getDeviceInfo(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设备解绑
     * </pre>
     */
    public void unBindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnBindDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *设置设备属性值
     * </pre>
     */
    public void setDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDevicePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备属性值
     * </pre>
     */
    public void getDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDevicePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备所有属性值
     * </pre>
     */
    public void getDeviceProperties(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDevicePropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *编辑设备信息
     * </pre>
     */
    public void updateDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备联网状态
     * </pre>
     */
    public void getDeviceConnected(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceConnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *恢复出厂设置
     *入参：deviceId
     * </pre>
     */
    public void factoryReset(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFactoryResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *获取设备默认产品名称，deviceId
     * </pre>
     */
    public void getDeviceDefaultName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceDefaultNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *首页排序，设备+群组
     * </pre>
     */
    public void sortFrontPage(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq request,
        io.grpc.stub.StreamObserver<Base.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSortFrontPageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *设备相关接口
   * </pre>
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *绑定设备
     * </pre>
     */
    public Base.Result bindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设备列表
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp getDeviceList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设备详情
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device getDeviceInfo(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设备解绑
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp unBindDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnBindDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *设置设备属性值
     * </pre>
     */
    public Base.Result setDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDevicePropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取设备属性值
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp getDeviceProperty(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDevicePropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取设备所有属性值
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp getDeviceProperties(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDevicePropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *编辑设备信息
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device updateDevice(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取设备联网状态
     * </pre>
     */
    public Base.Result getDeviceConnected(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceConnectedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *恢复出厂设置
     *入参：deviceId
     * </pre>
     */
    public Base.Result factoryReset(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFactoryResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *获取设备默认产品名称，deviceId
     * </pre>
     */
    public com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp getDeviceDefaultName(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceDefaultNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *首页排序，设备+群组
     * </pre>
     */
    public Base.Result sortFrontPage(com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSortFrontPageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *设备相关接口
   * </pre>
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *绑定设备
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> bindDevice(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设备列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp> getDeviceList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设备详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> getDeviceInfo(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设备解绑
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp> unBindDevice(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnBindDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *设置设备属性值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> setDeviceProperty(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDevicePropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取设备属性值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp> getDeviceProperty(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDevicePropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取设备所有属性值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp> getDeviceProperties(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDevicePropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *编辑设备信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device> updateDevice(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取设备联网状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> getDeviceConnected(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceConnectedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *恢复出厂设置
     *入参：deviceId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> factoryReset(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFactoryResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *获取设备默认产品名称，deviceId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp> getDeviceDefaultName(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceDefaultNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *首页排序，设备+群组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Base.Result> sortFrontPage(
        com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSortFrontPageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BIND_DEVICE = 0;
  private static final int METHODID_GET_DEVICE_LIST = 1;
  private static final int METHODID_GET_DEVICE_INFO = 2;
  private static final int METHODID_UN_BIND_DEVICE = 3;
  private static final int METHODID_SET_DEVICE_PROPERTY = 4;
  private static final int METHODID_GET_DEVICE_PROPERTY = 5;
  private static final int METHODID_GET_DEVICE_PROPERTIES = 6;
  private static final int METHODID_UPDATE_DEVICE = 7;
  private static final int METHODID_GET_DEVICE_CONNECTED = 8;
  private static final int METHODID_FACTORY_RESET = 9;
  private static final int METHODID_GET_DEVICE_DEFAULT_NAME = 10;
  private static final int METHODID_SORT_FRONT_PAGE = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BIND_DEVICE:
          serviceImpl.bindDevice((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.BindDeviceReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_DEVICE_LIST:
          serviceImpl.getDeviceList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceListResp>) responseObserver);
          break;
        case METHODID_GET_DEVICE_INFO:
          serviceImpl.getDeviceInfo((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DeviceReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>) responseObserver);
          break;
        case METHODID_UN_BIND_DEVICE:
          serviceImpl.unBindDevice((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UnBindDeviceResp>) responseObserver);
          break;
        case METHODID_SET_DEVICE_PROPERTY:
          serviceImpl.setDeviceProperty((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SetDevicePropertyReq) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_DEVICE_PROPERTY:
          serviceImpl.getDeviceProperty((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertyReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.DevicePropertyResp>) responseObserver);
          break;
        case METHODID_GET_DEVICE_PROPERTIES:
          serviceImpl.getDeviceProperties((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDevicePropertiesResp>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE:
          serviceImpl.updateDevice((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.UpdateDeviceReq) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.Device>) responseObserver);
          break;
        case METHODID_GET_DEVICE_CONNECTED:
          serviceImpl.getDeviceConnected((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceConnected) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_FACTORY_RESET:
          serviceImpl.factoryReset((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<Base.Result>) responseObserver);
          break;
        case METHODID_GET_DEVICE_DEFAULT_NAME:
          serviceImpl.getDeviceDefaultName((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.GetDeviceDefaultNameResp>) responseObserver);
          break;
        case METHODID_SORT_FRONT_PAGE:
          serviceImpl.sortFrontPage((com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.SortFrontPageReq) request,
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

  private static abstract class DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aylaasia.referenceapp.grpc.DeviceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceService");
    }
  }

  private static final class DeviceServiceFileDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier {
    DeviceServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceServiceMethodDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceServiceFileDescriptorSupplier())
              .addMethod(getBindDeviceMethod())
              .addMethod(getGetDeviceListMethod())
              .addMethod(getGetDeviceInfoMethod())
              .addMethod(getUnBindDeviceMethod())
              .addMethod(getSetDevicePropertyMethod())
              .addMethod(getGetDevicePropertyMethod())
              .addMethod(getGetDevicePropertiesMethod())
              .addMethod(getUpdateDeviceMethod())
              .addMethod(getGetDeviceConnectedMethod())
              .addMethod(getFactoryResetMethod())
              .addMethod(getGetDeviceDefaultNameMethod())
              .addMethod(getSortFrontPageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
