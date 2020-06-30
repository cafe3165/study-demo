package com.studydemo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
@Controller
public class InterceptorTestController {

    @RequestMapping(value = { "/", "/test" })
    public String test(Model model) {

        System.out.println("\n-------- MainController.test --- ");

        System.out.println(" ** You are in Controller ** ");

        return "test";
    }

    // This path is no longer used.
    // It will be redirected by OldLoginInterceptor
    @Deprecated
    @RequestMapping(value = { "/admin/oldLogin" })
    public String oldLogin(Model model) {
        System.out.println("Oldlogin !!!!!!!");
        // Code here never run.
        return "oldLogin";
    }

    @RequestMapping(value = { "/admin/login" })
    public String login(Model model) {

        System.out.println("\n-------- MainController.login --- ");

        System.out.println(" ** You are in Controller ** ");

        return "login";
    }

}
