package com.sdajava.Horda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/registration").setViewName("register");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/403").setViewName("403");
    }
}