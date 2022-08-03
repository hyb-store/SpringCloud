package com.hyb.springcloud.service;

import com.hyb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymentById(Long id);
}
