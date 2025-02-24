package com.pritithink.LifecycleAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Lifecycle1.xml");
       context.registerShutdownHook();
        Example e1=(Example)context.getBean("LifecycleAnnotations");
        System.out.println(e1.getSubject());
    }
}
