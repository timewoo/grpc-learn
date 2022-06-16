package com.example.grpcclient.interceptor;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;

import javax.annotation.Nullable;

/**
 * @author yanglin
 * @date 2021/4/9 11:10
 */
@GrpcGlobalClientInterceptor
@Slf4j
public class GrpcInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void cancel(@Nullable String message, @Nullable Throwable cause) {
                log.info("cancel");
                super.cancel(message, cause);
            }

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                log.info("start:" + System.currentTimeMillis());
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onMessage(RespT message) {
                        log.info("receive message:{}",message.toString());
                        super.onMessage(message);
                    }

                    @Override
                    public void onHeaders(Metadata headers) {
                        log.info("headers:{},time:{}", headers.toString(), System.currentTimeMillis());
                        super.onHeaders(headers);
                    }

                    @Override
                    public void onClose(Status status, Metadata trailers) {
                        log.info("close connection,status:{},trailers:{}", status.toString(), trailers.toString());
                        super.onClose(status, trailers);
                    }
                }, headers);
            }

            @Override
            public void sendMessage(ReqT message) {
                log.info("send message:{}",message);
                super.sendMessage(message);
            }
        };
    }
}
