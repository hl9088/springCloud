package com.lhl.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * value值为服务提供方的应用名
 */
@FeignClient(value = "provider")
public interface FeignServiceHi {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne();
}
