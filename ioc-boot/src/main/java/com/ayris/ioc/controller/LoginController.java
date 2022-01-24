package com.ayris.ioc.controller;

import com.ayris.ioc.service.HelloService;
import com.ayris.ioc.service.Login1Service;
import com.ayris.ioc.service.Login2Service;
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
    private Login1Service login1Service;

    @Autowired
    private Login2Service login2Service;

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

    @GetMapping("login1")
    public void login1() {
        login1Service.login();
    }

    @GetMapping("login2")
    public void login2() {
        login2Service.login();
    }
}
