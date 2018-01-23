package com.oath.hackday.iotexplore.controller;

import com.oath.hackday.iotexplore.service.ApplicationInfo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IotController {

    @Autowired
    private ApplicationInfo appInfo;


    @GetMapping("/app/version")
    public String getAppVersion() {
        return appInfo.getAppVersion();
    }

    @GetMapping("/app/port")
    public String getAppPort() {
        return appInfo.getAppPort();
    }

    @GetMapping("/app/name")
    public String getAppName() {
        return appInfo.getAppName();
    }

    @GetMapping("/app/details")
    public String getAppDetails() {
        return appInfo.getAppDetails();
    }
}
