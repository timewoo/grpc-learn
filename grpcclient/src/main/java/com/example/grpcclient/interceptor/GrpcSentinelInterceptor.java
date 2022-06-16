package com.example.grpcclient.interceptor;

import com.alibaba.csp.sentinel.adapter.grpc.SentinelGrpcClientInterceptor;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;

/**
 * @author yanglin
 * @date 2021/5/24 17:28
 */
//@GrpcGlobalClientInterceptor
public class GrpcSentinelInterceptor extends SentinelGrpcClientInterceptor {
    public GrpcSentinelInterceptor() {
        super();
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return super.interceptCall(methodDescriptor, callOptions, channel);
    }
}
