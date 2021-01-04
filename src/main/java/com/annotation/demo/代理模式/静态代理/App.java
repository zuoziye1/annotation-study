package com.annotation.demo.代理模式.静态代理;


public class App {
    public static void main(String[] args){
        // 目标对象
        UserService target=new UserServiceImpl();
        // 代理
        UserService proxy=new UserServiceProxy(target);
        proxy.saveUser(); // 执行的是，代理的方法
    }

}

