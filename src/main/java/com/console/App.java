package com.console;

import com.console.service.TestService;
import com.init.JavaConfig;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        TestService testService = (TestService) context.getBean("testServiceImpl");
        testService.test();
    }
}
