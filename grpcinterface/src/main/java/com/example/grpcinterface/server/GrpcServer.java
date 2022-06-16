package com.example.grpcinterface.server;

import com.example.grpcinterface.grpc.GreeterGrpc;
import com.example.grpcinterface.grpc.HelloReply;
import com.example.grpcinterface.grpc.HelloRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author yanglin
 * @date 2021/5/24 13:57
 */
@Slf4j
public class GrpcServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        int port = 8081;
        Server server = ServerBuilder.forPort(port).addService(new GreetImpl()).build().start();
        log.info("start server");
        server.awaitTermination();
    }

    public static class GreetImpl extends GreeterGrpc.GreeterImplBase{

        @Override
        public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
            HelloReply helloReply = HelloReply.newBuilder().setMessage("Hello "+request.getName()).build();
            responseObserver.onNext(helloReply);
            responseObserver.onCompleted();
        }
    }
}
