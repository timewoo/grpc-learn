package com.example.grpcinterface.client;

import com.example.grpcinterface.grpc.GreeterGrpc;
import com.example.grpcinterface.grpc.HelloReply;
import com.example.grpcinterface.grpc.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author yanglin
 * @date 2021/5/24 14:02
 */
@Slf4j
public class GrpcClient {

    public static void main(String[] args) {
        String address = "localhost";
        int port = 8081;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.next().trim();
            HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build();
            HelloReply helloReply = blockingStub.sayHello(helloRequest);
            String message = helloReply.getMessage();
            log.warn("get message:{}", message);
        }
    }
}
