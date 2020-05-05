package com.atguigu.springcloud.service;

/**
 * @Description 库存业务类
 * @Author wb
 * @Date 2020/5/5 16:19
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);

}
