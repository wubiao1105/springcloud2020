package com.atguigu.springcloud.lib.impl;

import com.atguigu.springcloud.lib.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description 自定义负载均衡轮询算法
 * @Author wb
 * @Date 2020/4/19 17:02
 */
@Component
@Slf4j
public class MyLB implements LoadBalancer {

    /**
     * 初始化的服务实例下标
     */
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * @return rest接口是第几次请求的
     */
    private int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));
        log.info("rest接口请求的次数为：" + next);
        return next;
    }

    @Override
    public ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() % serviceInstanceList.size(); // 选择的服务实例下标
        return serviceInstanceList.get(index);
    }
}
