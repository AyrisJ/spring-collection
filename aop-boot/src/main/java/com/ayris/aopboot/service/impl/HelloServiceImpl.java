package com.ayris.aopboot.service.impl;

import com.ayris.aopboot.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void helloAround() {
        System.out.println("helloAround is invoked !");
    }
}
