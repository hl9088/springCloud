package com.lhl.demo.provider2.controller;

import com.lhl.demo.provider2.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = {"/", "/hi"}, method = RequestMethod.GET)
    public String sayHi() {
        return "Hi, spring cloud from " + port;
    }

    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    public String sayHi(@RequestParam String username) {
        return username + " say: hi, spring cloud from " + port;
    }

    @RequestMapping(value = "/hi3", method = RequestMethod.POST)
    public String sayHi(@RequestBody User user) {
        return user.getUsername() + " say: hi, spring cloud from " + port;
    }
}
