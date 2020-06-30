package com.studydemo.demo.Filter;

//import java.util.logging.Filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
@Order(2)
@WebFilter(filterName = "second", urlPatterns = "/fil/*")
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("seconde filter 1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("seconde filter 2");
    }

    @Override
    public void destroy() {

    }
}
