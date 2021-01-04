package com.annotation.demo.myannotation;

import java.lang.annotation.*;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:28 下午
 * @Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface MyField {

    String description() ;

    int length() ;
}
