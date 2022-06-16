package com.example.grpcserver.interceptor;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

/**
 * @author yanglin
 * @date 2021/4/9 11:10
 */
@GrpcGlobalServerInterceptor
@Slf4j
public class GrpcInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        log.info("header:{}",headers);
        return next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void sendMessage(RespT message) {
                log.info("sendMessage:{}",message);
                super.sendMessage(message);
            }

            @Override
            public void sendHeaders(Metadata headers) {
                log.info("sendHeaders,start:{}",System.currentTimeMillis());
                Metadata.Key<String> test = Metadata.Key.of("test", Metadata.ASCII_STRING_MARSHALLER);
                headers.put(test,"123456");
                super.sendHeaders(headers);
            }
        },headers);
    }
}
