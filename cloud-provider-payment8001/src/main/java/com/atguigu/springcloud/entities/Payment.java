package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description Payment实体类
 * @Author wb
 * @Date 2020/4/18 12:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable {
    private static final long serialVersionUID = -7942337272130211133L;

    private Long id;
    private String serial;
}
