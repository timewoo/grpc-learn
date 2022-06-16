package com.example.grpcserver.interceptor;

import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.ServerTransportFilter;
import io.grpc.internal.ServerStream;
import io.grpc.internal.ServerTransportListener;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

/**
 * @author yanglin
 * @date 2021/5/8 18:18
 */
@Slf4j
public class GrpcConnectionInterceptor extends ServerTransportFilter {

    public GrpcConnectionInterceptor() {
        super();
    }

    @Override
    public Attributes transportReady(Attributes attributes) {
        log.info("transportReady");
        return attributes;
    }

    @Override
    public void transportTerminated(Attributes transportAttrs) {
        log.info("transportTerminated");
        super.transportTerminated(transportAttrs);
    }
}
