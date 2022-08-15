package com.hyb.springcloud.service.impl;

import com.hyb.springcloud.dao.PaymentDao;
import com.hyb.springcloud.entities.Payment;
import com.hyb.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到多少后跳闸
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")// 超时处理
    })
    public String paymentInfoTimeOut(Integer id) {
        if (id < 0) {
            throw new RuntimeException("******id 不能负数");
        }
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

    /**
     * paymentCircuitBreaker 方法的 fallback，当断路器开启时，主逻辑熔断降级，
     * 该 fallback 方法就会替换原 paymentCircuitBreaker 方法，处理请求
     */
    public String paymentCircuitBreakerFallback(Integer id) {
        return Thread.currentThread().getName() + "\t" + "id 不能负数或超时或自身错误，请稍后再试，/(ㄒoㄒ)/~~   id: " + id;
    }

}
