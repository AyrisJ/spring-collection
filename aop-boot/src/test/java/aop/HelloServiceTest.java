package aop;

import com.ayris.aopboot.aop.HelloAroundAdvice;
import com.ayris.aopboot.service.HelloService;
import com.ayris.aopboot.service.impl.HelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.cglib.core.DebuggingClassWriter;

public class HelloServiceTest {

    @Test
    public void createAround() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "class/aop");
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new HelloServiceImpl());
        proxyFactory.addAdvice(new HelloAroundAdvice());

        HelloService helloService = (HelloService) proxyFactory.getProxy();
        helloService.helloAround();
    }


}
