package iceking.base.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(urlPatterns = "/api/*" ,filterName = "commonFilter")
//@Order(1)
public class CommonFilter implements Filter {
    @Value("${open.url}")
    private String openUrl;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init one CommonFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        String url=httpServletRequest.getRequestURI();
        String method=httpServletRequest.getMethod();
        System.out.println("请求的接口："+url+"请求的方法："+method);
        //判断是否通过验证
        PathMatcher pathMatcher= new AntPathMatcher();
        if(pathMatcher.match(openUrl,url)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            if(StringUtils.isEmpty(httpServletRequest.getHeader("token"))){
                httpServletRequest.getRequestDispatcher("/open/logout").forward(servletRequest,servletResponse);
            }else {
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy one CommonFilter");
    }
}
