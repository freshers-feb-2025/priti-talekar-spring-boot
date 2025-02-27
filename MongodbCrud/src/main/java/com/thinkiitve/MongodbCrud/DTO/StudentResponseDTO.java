package com.thinkiitve.MongodbCrud.DTO;

import org.bson.types.ObjectId;

public class StudentResponseDTO {
    private ObjectId studentId;

    private String stduentName;
    private String stdudentCity;
    private String studentCollege;

    public ObjectId getStudentId() {
        return studentId;
    }

    public void setStudentId(ObjectId studentId) {
        this.studentId = studentId;
    }

    public String getStduentName() {
        return stduentName;
    }

    public void setStduentName(String stduentName) {
        this.stduentName = stduentName;
    }

    public String getStdudentCity() {
        return stdudentCity;
    }

    public void setStdudentCity(String stdudentCity) {
        this.stdudentCity = stdudentCity;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }
}
