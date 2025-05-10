package com.thinkiitve.MongodbCrud.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Builder
@Getter
@Setter
public class StudentResponseDTO {
//    private ObjectId studentId;

    private String studentName;
    private String studentCity;
    private String studentCollege;

}
