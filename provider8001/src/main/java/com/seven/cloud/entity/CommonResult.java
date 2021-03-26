package com.seven.cloud.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:01 下午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

}
