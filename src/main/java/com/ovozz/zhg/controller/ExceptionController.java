package com.ovozz.zhg.controller;

import com.ovozz.zhg.common.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class ExceptionController {

    @RequestMapping(value = "throwException",method = RequestMethod.GET)
    @ApiOperation(value = "异常抛出接口",notes = "抛出异常让全局异常处理",response = ResponseResult.class,httpMethod = "GET")
    public ResponseResult testException(int i) {
        int a = 10;
        int b = a / i;
        return ResponseResult.success(b);
    }
}
