package com.thinkitive.MongodbTask.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    private ObjectId employeeId;
    private String employeeName;
    private String employeeEmail;
    @DBRef
    private Department departmentId;
}
