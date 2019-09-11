package com.lhl.demo.provider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = {"/", "/hi"})
    public String sayHi() {
        return "Hi, spring cloud from " + port;
    }
}
