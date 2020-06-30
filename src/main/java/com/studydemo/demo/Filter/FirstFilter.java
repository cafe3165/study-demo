package com.studydemo.demo.Filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.ws.WebFault;
import java.io.IOException;

/**
 * Author:cafe3165
 * Date:2020-04-27
 */
@Order(1)
@WebFilter(filterName = "first",urlPatterns = "/fil/*")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("first filter 1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("first filter 2");
    }

    @Override
    public void destroy() {

    }
}
