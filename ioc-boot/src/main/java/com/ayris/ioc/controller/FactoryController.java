package com.ayris.ioc.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @GetMapping("getBean")
    public String getBean(String beanName) {
        if (applicationContext.containsBean(beanName)) {
            Object object = applicationContext.getBean(beanName);
            return "success";
        }else{
            return "not found bean";
        }
    }
}
