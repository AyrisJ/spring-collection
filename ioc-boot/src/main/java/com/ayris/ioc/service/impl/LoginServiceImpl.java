package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Override
    public void login() {
        log.info("login success");
    }
}
