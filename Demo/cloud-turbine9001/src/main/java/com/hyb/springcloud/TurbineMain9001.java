package com.hyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard //开启HystrixDashboard
@EnableDiscoveryClient
@EnableCircuitBreaker
public class TurbineMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(TurbineMain9001.class, args);
    }
}
