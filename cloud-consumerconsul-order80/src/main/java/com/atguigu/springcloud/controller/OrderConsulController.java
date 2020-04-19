package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description 订单相关功能控制层（整合consul）
 * @Author wb
 * @Date 2020/4/19 14:25
 */
@RestController
@Slf4j
public class OrderConsulController {
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment() {
        return restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
    }

}
