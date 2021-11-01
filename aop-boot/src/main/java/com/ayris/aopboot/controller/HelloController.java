package com.ayris.aopboot.controller;

import com.ayris.aopboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("helloAround")
    public void helloAround() {
        helloService.helloAround();
    }

}
