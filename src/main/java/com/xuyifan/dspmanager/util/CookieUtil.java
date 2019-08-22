package com.xuyifan.dspmanager.util;

import com.sun.istack.internal.FinalArrayList;
import com.xuyifan.dspmanager.exception.DspException;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.StringUtil;
import org.springframework.http.HttpRequest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname CookieUtil
 * @Description TODO
 * @Date 2019/7/8 0008 上午 10:31
 * @Created by XUYIFAN723
 */
public class CookieUtil {
    //存用户的cookie名称
    public static final String USER_COOKIE_NAME = "Data_User";
    //用户存的过期时间为30分钟
    public static final Long EXPIRE_TIME = 1000 * 60 * 30L;

    /**
     * 从cookie里面拿出具体cookie的值
     *
     * @param name
     * @param request
     * @return
     */
    public static String getCookie(String name, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String userValue = "";
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) {
                userValue = AESUtil.decrypt(cookie.getValue());
                break;
            }
        }
        return userValue;
    }

    /**
     * 从cookie里面拿出用户信息
     *
     * @param request
     * @return
     */
    public static String getUser(HttpServletRequest request) {
        String userValue = getCookie(USER_COOKIE_NAME, request);
        String userName = "";
        if (!StringUtils.isEmpty(userValue)) {
            String[] userInfo = userValue.split("_");
            userName = userInfo[0];
            Long loginTime = Long.valueOf(userInfo[1]);
            boolean flag = System.currentTimeMillis() - EXPIRE_TIME > loginTime;
            if (!flag) {
                throw new DspException("user is expire,please login");
            }
        }
        return userName;
    }

    /**
     * 验证用户信息是否过期
     *
     * @param request
     * @return
     */
    public static boolean validateUser(HttpServletRequest request) {
        String userValue = getCookie(USER_COOKIE_NAME, request);
        boolean flag = false;
        if (!StringUtils.isEmpty(userValue)) {
            String[] userInfo = userValue.split("__");
            Long loginTime = Long.valueOf(userInfo[1]);
            flag = System.currentTimeMillis() - EXPIRE_TIME > loginTime;
        }
        return flag;
    }

    /**
     * 往cookie里面添加用户信息
     *
     * @param response
     * @param username
     */
    public static void addUser(HttpServletResponse response, String username) {
        String userInfo = username + "__" + System.currentTimeMillis();
        Cookie cookie = new Cookie(USER_COOKIE_NAME, userInfo);
        response.addCookie(cookie);
    }

}
