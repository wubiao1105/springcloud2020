package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description 服务降级处理类
 * @Author wb
 * @Date 2020/4/22 20:45
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
