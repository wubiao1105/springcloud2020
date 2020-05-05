package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 库存类
 * @Author wb
 * @Date 2020/5/5 16:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;

}
