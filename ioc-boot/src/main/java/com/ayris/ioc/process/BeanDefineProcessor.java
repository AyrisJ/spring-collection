package com.ayris.ioc.process;

import com.ayris.ioc.compent.TestBean1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 即使Processor返回null，容器中也存在Bean的定义
 */
@Component
public class BeanDefineProcessor implements BeanPostProcessor, ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean1) {
            // 返回null，将跳过后续Processor链处理
            return null;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean1) {
            // 返回null，将跳过后续Processor链处理
            return null;
        }
        return bean;
    }
}
