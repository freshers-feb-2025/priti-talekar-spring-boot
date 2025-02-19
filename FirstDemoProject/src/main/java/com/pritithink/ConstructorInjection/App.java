package com.pritithink.ConstructorInjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Config1.xml");
        Person person1=(Person)context.getBean("person");
        person1.Display();
    }
}
