package com.studydemo.demo.Controller;

import com.studydemo.demo.Config.TestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-24
 */
@RestController
public class BeantestController {
    @Autowired
    TestConfiguration testConfiguration;

    @RequestMapping("/testBean")

    public void test() {

        testConfiguration.testBean().sayHello();

    }


}
