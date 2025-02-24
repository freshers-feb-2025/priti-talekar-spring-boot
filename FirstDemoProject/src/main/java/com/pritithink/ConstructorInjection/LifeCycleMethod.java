package com.pritithink.ConstructorInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethod {
    private int number1;
    private int number2;

    public LifeCycleMethod(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }

    public void display(){
        System.out.println(this.number1+" "+this.number2);
    }

    public void init(){
        System.out.println("I am in init");
    }

    public void destroy(){
        System.out.println("I am in destroy");
    }

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Lifecycle.xml");
           LifeCycleMethod l1=(LifeCycleMethod)context.getBean("lifecycle");
           l1.display();
           context.registerShutdownHook();
    }

}
