package com.hnzhrh.bee.common.exception;

public enum ErrorEnum implements ErrorI{

    UNKNOWN_ERROR("UNKNOWN_ERROR", "未知错误"),
    NULL_POINTER_ERROR("NULL_POINTER_ERROR", "空指针错误"),
    DEFAULT_ERROR("DEFAULT_ERROR", "默认错误（没有指定错误码)")

    ;

    ErrorEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private String errorCode;

    private String errorMessage;

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
