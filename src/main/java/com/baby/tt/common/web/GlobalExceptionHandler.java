package com.baby.tt.common.web;

import com.baby.tt.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandlerRuntimeException(RuntimeException e){
        e.printStackTrace();
        return new JsonResult(e);
    }

}
