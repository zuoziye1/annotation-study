package com.annotation.demo.自定义注解实现拦截登录;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 姚飞虎
 * @Date: 2020/12/30 5:52 下午
 * @Description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SourceAccessInterceptor())
                .addPathPatterns("/sourceA","/sourceB")
        ;
    }
}
