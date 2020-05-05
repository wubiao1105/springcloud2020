package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description 账户业务类
 * @Author wb
 * @Date 2020/5/5 16:36
 */
public interface AccountService {
    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId,
                  @RequestParam("money") BigDecimal money);

}
