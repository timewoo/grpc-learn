package com.example.grpcserver.controller;

import com.example.grpcserver.grpc.UploadServiceGrpc;
import com.example.grpcserver.grpc.UploadServiceOuterClass;
import com.google.protobuf.BoolValue;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author yanglin
 * @date 2021/7/9 11:27
 */
@GrpcService
@Slf4j
public class UploadController extends UploadServiceGrpc.UploadServiceImplBase {


    @Override
    public StreamObserver<UploadServiceOuterClass.UploadReq> uploadStream(StreamObserver<BoolValue> responseObserver) {
        return new StreamObserver<UploadServiceOuterClass.UploadReq>() {

            private BufferedOutputStream writer;

            @Override
            public void onNext(UploadServiceOuterClass.UploadReq value) {
                log.info("name:{}", value.getName());
                if (!value.getName().isBlank()) {
                    try {
                        writer = new BufferedOutputStream(new FileOutputStream("D:\\" + value.getName()));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        writer.write(value.getFile().getContent().toByteArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                log.info("completed");
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(BoolValue.of(true));
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) throws IOException {
        String str = "中国";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

//        byte[] bytes1 = {-28,
//                -72,
//                -83,
//                -27,
//                -101,
//                -67};
        byte[] bytes1 = {72,
                101,
                108,
                108,
                111};
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\test.txt"));
        bufferedOutputStream.write(bytes1);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @Override
    public void upload(UploadServiceOuterClass.UploadReq request, StreamObserver<BoolValue> responseObserver) {
        log.info("file:" + request.getFile().getContent().toStringUtf8());
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            bufferedOutputStream.write(request.getFile().getContent().toByteArray());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(BoolValue.of(true));
        responseObserver.onCompleted();
    }
}
