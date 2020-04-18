package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Description 支付服务
 * @Author wb
 * @Date 2020/4/18 14:02
 */
public interface PaymentService {
    int create(Payment payment); //写

    Payment getPaymentById(Long id);  //读取

}
