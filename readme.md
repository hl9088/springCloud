#spring-cloud demo
##使用eureka作为服务注册中心，同时启用两个服务提供者和一个服务消费者进行测试

###eureka服务端 通过注解@EnableEurekaServer启用注册中心

###eureka客户端 通过注解@EnableEurekaClient 客户端向注册中心注册服务

##主要配置项
### #应用名称 （服务消费端可以通过此应用名进行远程调用服务提供方，注代码中服务名要大写）
###spring.application.name=eureka
### #实例名 同一个spring.application.name名称下唯一
###eureka.instance.instance-id=eureka1

### #是否将自己注册到eureka服务中 eurekaServer不需要注册自己，服务提供端需要
###eureka.client.register-with-eureka=false
### #和eureka服务器通讯的url
###eureka.client.service-url.defaultZone=http://localhost:8091/eureka