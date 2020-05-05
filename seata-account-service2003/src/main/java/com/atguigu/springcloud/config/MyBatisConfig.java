package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description mybatis配置类
 * @Author wb
 * @Date 2020/5/5 15:42
 */
@Configuration
@MapperScan(basePackages = {"com.atguigu.springcloud.dao"})
public class MyBatisConfig {
}
