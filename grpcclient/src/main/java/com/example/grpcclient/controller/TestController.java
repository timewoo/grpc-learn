package com.example.grpcclient.controller;

import com.example.grpcclient.entity.PackageInfoDTO;
import com.example.grpcclient.service.GrpcService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author yanglin
 * @date 2021/3/29 10:23
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private GrpcService grpcService;

    @GetMapping("code")
    public String getCode(@RequestParam String phone) {
//        return grpcService.getTest(phone);
        grpcService.getTestRespStream(phone);
//        grpcService.getTestReqStream(phone);
//        grpcService.getTestAllStream(phone);
        return "true";
    }

    @GetMapping("check")
    public String check() {
        return grpcService.check();
    }

    @GetMapping("capture")
    public String capture() {
        return grpcService.capture();
    }

    @PostMapping("upload")
    public String upload(@RequestParam(name = "file", required = false) MultipartFile file, @RequestParam("token") String token
            ,PackageInfoDTO packageInfoDTO) throws IOException {
//        return grpcService.upload();
        return grpcService.upload(file, token, packageInfoDTO);
    }

    @GetMapping("checkParam")
    public String checkParam(@RequestParam("token") String token){
        return grpcService.checkParams(token);
    }
}
