package com.ayris.aopboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class HelloAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("helloAroundAdvice start...");
        invocation.proceed();
        log.info("helloAroundAdvice end...");
        return null;
    }
}
