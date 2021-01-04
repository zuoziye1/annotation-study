package com.annotation.demo.代理模式.动态代理;

import org.junit.Test;

/**
 * 参考：https://segmentfault.com/a/1190000011291179
 * @Author: 姚飞虎
 * @Date: 2020/12/31 3:03 下午
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        /**
         * jdk 的动态代理 生成动态代理类，可以看到class文件
         */
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        IUserDao target = new UserDao();
        System.out.println(target.getClass());  //输出目标对象信息
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());  //输出代理对象信息
        proxy.save();  //执行代理方法
    }
}
