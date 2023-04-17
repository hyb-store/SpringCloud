package com.hyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaPayment9002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaPayment9002.class, args);
    }
}
