package com.example.grpcclient.service;

import com.example.grpcclient.entity.PackageInfoDTO;
import com.example.grpcclient.grpc.AppServiceGrpc;
import com.example.grpcclient.grpc.AppServiceOuterClass;
import com.example.grpcclient.grpc.AuthServiceGrpc;
import com.example.grpcclient.grpc.AuthServiceOuterClass;
import com.example.grpcclient.grpc.Base;
import com.example.grpcclient.grpc.CheckServiceGrpc;
import com.example.grpcclient.grpc.Checkparam;
import com.example.grpcclient.grpc.Test;
import com.example.grpcclient.grpc.TestServiceGrpc;
import com.example.grpcclient.grpc.TimeZoneServiceGrpc;
import com.example.grpcclient.grpc.UploadServiceGrpc;
import com.example.grpcclient.grpc.UploadServiceOuterClass;
import com.example.grpcclient.grpc.UserServiceOuterClass;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author yanglin
 * @date 2021/4/9 11:05
 */
@Service
@Slf4j
public class GrpcService {

    @GrpcClient("local-grpc-server")
    private TestServiceGrpc.TestServiceBlockingStub testServiceBlockingStub;

    @GrpcClient("local-grpc-server")
    private TestServiceGrpc.TestServiceStub testServiceStub;

    @GrpcClient("local-grpc-server1")
    private TestServiceGrpc.TestServiceBlockingStub testServiceBlockingStub1;

    private TestServiceGrpc.TestServiceFutureStub testServiceFutureStub;

    @GrpcClient("local-grpc-server")
    private CheckServiceGrpc.CheckServiceBlockingStub checkServiceBlockingStub;

    @GrpcClient("reference-app-backend")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    @GrpcClient("local-grpc-server")
    private UploadServiceGrpc.UploadServiceStub uploadServiceStub;

    @GrpcClient("local-grpc-server")
    private UploadServiceGrpc.UploadServiceBlockingStub uploadServiceBlockingStub;

    @GrpcClient("reference-app")
    private AppServiceGrpc.AppServiceBlockingStub appServiceBlockingStub;

    @GrpcClient("reference-app")
    private TimeZoneServiceGrpc.TimeZoneServiceBlockingStub timeZoneServiceBlockingStub;

    public String check() {
        Checkparam.Request request = Checkparam.Request.newBuilder().setName(1).setName1("asaas").build();
        Checkparam.Response response = checkServiceBlockingStub.check(request);
        return response.getReply();
    }

    public String capture() {
        AuthServiceOuterClass.VerificationCodeReq verificationCodeReq = AuthServiceOuterClass.VerificationCodeReq.newBuilder().setPhone("13329809039").build();
        Base.Result result = authServiceBlockingStub.sendVerificationCode(verificationCodeReq);
        return "";
    }

    public String getTest(String phone) {
//        Test.Request request = Test.Request.newBuilder().setName(phone).build();
//        Test.Response response = testServiceBlockingStub.sayTest(request);
//        log.info("client get message,time:{}", System.currentTimeMillis());
        Test.Request request = Test.Request.newBuilder().setName(phone).build();
        testServiceBlockingStub.sayTest(request);
        return "";
//        return response.getRname();
    }

    public void getTestRespStream(String phone) {
        Test.Request request = Test.Request.newBuilder().setName(phone).build();
        Context.CancellableContext cancellableContext = Context.current().withCancellation();
        Iterator<Test.Response> responseIterator = testServiceBlockingStub.sayTestResStream(request);
        while (responseIterator.hasNext()) {
            Test.Response response = responseIterator.next();
            log.info("stream response:{}", response.getRname());
        }
    }

    public void getTestReqStream(String phone) {
        StreamObserver<Test.Request> requestStreamObserver = testServiceStub.sayTestReqStream(new StreamObserver<Test.Response>() {
            @Override
            public void onNext(Test.Response value) {
                log.info("get response:{}", value.getRname());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });
        Stream.of("1", "2", "3").map(a -> Test.Request.newBuilder().setName(a).build()).forEach(requestStreamObserver::onNext);
        requestStreamObserver.onCompleted();
    }

    public void getTestAllStream(String phone) {
        AtomicInteger index = new AtomicInteger();
        StreamObserver<Test.Request> requestStreamObserver = testServiceStub.sayTestAllStream(new StreamObserver<Test.Response>() {
            @Override
            public void onNext(Test.Response value) {
                log.info("get response:{}", value.getRname());
                index.addAndGet(Integer.parseInt(value.getRname()));
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                log.info("completed");
            }
        });
        Stream.of("1", "2", "3", "4", "5", "6").forEach(a -> {
            Test.Request request = Test.Request.newBuilder().setName(a).build();
//            if (Integer.parseInt(a) % 2 == 0) {
//                // 2 4 6
//                log.info("send:{}", a);
//                requestStreamObserver.onNext(request);
//            } else {
//                // 1 3 5
//                log.info("sleep:{}", a);
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                requestStreamObserver.onNext(request);
//            }
            requestStreamObserver.onNext(request);
        });
        requestStreamObserver.onCompleted();
    }

    public String upload() {
        byte[] bytes1 = {72,
                101,
                108,
                108,
                111};
        BoolValue upload = uploadServiceBlockingStub.upload(UploadServiceOuterClass.UploadReq.newBuilder().setFile(UploadServiceOuterClass.File.newBuilder().setContent(ByteString.copyFrom(bytes1)).build()).build());
        return String.valueOf(upload.getValue());
    }

    public String uploadStream(MultipartFile file) throws IOException {
        StreamObserver<UploadServiceOuterClass.UploadReq> streamObserver = uploadServiceStub.uploadStream(new StreamObserver<BoolValue>() {
            @Override
            public void onNext(BoolValue value) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });
        streamObserver.onNext(UploadServiceOuterClass.UploadReq.newBuilder().setName(file.getResource().getFilename()).build());
        InputStream fileInputStream = file.getInputStream();
        int size;
        byte[] bytes = new byte[1024 * 10];
        while (true) {
            try {
                if (((size = fileInputStream.read(bytes)) > 0)) {
                    UploadServiceOuterClass.UploadReq uploadReq = UploadServiceOuterClass.UploadReq.newBuilder().setFile(UploadServiceOuterClass.File.newBuilder().setContent(ByteString.copyFrom(bytes, 0, size)).build()).build();
                    streamObserver.onNext(uploadReq);
                } else {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        streamObserver.onCompleted();
        return "true";
    }

    public String upload(MultipartFile file, String authToken, PackageInfoDTO packageInfoDTO) throws IOException {
        InputStream fileInputStream = file.getInputStream();
        int size;
        byte[] bytes = new byte[1024 * 1024 * 100];
        AppServiceOuterClass.UploadApp.Builder builder = AppServiceOuterClass.UploadApp.newBuilder()
                .setName(packageInfoDTO.getName()).setAppId(packageInfoDTO.getAppId()).setVersion(packageInfoDTO.getVersion())
                .setIsForce(packageInfoDTO.getIsForce() == 1).setVersionCode(Integer.parseInt(String.valueOf(packageInfoDTO.getVersionCode())))
                .setVersionInfo(packageInfoDTO.getVersionInfo());
        StringValue stringValue = null;
        try {
            if (((size = fileInputStream.read(bytes)) > 0)) {
                builder.setPackageFile(ByteString.copyFrom(bytes, 0, size));
//                AppServiceOuterClass.UploadAppOrImgReq uploadAppOrImgReq = AppServiceOuterClass.UploadAppOrImgReq.newBuilder()
//                        .setUploadImg(AppServiceOuterClass.UploadImg.newBuilder().setImgFile(ByteString.copyFrom(bytes, 0, size))
//                                .setName(packageInfoDTO.getName())).build();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppServiceOuterClass.UploadAppOrImgReq uploadAppOrImgReq = AppServiceOuterClass.UploadAppOrImgReq.newBuilder()
                .setUploadApp(builder.build()).setType(1).build();
        Metadata token = new Metadata();
        token.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER), authToken);
        stringValue = MetadataUtils.attachHeaders(appServiceBlockingStub, token).uploadAppOrImg(uploadAppOrImgReq);
        return Optional.ofNullable(stringValue).map(StringValue::getValue).orElse("");
    }

    public String checkParams(String authToken){
        Metadata token = new Metadata();
        token.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER), authToken);
        UserServiceOuterClass.User user = MetadataUtils.attachHeaders(timeZoneServiceBlockingStub, token).setTimeZone(Int32Value.newBuilder().setValue(1).build());
        return String.valueOf(user.getZoneId());
    }

}
