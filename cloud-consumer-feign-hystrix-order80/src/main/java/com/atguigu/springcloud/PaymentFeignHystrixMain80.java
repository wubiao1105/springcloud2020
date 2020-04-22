package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.*;

/**
 * @Description 消费者主启动类（整合Feign和Hystrix）
 * @Author wb
 * @Date 2020/4/20 22:14
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class PaymentFeignHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentFeignHystrixMain80.class, args);
    }
}
