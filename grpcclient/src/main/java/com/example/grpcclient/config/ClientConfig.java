package com.example.grpcclient.config;

import com.alibaba.csp.sentinel.adapter.grpc.SentinelGrpcClientInterceptor;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import net.devh.boot.grpc.client.channelfactory.GrpcChannelConfigurer;
import net.devh.boot.grpc.client.channelfactory.GrpcChannelFactory;
import net.devh.boot.grpc.client.config.GrpcChannelProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author yanglin
 * @date 2021/5/10 10:21
 */
@Configuration
public class ClientConfig {

    @Bean
    public GrpcChannelConfigurer customTimeout() {
        return (managedChannelBuilder, s) -> {
           if (managedChannelBuilder instanceof NettyChannelBuilder){
               ((NettyChannelBuilder)managedChannelBuilder)
//                       .intercept(new SentinelGrpcClientInterceptor());
//                       .defaultLoadBalancingPolicy("pick_first")
//                       .keepAliveTime(2,TimeUnit.SECONDS).keepAliveWithoutCalls(true);
                       .idleTimeout(2,TimeUnit.SECONDS);
           }
        };
    }
}
