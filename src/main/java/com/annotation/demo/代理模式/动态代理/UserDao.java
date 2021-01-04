package com.annotation.demo.代理模式.动态代理;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/31 2:59 下午
 * @Description:
 */
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
