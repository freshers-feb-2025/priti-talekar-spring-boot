package com.thinkiitve.MongodbCrud.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudentResponseDTO {
//    private ObjectId studentId;

    private String studentName;
    private String studentCity;
    private String studentCollege;

}
