package com.hnzhrh.bee.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 单数据响应
 * @author erpang
 * @param <T> 数据泛型
 * @version v1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SingleResponse<T> extends Response{

    private T data;

    public static SingleResponse buildSuccess() {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);
        return response;
    }

    public static SingleResponse buildFailure(String errCode, String errMessage) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }
}
