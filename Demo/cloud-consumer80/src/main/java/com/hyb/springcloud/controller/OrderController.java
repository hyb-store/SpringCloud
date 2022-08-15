package com.hyb.springcloud.controller;

import com.hyb.springcloud.entities.CommonResult;
import com.hyb.springcloud.entities.Payment;
import com.hyb.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    //    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
//    })
    //@HystrixCommand //找globalFallbackMethod
    @GetMapping("/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        //int age = 10 / 0;
        String result = paymentService.paymentInfoTimeOut(id);
        return result;
    }
}
