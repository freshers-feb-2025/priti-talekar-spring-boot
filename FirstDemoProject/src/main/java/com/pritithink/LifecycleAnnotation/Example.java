package com.pritithink.LifecycleAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    public String Subject;

//    public Example(String Subject){
//        this.Subject=Subject;
//    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
    public void display(){
        System.out.println("Subject: "+this.Subject);
    }

   @PostConstruct
    public void newinit(){
        System.out.println("Starting.....");
    }

    @PreDestroy
    public void newdestoy(){
        System.out.println("Ending......");
    }
}
