package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.Login1Service;
import com.ayris.ioc.service.Login2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Login2ServiceImpl implements Login2Service {

    @Autowired
    private Login1Service login1Service;

    @Override
    public void login() {
        log.info("this is from login2 login");
        login1Service.loginRefer();
    }

    @Override
    public void loginRefer() {
        log.info("this is from login2 loginRefer");
    }
}
