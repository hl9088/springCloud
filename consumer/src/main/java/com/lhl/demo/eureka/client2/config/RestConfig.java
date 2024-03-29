package com.lhl.demo.eureka.client2.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    /**
     * LoadBalanced 启用负载均衡
     * ribbon默认是轮询 负载均衡策略
     * 比如1,2,1,2,1,2,1,2,1,2
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 负载均衡算法 随机
     * 比如1,1,2,1,2,2,2,1
     *
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
        //return new RetryRule();
        //return new RoundRobinRule();
    }
}
