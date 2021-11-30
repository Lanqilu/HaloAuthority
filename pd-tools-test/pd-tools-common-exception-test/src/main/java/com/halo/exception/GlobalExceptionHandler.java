package com.halo.exception;

import com.itheima.pinda.common.handler.DefaultGlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Halo
 * @create 2021/11/30 下午 03:32
 * @description 全局异常处理
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends DefaultGlobalExceptionHandler {
}