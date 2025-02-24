package com.springthink.learn_spring_framework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args)
	{
		var context=new AnnotationConfigApplicationContext(Person.class);
		System.out.println(context.getBean("Name"));
		System.out.println(context.getBean("age"));
		//to string method called automatically
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("ADDRESS"));
		//if multiple matching beans available then use @primary
		System.out.println(context.getBean(Empolyee.class));
	}

}
