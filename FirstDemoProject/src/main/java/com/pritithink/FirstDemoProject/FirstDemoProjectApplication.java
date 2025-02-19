package com.pritithink.FirstDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstDemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		Student s1=(Student)context.getBean("student1");
		System.out.println(s1);
	}

}
