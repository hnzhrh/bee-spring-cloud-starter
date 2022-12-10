package com.hnzhrh.bee.common.exception;

/**
 * 业务异常
 * @author erpang
 * @version v1.0
 */
public class BizException extends BaseException{

    public BizException(String errMessage) {
        super(errMessage);
    }

    public BizException(String errorCode, String errMessage) {
        super(errorCode, errMessage);
    }

    public BizException(String errMessage, Throwable e) {
        super(errMessage, e);
    }

    public BizException(String errorCode, String errMessage, Throwable e) {
        super(errorCode, errMessage, e);
    }

    public BizException(ErrorI errorI) {
        super(errorI.getErrorMessage());
    }

    public BizException(ErrorI errorI, Throwable e) {
        super(errorI.getErrorMessage(), e);
    }

    @Override
    public String getErrorCode() {
        return super.getErrorCode();
    }

    public String getErrorMessage() {
        return super.getMessage();
    }


}
