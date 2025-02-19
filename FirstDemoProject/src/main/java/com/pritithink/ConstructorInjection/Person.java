package com.pritithink.ConstructorInjection;

public class Person {
     private String Name;
     private int Age;
     private Occupation obj;

     public Person(String Name,int Age,Occupation obj){
         this.Name=Name;
         this.Age=Age;
         this.obj=obj;
     }

     public void Display(){
         System.out.println("Name: "+this.Name+" Age: "+this.Age+" Occupation: "+this.obj.getOccupation());
     }
}
