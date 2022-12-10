package com.hnzhrh.bee.common.dto;

import com.hnzhrh.bee.common.exception.ErrorEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 响应基类
 * @see SingleResponse
 * @see MultiResponse
 * @see PageResponse
 * @author erpang
 * @version v1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends DTO {

    private boolean success;

    private String errCode;

    private String errMessage;

    public static Response buildSuccess() {
        Response response = new Response();
        response.setSuccess(true);
        return response;
    }

    public static Response buildFailure(String errCode, String errMessage) {
        Response response = new Response();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static Response buildFailure(ErrorEnum errorEnum) {
        Response response = new Response();
        response.setSuccess(false);
        response.setErrCode(errorEnum.getErrorCode());
        response.setErrMessage(errorEnum.getErrorMessage());
        return response;
    }

    @Override
    public String toString() {
        return "Response [success=" + success + ", errCode=" + errCode + ", errMessage=" + errMessage + "]";
    }
}
