package com.lhl.demo.consumer2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    // 此处provider需要大写 即使配置文件中配置的是小写
    private final String providerUrl = "http://PROVIDER/hi";

    @RequestMapping("/hi")
    public String provider() {
        return restTemplate.getForObject(providerUrl, String.class);
    }
}
