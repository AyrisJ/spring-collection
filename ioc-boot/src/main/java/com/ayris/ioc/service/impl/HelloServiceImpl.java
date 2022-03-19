package com.ayris.ioc.service.impl;

import com.ayris.ioc.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private String helloTips;

    private Integer number;

    @PostConstruct
    public void init() {
        number = 10;
    }

    public HelloServiceImpl() {
        log.info("HelloServiceImpl create------number=" + number);
    }

    @Override
    public String sayHello() {
        return "hello " + helloTips + ", number=" + number;
    }
}
