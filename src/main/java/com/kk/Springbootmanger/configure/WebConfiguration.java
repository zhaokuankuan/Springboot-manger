package com.kk.Springbootmanger.configure;

import com.kk.Springbootmanger.common.MyFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :Mr.kk
 * @date: 2018/8/14-13:47
 * Filter加载的配置文件
 */
@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();     //创建一个过滤器的实体类
        registration.setFilter(new MyFilter());                                 //set过滤器的拦截
        registration.addUrlPatterns("/*");                                      //set过滤的请求
        registration.addInitParameter("paramName", "paramValue"); //
        registration.setName("MyFilter");                                       //set过滤器的名称
        registration.setOrder(1);                                               //set过滤器的优先级别
        return registration;
    }
}
