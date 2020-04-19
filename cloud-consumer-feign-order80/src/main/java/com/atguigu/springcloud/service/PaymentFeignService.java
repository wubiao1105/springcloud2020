package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description 支付业务类（整合OpenFeign）
 * @Author wb
 * @Date 2020/4/19 22:06
 */
@Component // 接口上需要标明该注解，将该接口作为一个bean注册进spring容器中
@FeignClient("CLOUD-PAYMENT-SERVICE") // 表示该接口使用Feign的方式调用，并且需要指明调用的是哪个微服务
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}
