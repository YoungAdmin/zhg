package com.ovozz.zhg.exception;

import com.ovozz.zhg.common.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理类
 */
@ControllerAdvice//全局捕获异常类，只要作用在@RequestMapping上，所有的异常都会被捕获
@RestController//反馈json格式
@Slf4j//日志
public class GlobalDefultExceptionHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseResult arithmeticExceptionErrorHandler(ArithmeticException exception) {
        log.error("【ArithmeticException】:{}", exception);
        return ResponseResult.failure(-1,"算术异常",exception.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseResult ErrorHandler(Exception exception) {
        log.error("【Exception】:{}", exception);
        return ResponseResult.failure(-1,"系统异常",exception);
    }

}
