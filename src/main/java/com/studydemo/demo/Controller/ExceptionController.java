package com.studydemo.demo.Controller;

import com.studydemo.demo.Exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/illegalArgumentException")
    public void throwException() {
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2() {
        throw new ResourceNotFoundException();
    }
}
