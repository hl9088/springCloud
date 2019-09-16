package com.lhl.demo.feign.service;

import com.lhl.demo.feign.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * value值为服务提供方的应用名
 */
@FeignClient(value = "provider", fallback = FeignFallBack.class)
public interface FeignServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi();

    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    String sayHi(@RequestParam String username);

    @RequestMapping(value = "/hi3", method = RequestMethod.POST)
    String sayHi(@RequestBody User user);
}
