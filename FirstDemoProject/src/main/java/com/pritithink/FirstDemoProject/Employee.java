package com.pritithink.FirstDemoProject;
import java.util.*;
public class Employee {

    private String Name;
    private List<String> Phone;
    private Set<String> Address;
    private Map<String,String>Course;

    public Employee(){
        super();
    }

    public Employee(String name, List<String> phone, Set<String> address, Map<String, String> course) {
        Name = name;
        Phone = phone;
        Address = address;
        Course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getPhone() {
        return Phone;
    }

    public void setPhone(List<String> phone) {
        Phone = phone;
    }

    public Set<String> getAddress() {
        return Address;
    }

    public void setAddress(Set<String> address) {
        Address = address;
    }

    public Map<String, String> getCourse() {
        return Course;
    }

    public void setCourse(Map<String, String> course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Phone=" + Phone +
                ", Address=" + Address +
                ", Course=" + Course +
                '}';
    }
}
