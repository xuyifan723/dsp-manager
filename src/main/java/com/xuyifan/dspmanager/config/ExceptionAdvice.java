package com.xuyifan.dspmanager.config;


import com.xuyifan.dspmanager.enumbean.ResultCodeEnum;
import com.xuyifan.dspmanager.exception.MsgException;
import com.xuyifan.dspmanager.exception.UserException;
import com.xuyifan.dspmanager.util.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Xu yifan
 * @Ddecription 全局异常处理类
 * @date 2019/8/13 10:06
 * @Version 1.0
 */

@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(value = UserException.class)
    @ResponseBody
    public ResultBean myException(HttpServletRequest request, UserException e) {
        e.printStackTrace();
        Integer code = e.getCode();
        String message = e.getMessage();
        if (e.getCode() == null) {

            code = ResultCodeEnum.USER_EXCEPTION.getCode();
        }
        if (e.getMessage() == null) {
            message = ResultCodeEnum.USER_EXCEPTION.getTitle();
        }
        return new ResultBean(code,message,null);

    }
    @ExceptionHandler(value = MsgException.class)
    @ResponseBody
    public ResultBean msgException(HttpServletRequest request, MsgException e) {
        e.printStackTrace();
        Integer code = e.getCode();
        String message = e.getMessage();
        if (e.getCode() == null) {

            code = ResultCodeEnum.USER_EXCEPTION.getCode();
        }
        if (e.getMessage() == null) {
            message = ResultCodeEnum.USER_EXCEPTION.getTitle();
        }
        return new ResultBean(code,message,null);

    }

}
