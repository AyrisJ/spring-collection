package com.ayris.ioc;

import com.ayris.ioc.compent.TestBean2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages = "com.ayris.ioc", excludeFilters = {@ComponentScan.Filter(
        type = FilterType.CUSTOM,
        classes = {TypeExcludeFilter.class}
), @ComponentScan.Filter(
        type = FilterType.CUSTOM,
        classes = {AutoConfigurationExcludeFilter.class}
), @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        classes = {TestBean2.class}
)
})
@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocApplication.class, args);
    }

}
