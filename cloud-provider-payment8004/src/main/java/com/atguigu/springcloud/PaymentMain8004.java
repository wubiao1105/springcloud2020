package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 服务提供者主启动类（zookeeper作为注册中心）
 * @Author wb
 * @Date 2020/4/19 10:46
 */
@SpringBootApplication
@EnableDiscoveryClient // 使用zookeeper或consul作为注册中心需要使用该注解进行服务的注册与发现
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
