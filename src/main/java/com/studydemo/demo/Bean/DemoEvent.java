package com.studydemo.demo.Bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Author:cafe3165
 * Date:2020-04-03
 */
//@Component
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String message;

    public DemoEvent( Object source, String message){
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
