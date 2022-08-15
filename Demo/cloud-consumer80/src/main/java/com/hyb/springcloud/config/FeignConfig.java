package com.hyb.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean //日志级别Log the headers, body, and metadata for both requests and responses.
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
