package com.hyb.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    /**
     * 正常访问，肯定OK
     *
     * @param id
     * @return
     */
    public String paymentInfoOK(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfoOK,id:  " + id + "\t"
                + "O(∩_∩)O哈哈~";
    }

    public String paymentInfoTimeOut(Integer id) {
        //int age = 10/0;
        int second = 3;
        long start = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfoTimeOut,id:  " + id + "\t"
                + "O(∩_∩)O哈哈~" + "  耗时(秒): " + second;
    }
}
