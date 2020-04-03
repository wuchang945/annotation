package com.demo.interceptor;

import com.demo.annotation.LoginRequire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version: 1.0
 * @Description: MyInterceptor
 * @Author: wuchang
 * @Date: 2020/04/02 16:01
 **/
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //可以根据sessionId 先判断是否已经登录 若登录不拦截注解 反之
        HandlerMethod method = (HandlerMethod)handler;
        LoginRequire annotation = method.getMethod().getAnnotation(LoginRequire.class);
        if(annotation == null || annotation.require()){
            return true;
        } else {
            response.getWriter().append("{code:400,message:请登录后再操作！！！}");
            return false;
        }

    }
}
