package com.hyb.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //使用LoadBalanced注解赋予RestTemplate负载均衡能力
    public  RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
