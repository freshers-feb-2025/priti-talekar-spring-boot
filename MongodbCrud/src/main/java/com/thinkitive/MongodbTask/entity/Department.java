package com.thinkitive.MongodbTask.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Department")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Department {
    @Id
    private ObjectId departmentId;
    private String departmentName;
    private String location;
}
