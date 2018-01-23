package com.oath.hackday.iotexplore.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInfo {

    @Value("${version}")
    private String appVersion;

    @Value("${port}")
    private String appPort;

    @Value("${name}")
    private String appName;

    public String getAppVersion () {
        return appVersion;
    }

    public String getAppName () {
        return appName;
    }

    public String getAppPort () {
        return appPort;
    }

    public String getAppDetails () {
        return new StringBuilder(appName).append("(").append(appVersion)
                .append(")").append("@").append(appPort).toString();
    }

}
