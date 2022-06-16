package com.example.grpcserver.controller;

import com.example.grpcserver.grpc.Test;
import com.example.grpcserver.grpc.TestServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanglin
 * @date 2021/4/7 18:12
 */
@GrpcService
@Slf4j
public class TestController extends TestServiceGrpc.TestServiceImplBase {


    @Override
    public void sayTest(Test.Request request, StreamObserver<Test.Response> responseObserver) {
        log.info("server start:" + System.currentTimeMillis());
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        responseObserver.onNext(Test.Response.newBuilder().build());
        log.info("server send message,time:{}", System.currentTimeMillis());
        responseObserver.onCompleted();
//        responseObserver.onError(new RuntimeException());
    }

    @Override
    public void sayTestResStream(Test.Request request, StreamObserver<Test.Response> responseObserver){
        for (int i = 0; i < 5; i++) {
//            if (i % 2 == 1) {
//                break;
//            } else {
//                responseObserver.onNext(Test.Response.newBuilder().setRname(i + "").build());
//            }
            try {
                Thread.sleep(20000);
            }catch (InterruptedException e){
                log.error("sleep error");
            }
            responseObserver.onNext(Test.Response.newBuilder().setRname(i + "").build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Test.Request> sayTestReqStream(StreamObserver<Test.Response> responseObserver) {
        return new StreamObserver<Test.Request>() {
            private int count;
            private String name;

            @Override
            public void onNext(Test.Request value) {
                log.info("get request:{}", value.getName());
                count++;
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Test.Response.newBuilder().setRname(String.valueOf(count)).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Test.Request> sayTestAllStream(StreamObserver<Test.Response> responseObserver) {
        return new StreamObserver<Test.Request>() {
            private List<String> names = new ArrayList<>();
            @Override
            public void onNext(Test.Request value) {
                log.info("request:{}", value.getName());
                if (Integer.valueOf(value.getName()) % 2 == 0) {
                    responseObserver.onNext(Test.Response.newBuilder().setRname(value.getName()).build());
//                    if (Integer.valueOf(value.getName())==6){
//                        try {
//                            Thread.sleep(10000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                } else {
                    names.add(value.getName());
                }
            }

            @Override
            public void onError(Throwable t) {
                log.error("error");
            }

            @Override
            public void onCompleted() {
                names.forEach(name -> responseObserver.onNext(Test.Response.newBuilder().setRname(name).build()));
                responseObserver.onCompleted();
            }
        };
    }
}
