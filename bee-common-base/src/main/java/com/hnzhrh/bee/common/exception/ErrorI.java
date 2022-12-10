package com.hnzhrh.bee.common.exception;

/**
 * 错误
 * @author erpang
 * @version v1.0
 */
public interface ErrorI {
    /**
     * 获取错误码
     * @return 错误码
     */
    String getErrorCode();

    /**
     * 获取错误信息
     * @return 错误信息
     */
    String getErrorMessage();
}
