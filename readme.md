# spring-cloud demo

*使用eureka作为服务注册中心，以及ribbon提供的负载均衡策略，项目中启用两个服务提供者和两个服务消费者进行测试*

## 主要用到的注解
1. eureka服务端 通过注解@EnableEurekaServer启用注册中心
2. eureka客户端 通过注解@EnableEurekaClient 客户端向注册中心注册服务
3. ribbon负载均衡实现 @LoadBalanced启用负载均衡、@RibbonClient在启动类上配置针对某个服务进行负载均衡

## 项目中module介绍
1. eureka-server eureka注册中心
2. provider/provider2 服务提供者
3. consumer/consumer2 服务消费方 (consumer2中ribbon可以针对某个服务设置自定义的负载均衡策略，consumer中配置的是全局负载均衡策略)

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
```
