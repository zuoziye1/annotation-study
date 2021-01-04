package com.annotation.demo.自定义注解实现拦截登录;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:45 下午
 * @Description:
 */
public @interface LoginRequired {

    boolean required() default false ;
}
