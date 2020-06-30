package com.studydemo.demo.Config;

import com.studydemo.demo.Interceptor.AdminInterceptor;
import com.studydemo.demo.Interceptor.LogInterceptor;
import com.studydemo.demo.Interceptor.OldLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // LogInterceptor apply to all URLs.
        registry.addInterceptor(new LogInterceptor());

        // Old Login url, no longer use.
        // Use OldURLInterceptor to redirect to a new URL.
        registry.addInterceptor(new OldLoginInterceptor())//
                .addPathPatterns("/admin/oldLogin");

        // This interceptor apply to URL like /admin/*
        // Exclude /admin/oldLogin
        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/admin/*")//
                .excludePathPatterns("/admin/oldLogin");
    }

}