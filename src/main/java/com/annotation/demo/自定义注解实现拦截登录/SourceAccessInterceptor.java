package com.annotation.demo.自定义注解实现拦截登录;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:51 下午
 * @Description:
 */
public class SourceAccessInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("--------------->拦截器入口");

        // 反射获取方法上的LoginRequred注解
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        LoginRequired loginRequired = handlerMethod.getMethod().getAnnotation(LoginRequired.class);
        if(loginRequired != null && loginRequired.required()){
            // 做登录的验证业务逻辑
            System.out.println("===========>验证登录");
            return true;
        }

        // 有LoginRequired注解说明需要登录，提示用户登录
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
