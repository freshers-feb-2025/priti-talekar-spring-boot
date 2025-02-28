package com.thinkiitve.MongodbCrud.DTO;

import com.thinkiitve.MongodbCrud.Entity.Student;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Builder
@Getter
@Setter
public class StudentRequestDTO {
    private ObjectId studentId;
    private String studentName;
    private String studentCity;
    private String studentCollege;

}

