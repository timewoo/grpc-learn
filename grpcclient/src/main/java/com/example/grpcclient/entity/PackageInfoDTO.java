package com.example.grpcclient.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: jason.tang
 * @Date: 2020/11/20 上午10:42
 */
@Data
public class PackageInfoDTO {
    private Integer isForce;
    @NotNull(message = "升级信息不能为空")
    private String versionInfo;
    @NotNull
    private Integer appId;
    /**
     * app name
     */
    private String name;
    /**
     * version code for current App; if the packageFile is not null, versionCode would be ignored, we will read the versionCode from the APK file.
     */
    private Long versionCode;
    /**
     * version, such as, 1.1.0-SNAPSHOT
     */
    private String version;
    /**
     * 0: android
     * 1: ios
     */
    private Integer platform;
}
