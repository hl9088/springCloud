package com.lhl.demo.consumer2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    /**
     * LoadBalanced 启用负载均衡
     * 默认的ribbon的轮询 负载均衡策略
     * 比如1,2,1,2,1,2,1,2,1,2
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
