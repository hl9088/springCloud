package com.lhl.demo.feign.controller;

import com.lhl.demo.feign.bean.User;
import com.lhl.demo.feign.service.FeignServiceHi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private FeignServiceHi feignServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi() {
        String hi = feignServiceHi.sayHi();
        logger.info("hi = {}", hi);
        String hi2 = feignServiceHi.sayHi("tony");
        logger.info("hi2 = {}", hi2);
        String hi3 = feignServiceHi.sayHi(new User("tom"));
        logger.info("hi3 = {}", hi3);
        return "(1)" + hi + "; (2)" + hi2 + "; (3)" + hi3;
    }
}
