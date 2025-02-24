package com.springthink.learn_spring_framework;


import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String City,String Country){ };
record Empolyee(String Name,int age,Address address){};

@Configuration
public class Person {

    @Bean
    public String Name(){
        return "Priti";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean(name="ADDRESS")
    public Address address(){
        return new Address("pune","India");
    }

    @Bean

    public Empolyee empolyee(){
        //existing beans are used to create new Bean
        return new Empolyee(Name(),age(),address());
    }

    @Bean
    @Primary
    public Empolyee empolyee1(){
        return new Empolyee("Radha",26,new Address("delhi","India"));
    }


}
