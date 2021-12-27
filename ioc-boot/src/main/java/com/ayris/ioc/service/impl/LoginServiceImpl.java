package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.HelloService;
import com.ayris.ioc.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private HelloService helloService;

    @Override
    public void login() {
        helloService.sayHello();
    }
}
