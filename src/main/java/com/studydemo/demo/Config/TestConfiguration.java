package com.studydemo.demo.Config;

import com.studydemo.demo.Bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Author:cafe3165
 * Date:2020-04-24
 */
@Configuration
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("config初始化");
    }
    // @Bean注解注册bean,同时可以指定初始化和销毁方法
    @Bean
    @Scope("prototype")
    public TestBean testBean() {
        return new TestBean();
    }
}
