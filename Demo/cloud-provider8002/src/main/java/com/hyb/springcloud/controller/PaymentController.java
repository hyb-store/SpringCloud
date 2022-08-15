package com.hyb.springcloud.controller;

import com.hyb.springcloud.entities.CommonResult;
import com.hyb.springcloud.entities.Payment;
import com.hyb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult creat(@RequestBody Payment payment) {
        int result = paymentService.creat(payment);
        log.info("*********插入结果：{}************", result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功:serverPort:" + serverPort, result);
        }
        return new CommonResult(444, "插入数据失败");
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*********插入结果：{}************", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功:serverPort:" + serverPort, payment);
        }
        return new CommonResult(444, "没有记录，查询失败，id:"+id);
    }

    //超时或者异常
    @GetMapping("/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfoTimeOut(id);
        log.info("result: " + result);
        return result;
    }

}
