package com.lhl.demo.consumer2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    // 服务名称大小写均可以
    private final String providerUrl = "http://provider/hi";

    @RequestMapping("/hi")
    public String provider() {
        return restTemplate.getForObject(providerUrl, String.class);
    }
}
