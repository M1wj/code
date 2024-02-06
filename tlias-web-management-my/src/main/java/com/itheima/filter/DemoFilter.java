package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/depts/*")
public class DemoFilter implements Filter {
    @Override // 初始化方法 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }

    @Override // 拦截到请求之后调用 调用多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截到了请求");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("拦截到了请求 放行后逻辑");
    }

    @Override // 销毁方法 只调用一次
    public void destroy() {
        System.out.println("destory 销毁方法执行了");
    }
}
