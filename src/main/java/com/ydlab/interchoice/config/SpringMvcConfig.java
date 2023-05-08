package com.ydlab.interchoice.config;

import com.ydlab.interchoice.interceptor.ActionInterceptor;
import com.ydlab.interchoice.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    LoginInterceptor loginInterceptor;

    @Resource
    ActionInterceptor actionInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(
                    "/login",
                   "/logout/*",
                    "/register",
                        "/*/save"
                );

        registry.addInterceptor(actionInterceptor)
                .addPathPatterns(

                        "/*/delete/**",
                        "/*/reset-password");
    }
}
