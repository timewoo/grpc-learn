package com.example.grpcserver.interceptor;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

/**
 * @author yanglin
 * @date 2021/3/31 17:43
 */
@GrpcGlobalServerInterceptor
@Slf4j
public class GlobalGrpcExceptionHandler implements ServerInterceptor {

    private static final Metadata.Key<String> ERROR_CODE = Metadata.Key.of("errorCode", Metadata.ASCII_STRING_MARSHALLER);
    private static final Metadata.Key<String> ERROR_MSG = Metadata.Key.of("errorMsg", Metadata.ASCII_STRING_MARSHALLER);
    private static final Metadata.Key<String> ERROR_DETAIL = Metadata.Key.of("errorDetail", Metadata.ASCII_STRING_MARSHALLER);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        ServerCall.Listener<ReqT> delegate = next.startCall(call, headers);
        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(delegate) {
            @Override
            public void onMessage(ReqT message) {
                try {
                    super.onMessage(message);
                }catch (RuntimeException e){
                    log.error("server error");
                    handException(e, call, new Metadata(), headers);
                }
            }

            @Override
            public void onHalfClose() {
                try {
                    super.onHalfClose();
                } catch (RuntimeException e) {
                    log.error("server error");
                    handException(e, call, new Metadata(), headers);
                }
            }

            @Override
            public void onReady() {
                try {
                    super.onReady();
                } catch (RuntimeException e) {
                    log.error("server error");
                    handException(e, call, new Metadata(), headers);
                }
            }

            private void handException(Throwable throwable, ServerCall<ReqT, RespT> serverCall, Metadata metadata, Metadata headers) {
                log.info("RuntimeException==>{}", throwable);
                metadata.put(ERROR_CODE, Status.INTERNAL.getCode().name());
                metadata.put(ERROR_MSG, "server error");
                try {
                    serverCall.sendHeaders(headers);
                }catch (Exception e){

                }
                serverCall.sendMessage(null);
                log.info("grpc response trailers,errorCode:{},errorMsg:{},errorDetail:{}", metadata.get(ERROR_CODE), metadata.get(ERROR_MSG), metadata.get(ERROR_DETAIL));
                serverCall.close(Status.OK, metadata);
            }
        };

    }
}
