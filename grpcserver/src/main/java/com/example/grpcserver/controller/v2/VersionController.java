package com.example.grpcserver.controller.v2;

import com.example.grpcserver.grpc.v2.Version;
import com.example.grpcserver.grpc.v2.VersionTestGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author yanglin
 * @date 2021/4/16 11:49
 */
public class VersionController extends VersionTestGrpc.VersionTestImplBase {


    @Override
    public void versionService(Version.Request request, StreamObserver<Version.Response> responseObserver) {
        super.versionService(request, responseObserver);
    }
}
