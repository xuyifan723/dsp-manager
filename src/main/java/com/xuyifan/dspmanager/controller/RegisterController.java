package com.xuyifan.dspmanager.controller;

import com.xuyifan.dspmanager.interbean.LoginBean;
import com.xuyifan.dspmanager.interbean.ResultBean;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname RegisterController
 * @Description TODO
 * @Date 2019/7/4 0004 下午 4:52
 * @Created by XUYIFAN723
 */
@Controller
public class RegisterController {
    @RequestMapping("/login")
    public Object login(HttpServletRequest request, @RequestBody LoginBean loginBean){

        return new ResultBean(null,ResultBean.SUCCESS_OK,null);
    }
}
