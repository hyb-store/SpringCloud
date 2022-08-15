package com.hyb.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//实现热加载 自动获取刷新内容
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "配置中心配置configInfo: " + configInfo + "---" +
                "服务:" + applicationName + ",端口:" + serverPort;
    }
}