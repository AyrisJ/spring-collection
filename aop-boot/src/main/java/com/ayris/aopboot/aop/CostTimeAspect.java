package com.ayris.aopboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Slf4j
@Aspect
@Service
public class CostTimeAspect {

    @Pointcut("execution(* com.ayris.aopboot.service.impl.HelloServiceImpl.helloAround())")
    public void aroundPointcut() {
    }

    @Around(value = "aroundPointcut()")
    public void aroundAdviceTest(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        log.info("around hello: {}", start);

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            log.error("error:", throwable);
        }
        long end = System.currentTimeMillis();
        log.info("around bye bye: {}", end);
        log.info("around cost time: {}", end - start);
    }

}
