package com.xuyifan.dspmanager.controller;

import com.xuyifan.dspmanager.bean.User;
import com.xuyifan.dspmanager.service.UserService;
import com.xuyifan.dspmanager.util.ReadExcel;
import com.xuyifan.dspmanager.viewbean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@RestController
public class TestController {
/*    @Autowired
    private UserService userService;

    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring() {
        System.out.println("hello spring boot");
        return "hello spring boot";
    }

    @RequestMapping("/getuserList")
    public Object getUserList() {
        List<User> userList = userService.getUserList();
        ResultBean re = new ResultBean(userList);
        return re;
    }

    @RequestMapping(value = "/getuserList", method = RequestMethod.POST)
    public Object getUserList(Integer id) {
        System.out.println(id);
        List<User> userList = userService.getUserList();
        ResultBean re = new ResultBean(userList);
        return re;
    }

    @RequestMapping(value = "/getfile", method = RequestMethod.POST)
    public Object getfile(@RequestParam("file") MultipartFile file,
                          HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);
//	String filePath = request.getSession().getServletContext().getRealPath("templates/imgupload/");
        //指定文件存放路径，可以是相对路径或者绝对路径
        String filePath = "f:/xuyifan422/";
        try {
            uploadFile(file.getBytes(), filePath, fileName);
            System.out.println("dfdfd");
            File targetFile = new File(filePath+fileName);
            ReadExcel readExcel=new ReadExcel();
            List list = readExcel.readExcel(targetFile);
            for (Object o : list) {
                List item=(List)o;
                for (Object o1 : item) {
                    List res=(List)o;
                    System.out.println(res.get(1)+":"+res.get(2));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("nihao");
        }

        return ResultBean.SUCESS;
    }*/

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
