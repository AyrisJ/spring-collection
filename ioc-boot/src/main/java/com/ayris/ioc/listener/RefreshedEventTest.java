package com.ayris.ioc.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * run->refreshContext->refresh->finishRefresh->publishEvent->multicastEvent
 * */
@Component
public class RefreshedEventTest implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("ContextRefreshedEvent happen-----------");
    }
}
