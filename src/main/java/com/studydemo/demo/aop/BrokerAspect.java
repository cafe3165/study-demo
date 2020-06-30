package com.studydemo.demo.aop;
import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
@Aspect
@Component
public class BrokerAspect {
    @Pointcut("execution(public * com.studydemo.demo.Controller.TestController1.*(..)))")
    public void BrokerAspect(){

    }
    @Before("BrokerAspect()")
    public void dobefore(){
        System.out.println("before");
    }
    @After("BrokerAspect()")
    public void doAfterGame(){
        System.out.println("经纪人为球星表现疯狂鼓掌！");
    }
    @AfterReturning("BrokerAspect()")
    public void doAfterReturningGame(){
        System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
    }
    @AfterThrowing("BrokerAspect()")
    public void doAfterThrowingGame(){
        System.out.println("异常通知：球迷要求退票！");
    }


}
