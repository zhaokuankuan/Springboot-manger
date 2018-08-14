package com.kk.Springbootmanger.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author :Mr.kk
 * @date: 2018/8/14-13:39
 */
public class MyFilter implements Filter {

    private static final Log log = LogFactory.getLog(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器start执行===============》");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpSession session =  httpServletRequest.getSession();
        if(session!=null){
            log.info("当前为已登录状态！"+"当前的拦截的路径是"+ httpServletRequest.getRequestURI());
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            log.info("当前为未登录状态！");
        }
    }

    public void destroy() {
        log.info("过滤器销毁执行===============》");
    }
}
