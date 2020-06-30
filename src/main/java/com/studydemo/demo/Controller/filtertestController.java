package com.studydemo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-27
 */
@RestController
@RequestMapping("/fil")
public class filtertestController {
    @RequestMapping("/test1")
    public String test(){
        System.out.println("method in controller");
        return "test1";
    }
}
