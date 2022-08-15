package com.hyb.springcloud.service.impl;

import com.hyb.springcloud.entities.CommonResult;
import com.hyb.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult getPaymentById(Long id) {
        return new CommonResult(404, "系统繁忙Fallback#getPaymentById");
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "系统繁忙Fallback#paymentInfoTimeOut";
    }
}
