package com.jiely;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by Administrator on 2017/2/18.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
        //是返回的String.
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
        return "对不起，服务器繁忙，请稍后再试！";
    }
}
