package com.annotation.demo.代理模式.cglib;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/31 3:16 下午
 * @Description:
 */
import org.junit.Test;

public class TestProxy {

    @Test
    public void testCglibProxy(){
        //目标对象
        UserDao target = new UserDao();
        System.out.println(target.getClass());
        //代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("被代理出来的对象："+proxy.getClass());
        //执行代理对象方法
        proxy.save();
    }
}
