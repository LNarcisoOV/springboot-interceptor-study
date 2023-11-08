package com.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import com.interceptor.service.ProductInterceptor;


@Component
public class ProductInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private ProductInterceptor productServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(productServiceInterceptor);
    }
}
