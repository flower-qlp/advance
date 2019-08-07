package com.middle.advanced.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


    /**
     * 加载自定义过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(someFilter());
        registration.addUrlPatterns("/*");
        registration.setName("WebFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean(name = "WebFilter")
    public Filter someFilter() {
        return new WebFilter();
    }
}
