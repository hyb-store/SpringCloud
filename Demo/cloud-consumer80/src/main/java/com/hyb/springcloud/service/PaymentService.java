package com.hyb.springcloud.service;

import com.hyb.springcloud.entities.CommonResult;
import com.hyb.springcloud.entities.Payment;
import com.hyb.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    //超时或者异常
    @GetMapping("/payment/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id);

}
