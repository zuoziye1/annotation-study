package com.annotation.demo.代理模式.静态代理;

/**
 * 代理对象(静态代理)
 * 	   代理对象，要实现与目标对象一样的接口
 * @author
 *
 */
public class UserServiceProxy implements UserService{
    // 接收保存目标对象
    private UserService target;

    public UserServiceProxy(UserService target){
        this.target=target;
    }

    @Override
    public void saveUser() {
        System.out.println("--开启事物--");
        target.saveUser();// 执行目标对象的方法
        System.out.println("--提交事务--");
    }

}

