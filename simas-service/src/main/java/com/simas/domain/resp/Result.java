package com.simas.domain.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    // 状态码，1为成功，0为失败
    private Integer code;
    // 错误信息
    private String msg;
    // 数据
    private T data;

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(1);
        return result;
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
