package com.studydemo.demo.Controller;

import com.studydemo.demo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
@RestController
@RequestMapping(value = "/account")
public class TansactionTest {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/transfer")
//    @Transactional(rollbackFor = Exception.class)
    public String test() {
        try {
            accountService.transfer(1, 2, 50);
            return "succes";
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }


}
