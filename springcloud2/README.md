# SpringCloud:

## 微服务概述

###  什么是微服务

- 目前的微服务并没有一个统一的标准，一般是以业务来划分
- 将传统的一站式应用，拆分成一个个的服务，彻底去耦合，一个微服务就是单功能业务，只做一件事。
- 与微服务相对的叫巨石

### 微服务与微服务架构

- 微服务是一种架构模式或者一种架构风格，提倡将单一应用程序划分成一组小的服务独立部署，服务之间相互配合、相互协调，每个服务运行于自己的进程中。
- 服务与服务间采用轻量级通讯，如HTTP的RESTful API等
- 避免统一的、集中式的服务管理机制



## 1、服务注册与发现

### 1、Eureka

1、Eureka自我保护机制

```bash
 THE SELF PRESERVATION MODE IS TURNED OFF. THIS MAY NOT PROTECT INSTANCE EXPIRY IN CASE OF NETWORK/OTHER PROBLEMS.
 关闭自我保护模式后
```



### 2、Zookeeper

### 3、Consul

### 4、异同

## 2、服务调用

## 3、服务熔断/降级

## 4、服务网关

## 5、服务配置&服务总线

## 6、Stream消息驱动/Sleuth分布式请求链路跟踪

## 7、Nacos服务注册和配置中心

## 8、Sentinel实现熔断与限流

## 9、Seata处理分布式事务