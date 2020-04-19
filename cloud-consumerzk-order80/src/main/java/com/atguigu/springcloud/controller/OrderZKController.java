package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description 消费者控制层（整合zookeeper）
 * @Author wb
 * @Date 2020/4/19 11:53
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment() {
        return restTemplate.getForObject(INVOME_URL + "/payment/zk", String.class);
    }

}
