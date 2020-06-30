package com.studydemo.demo.Controller;

import com.studydemo.demo.Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
@RestController
@RequestMapping("/aopController")

public class TestController1 {
    @Autowired
    User user;
    @GetMapping(value ="/hello")
    public String hello() {
        user.setAge(11);
        System.out.println(user.getAge());
        return "hello";
    }

    @RequestMapping(value = "/Curry")
    public void Curry() {
        System.out.println(user.getAge());
        System.out.println("库里上场打球了！！");
    }

    @RequestMapping(value = "/Harden")
    public void Harden() {
        System.out.println("哈登上场打球了！！");
    }

    @RequestMapping(value = "/Antetokounmpo")
    public void Antetokounmpo() {
        System.out.println("字母哥上场打球了！！");
    }

    @RequestMapping(value = "/Jokic")
    public void Jokic() {
        System.out.println("约基奇上场打球了！！");
    }

    @RequestMapping(value = "/Durant/{point}")
    public void Durant(@PathVariable("point") int point) {
        System.out.println("杜兰特上场打球了！！");
    }
}



