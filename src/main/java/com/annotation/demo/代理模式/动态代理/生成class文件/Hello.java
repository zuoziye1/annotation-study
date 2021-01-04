package com.annotation.demo.代理模式.动态代理.生成class文件;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/31 3:54 下午
 * @Description:
 */
public class Hello implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Hello,world!");
    }
}
