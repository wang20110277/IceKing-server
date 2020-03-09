package iceking.base.config.interceptor;

import iceking.base.interceptor.CommonInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Value("${open.url}")
    private String openUrl;

    @Bean
    public CommonInterceptor getCommonInterceptor(){
        return new CommonInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getCommonInterceptor()).addPathPatterns("/api/**").excludePathPatterns(openUrl);
    }
}
