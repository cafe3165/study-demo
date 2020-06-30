package com.studydemo.demo.Controller;

import com.studydemo.demo.Bean.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
@RestController
public class EventController {
    @Autowired
    DemoPublisher demoPublisher;
    @GetMapping("/event")
    public void call() {
demoPublisher.publish("6666");
    }
}
