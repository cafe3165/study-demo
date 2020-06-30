package com.studydemo.demo.Bean;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Data
public class User {
    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();
    private String name ;
    private int age;



}
