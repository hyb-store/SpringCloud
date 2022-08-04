package com.hyb.springcloud.service;

import com.hyb.springcloud.entities.Payment;

public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymentById(Long id);
}
