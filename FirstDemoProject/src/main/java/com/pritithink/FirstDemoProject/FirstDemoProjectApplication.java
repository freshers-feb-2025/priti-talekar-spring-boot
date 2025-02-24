package com.pritithink.FirstDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstDemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		//Setter injection of Primitive
		Student s1=(Student)context.getBean("student1");
		System.out.println(s1);

		Student s2=(Student)context.getBean("student2");
		System.out.println(s2);

		//Setter injection of Collection
        Employee E1=(Employee) context.getBean("Employee1");
		System.out.println(E1);
		System.out.println("Phone Numbers: "+E1.getPhone());

		//setter injection of refernce type
        Second temp=(Second) context.getBean("Second");
		System.out.println(temp.getB());
		System.out.println(temp.getObj().getA());

	}

}
