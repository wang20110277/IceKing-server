package iceking.base.config.filter;

import iceking.base.filter.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public CommonFilter getCommmonFilter(){
        return new CommonFilter();
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(CommonFilter commonFilter){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(commonFilter);
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/api/*");
        filterRegistrationBean.setName("commonFilter");
        return filterRegistrationBean;
    }
}
