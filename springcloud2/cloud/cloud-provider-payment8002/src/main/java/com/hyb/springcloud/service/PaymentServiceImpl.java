package com.hyb.springcloud.service;

import com.hyb.springcloud.dao.PaymentDao;
import com.hyb.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{
    /* https://blog.csdn.net/ljcgit/article/details/115353149
    当@Resource不设置任何值时，isDefaultName会为true，当对应字段名称的bean或者BeanDefinition已存在时会走byName的形式，否则走byType的形式；
    只指定了type属性时，只有当对应的名称不存在对应的bean或BeanDefinition，才会通过byType找到唯一的一个类型匹配的bean；
    只指定了name属性，会执行getBean方法，根据指定的name来获取bean；
    既指定了name属性，又指定了type属性，会先根据那么查找对应的bean，然后进行type类型比较。
    */
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
}
