package com.xuyifan.dspmanager.controller;

import com.xuyifan.dspmanager.bean.User;
import com.xuyifan.dspmanager.service.UserService;
import com.xuyifan.dspmanager.viewbean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }
    @RequestMapping("/getuserList")
    public Object getUserList(){
        List<User> userList = userService.getUserList();
        ResultBean re=new ResultBean(userList);
        return re;
    }
    @RequestMapping(value = "/getuserList",method = RequestMethod.POST)
    public Object getUserList(Integer id){
        System.out.println(id);
        List<User> userList = userService.getUserList();
        ResultBean re=new ResultBean(userList);
        return re;
    }
}
