package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 通用结果集
 * @Author wb
 * @Date 2020/4/18 12:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResult {

    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
