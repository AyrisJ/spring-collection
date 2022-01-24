package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl() {
        log.info("HelloServiceImpl create------");
    }

    @Override
    public String sayHello() {
        return "hello";
    }
}
