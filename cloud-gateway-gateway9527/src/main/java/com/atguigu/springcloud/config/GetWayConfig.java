package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 网关配置类
 * @Author wb
 * @Date 2020/4/25 14:02
 */
@Configuration
public class GetWayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("route_1",
                        r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("route_2",
                        r -> r.path("/guoji").uri("http://news.baidu.com/guoji"))
                .route("route_3",
                        r -> r.path("/mil").uri("http://news.baidu.com/mil"))
                .build();
    }

}
