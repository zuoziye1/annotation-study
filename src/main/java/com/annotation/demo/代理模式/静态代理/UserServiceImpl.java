package com.annotation.demo.代理模式.静态代理;

public class UserServiceImpl implements UserService{

    @Override
    public void saveUser() {
        System.out.println("--保存数据--");

    }

}

