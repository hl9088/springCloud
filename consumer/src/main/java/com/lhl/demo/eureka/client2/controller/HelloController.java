package com.lhl.demo.eureka.client2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    // 服务名称大小写均可以
    private final String providerUrl = "http://provider/hi";

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/hi")
    public String provider() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("PROVIDER");
        logger.info("host = {}", serviceInstance.getHost());
        logger.info("port = {}", serviceInstance.getPort());
        logger.info("serviceId = {}", serviceInstance.getServiceId());
        return restTemplate.getForObject(providerUrl, String.class);
    }
}
