package com.studydemo.demo.Bean;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    //使用onApplicationEvent接收消息
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMessage();
        System.out.println("接收到的信息是：" + msg);
    }
}
