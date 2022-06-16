package com.example.grpcserver.config;

import com.example.grpcserver.interceptor.GrpcConnectionInterceptor;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import net.devh.boot.grpc.server.serverfactory.GrpcServerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanglin
 * @date 2021/5/8 15:19
 */
@Configuration
public class ServerConfig {

    @Bean
    public GrpcServerConfigurer customTimeout() {
        return serverBuilder -> {
            if (serverBuilder instanceof NettyServerBuilder) {
                ((NettyServerBuilder) serverBuilder)
//                        .maxConnectionIdle(10L, TimeUnit.SECONDS)
//                        .maxConnectionAge(5L, TimeUnit.SECONDS)
                        .addTransportFilter(new GrpcConnectionInterceptor()).maxInboundMessageSize(1024*1024*100);
            }
        };
    }
}
