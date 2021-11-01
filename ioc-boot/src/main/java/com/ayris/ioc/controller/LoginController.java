package com.ayris.ioc.controller;

import com.ayris.ioc.service.HelloService;
import com.ayris.ioc.service.LoginService;
import com.ayris.ioc.service.impl.HelloServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements ApplicationContextAware {

    @Autowired
    private LoginService loginService;

    @Autowired
    private HelloService helloService;

    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @GetMapping("sayHello")
    public String sayHello() {
        HelloService helloServiceRef = applicationContext.getBean("helloServiceImpl", HelloServiceImpl.class);
        return helloService.sayHello();
    }

    @GetMapping("login")
    public void login() {
        loginService.login();
    }
}
