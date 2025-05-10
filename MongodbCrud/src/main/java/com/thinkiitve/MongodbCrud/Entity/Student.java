package com.thinkiitve.MongodbCrud.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

    @Id
    private ObjectId studentId;
    private String studentName;
    private String studentCity;
    private String studentCollegeName;


    public ObjectId getStudentId() {
        return studentId;
    }

    public void setStudentId(ObjectId studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentCollegeName() {
        return studentCollegeName;
    }

    public void setStudentCollegeName(String studentCollegeName) {
        this.studentCollegeName = studentCollegeName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + studentId + ", name='" + studentName + '\'' + ", city='" + studentCity + '\'' + ", college='" + studentCollegeName + '\'' + '}';
    }


}
