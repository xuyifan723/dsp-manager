package com.xuyifan.dspmanager.util;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.StringUtil;
import org.springframework.http.HttpRequest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Classname CookieUtil
 * @Description TODO
 * @Date 2019/7/8 0008 上午 10:31
 * @Created by XUYIFAN723
 */
public class CookieUtil {
 public static String getUser(HttpServletRequest request){
     Cookie[] cookies = request.getCookies();
     String userValue="";
     for (Cookie cookie : cookies) {
         if (cookie.getName().equals("Data_User")){
              userValue = AESUtil.decrypt(cookie.getValue());
         }
     }
     String userName="";
     if (!StringUtils.isEmpty(userValue)){
         String[] userInfo = userValue.split("__");
          userName =userInfo[0];
         String loginTime = userInfo[1];
     }
     return userName;
 }

}
