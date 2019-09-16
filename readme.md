# spring-cloud demo

*使用eureka作为服务注册中心，通过feign启用声明式服务调用，以及简单的服务降级*

## 主要用到的注解
1. eureka服务端 通过注解@EnableEurekaServer启用注册中心
2. eureka客户端 通过注解@EnableEurekaClient 客户端向注册中心注册服务
3. feign客户端 通过注解@EnableFeignClients启用feign 通过注解@FeignClient(value = "provider", fallback = FeignFallBack.class):value指定要调用的服务,fallback服务降级调用的方法

## 项目中module介绍
1. eureka-server eureka注册中心
2. provider/provider2 服务提供者
3. feign 服务消费方 提供声明式服务调用

## 主要配置项
```
#应用名称 （在服务消费端通过restTemplate远程调用时 直接使用此应用名 不需要指定ip）
spring.application.name=eureka
#实例名 同一个spring.application.name名称下唯一
eureka.instance.instance-id=eureka1

#是否将自己注册到eureka服务中 eurekaServer不需要注册自己，服务提供端需要设置为true
eureka.client.register-with-eureka=false
#和eureka服务器通讯的url
eureka.client.service-url.defaultZone=http://localhost:8091/eureka

# 服务降级 启用hystrix 
feign.hystrix.enabled=true
```
