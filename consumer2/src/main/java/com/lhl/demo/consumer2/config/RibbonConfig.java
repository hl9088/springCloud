package com.lhl.demo.consumer2.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * 针对某个服务提供者使用自定义的负载均衡策略 此处不加 @configuration
 */
public class RibbonConfig {

    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
