package com.lhl.demo.feign.service;

import com.lhl.demo.feign.bean.User;
import org.springframework.stereotype.Component;

/**
 * 服务降级
 */
@Component
public class FeignFallBack implements FeignServiceHi {

    @Override
    public String sayHi() {
        return "error No provider";
    }

    @Override
    public String sayHi(String username) {
        return "error No provider";
    }

    @Override
    public String sayHi(User user) {
        return "error No provider";
    }
}
