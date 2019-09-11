package com.lhl.demo.feign.controller;

import com.lhl.demo.feign.service.FeignServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FeignServiceHi feignServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(){
        return feignServiceHi.sayHiFromClientOne();
    }
}
