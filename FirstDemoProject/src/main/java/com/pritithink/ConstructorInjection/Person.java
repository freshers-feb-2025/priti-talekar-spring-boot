package com.pritithink.ConstructorInjection;

public class Person {
     private String name;
     private int age;
     private Occupation obj;

     public Person(String name,int age,Occupation obj){
         this.name=name;
         this.age=age;
         this.obj=obj;
     }

     public void Display(){
         System.out.println("Name: "+this.name+" Age: "+this.age+" Occupation: "+this.obj.getOccupation());
     }
}
