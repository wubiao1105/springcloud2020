package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 配置类
 * @Author wb
 * @Date 2020/4/18 16:48
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getTestTemplate() {
        return new RestTemplate();
    }
}
