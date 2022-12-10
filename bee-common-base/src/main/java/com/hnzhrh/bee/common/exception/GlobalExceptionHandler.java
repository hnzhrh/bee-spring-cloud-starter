package com.hnzhrh.bee.common.exception;

import cn.hutool.core.util.StrUtil;
import com.hnzhrh.bee.common.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理器
 * @author erpang
 * @version v1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param req 请求
     * @param e 业务异常
     * @return 响应
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public Response bizExceptionHandler(HttpServletRequest req, BizException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMessage());
        return Response.buildFailure(StrUtil.isNotBlank(e.getErrorCode()) ? e.getErrorCode() : ErrorEnum.DEFAULT_ERROR.getErrorCode(), e.getErrorMessage());
    }

    /**
     * 处理空指针的异常
     * @param req 请求
     * @param e 业务异常
     * @return 响应
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public Response exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("发生空指针异常！原因是:",e);
        return Response.buildFailure(ErrorEnum.NULL_POINTER_ERROR);
    }

    /**
     * 处理其他异常
     * @param req 请求
     * @param e 业务异常
     * @return 响应
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Response exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return Response.buildFailure(ErrorEnum.UNKNOWN_ERROR);
    }
}
