package com.annotation.demo.controller;

import com.annotation.demo.自定义注解实现切面.MyLog;
import com.annotation.demo.自定义注解实现拦截登录.LoginRequired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:54 下午
 * @Description:
 */

@RestController
public class HelloController {

    @GetMapping("/sourceA")
    public String sourceA(){
        return "你正在访问sourceA资源";
    }

    @LoginRequired(required = true)
    @GetMapping("/sourceB")
    public String sourceB(){
        return "你正在访问sourceB资源";
    }

    @MyLog
    @GetMapping("/log")
    public String log(){
        return "log";
    }


    public static void main(String[] args) {
        System.out.println("---------------->");
    }
}
