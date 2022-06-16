//package com.example.grpcserver.controller;
//
//import com.example.grpcserver.grpc.CheckServiceGrpc;
//import com.example.grpcserver.grpc.Checkparam;
//import io.grpc.stub.StreamObserver;
//import net.devh.boot.grpc.server.service.GrpcService;
//
///**
// * @author yanglin
// * @date 2021/5/25 18:45
// */
//@GrpcService
//public class CheckController extends CheckServiceGrpc.CheckServiceImplBase {
//    @Override
//    public void check(Checkparam.Request request, StreamObserver<Checkparam.Response> responseObserver) {
//        responseObserver.onNext(Checkparam.Response.newBuilder().setReply(request.getName1()).build());
//        responseObserver.onCompleted();
//    }
//}
