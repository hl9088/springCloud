package com.lhl.demo.consumer2;

import com.lhl.demo.consumer2.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


/**
 * RibbonClient 用来针对某个服务提供者进行配置负载策略
 * name是服务名称，config是配置类，需spring扫描不到
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER", configuration = RibbonConfig.class)
public class Consumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class, args);
    }

}
