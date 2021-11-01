package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        log.info("sayHello");
        return "hello";
    }
}
