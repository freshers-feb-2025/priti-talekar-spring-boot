package com.pritithink.ConstructorInjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Config1.xml");
        Person person=(Person)context.getBean("person");
        person.Display();

    }
}
