package com.atguigu.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description 自定义负载均衡的轮询算法
 * @Author wb
 * @Date 2020/4/19 16:56
 */
public interface LoadBalancer {

    /**
     * 自定义算法实现负载均衡
     *
     * @param serviceInstanceList 集群中的服务实例集合
     * @return 从中选择一个服务实例
     */
    ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList);
}
