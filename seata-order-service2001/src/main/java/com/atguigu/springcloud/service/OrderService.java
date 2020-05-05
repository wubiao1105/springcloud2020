package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @Description 订单业务类
 * @Author wb
 * @Date 2020/5/5 15:04
 */
public interface OrderService {

    void create(Order order);
}
