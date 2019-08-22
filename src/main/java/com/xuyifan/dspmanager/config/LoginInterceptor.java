package com.xuyifan.dspmanager.config;

import com.xuyifan.dspmanager.annotation.IgnoreSecurity;
import com.xuyifan.dspmanager.exception.UserException;
import com.xuyifan.dspmanager.util.CookieUtil;
import com.xuyifan.dspmanager.util.TokenUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * @Classname LoginInterceptor
 * @Description TODO
 * @Date 2019/7/8 0008 上午 11:28
 * @Created by XUYIFAN723
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        String requestPath = request.getRequestURI();
        if (method.isAnnotationPresent(IgnoreSecurity.class)) {
            return true;
        }
        String token = request.getHeader(TokenUtils.TOKEN_NAME);
        if (StringUtils.isEmpty(token)) {
            throw  new UserException("没有登陆");
        }
        request.setAttribute("currentUser", token);
      return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,  Exception ex) throws Exception {
    }

}
