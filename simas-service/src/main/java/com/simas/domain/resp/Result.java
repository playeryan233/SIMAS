package com.simas.domain.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "返回结果")
public class Result<T> implements Serializable {

    // 状态码，1为成功，0为失败
    @Schema(description = "状态码")
    private Integer code;
    // 错误信息
    @Schema(description = "错误信息")
    private String msg;
    // 数据
    private T data;

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(1);
        result.setMsg("success");
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
