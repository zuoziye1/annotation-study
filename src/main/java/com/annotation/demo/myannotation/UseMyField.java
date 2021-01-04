package com.annotation.demo.myannotation;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 这里展示了注解属性的获取
 * 其实实际当中，也正是反射获取注解的属性，然后进行业务处理的
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:30 下午
 * @Description:
 */
public class UseMyField {

    @MyField(description = "test",length = 100)
    private String name ;

    private int age ;

    @MyField(description = "test-main",length = 21)
    public static void main(String[] args) throws IOException {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Class clazz = UseMyField.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            if(declaredField.isAnnotationPresent(MyField.class)){
                MyField annotation = declaredField.getAnnotation(MyField.class);
                System.out.println(declaredField.getName()+"==注解信息：--"+annotation.description()+"\t"+annotation.length());
            }else {
                System.out.println(declaredField.getName()+"===========没有注解");
            }
        }

        /**
         * 阻塞当前进程，不让其结束
         */
        System.in.read();
    }
}
