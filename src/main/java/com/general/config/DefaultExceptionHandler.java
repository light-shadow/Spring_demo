package com.general.config;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by general on 2017/8/17.
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultErrorHandler(HttpServletRequest req, Exception e)
    {
        return "Sorry, the server is busy now! Please try again later!";
    }


}
