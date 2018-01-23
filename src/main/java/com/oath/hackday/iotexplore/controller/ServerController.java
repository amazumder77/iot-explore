package com.oath.hackday.iotexplore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServerController {

    @GetMapping("/server/app/version")
    public String getServerVersion() {
        RestTemplate restTemplate = new RestTemplate();
        String appVersion = restTemplate.getForObject("http://localhost:8090/app/version", String.class);
        return appVersion;
    }

}
