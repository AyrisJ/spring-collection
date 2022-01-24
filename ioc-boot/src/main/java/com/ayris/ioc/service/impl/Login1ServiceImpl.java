package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.Login2Service;
import com.ayris.ioc.service.Login1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Login1ServiceImpl implements Login1Service {

    public Login1ServiceImpl() {
        log.info("Login1ServiceImpl create-------");
    }

    @Autowired
    private Login2Service login2Service;

    @Override
    public void login() {
        log.info("this is from login1 login");
        login2Service.loginRefer();
    }

    @Override
    public void loginRefer() {
        log.info("this is from login1 loginRefer");
    }
}
