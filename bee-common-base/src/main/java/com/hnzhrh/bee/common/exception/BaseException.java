package com.hnzhrh.bee.common.exception;

/**
 * 自定义异常基类
 * @author erpang
 * @version v1.0
 */
public abstract class BaseException extends RuntimeException{

    private String errorCode;

    public BaseException(String errMessage) {
        super(errMessage);
    }

    public BaseException(String errorCode, String errMessage) {
        super(errMessage);
        this.errorCode = errorCode;
    }

    public BaseException(String errMessage, Throwable e) {
        super(errMessage, e);
    }

    public BaseException(String errorCode, String errMessage, Throwable e) {
        super(errMessage, e);
        this.errorCode = errorCode;
    }

    public BaseException(ErrorI errorI) {
        super(errorI.getErrorMessage());
        this.errorCode = errorI.getErrorCode();
    }

    public BaseException(ErrorI errorI, Throwable e) {
        super(errorI.getErrorMessage(), e);
        this.errorCode = errorI.getErrorCode();
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
