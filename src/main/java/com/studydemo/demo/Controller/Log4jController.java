package com.studydemo.demo.Controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
@RestController
public class Log4jController {
    static Logger logger = Logger.getLogger(Log4jController.class);
    @RequestMapping("/log")
    public void test1() throws InterruptedException {
//        BasicConfigurator.configure();
        PropertyConfigurator.configure("log4j.properties");
        for (int i = 0; i < 5000; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }

    }

//    @RequestMapping（"mylog")
//    public void test2(){
//
//    }

}
