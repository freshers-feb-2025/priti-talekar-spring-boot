package com.thinkitive.MongodbTask.dto;

import com.thinkitive.MongodbTask.entity.Department;
import lombok.*;
import org.bson.types.ObjectId;

//@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDto {
//        private ObjectId employeeId;
        private String employeeName;
        private String employeeEmail;
        private String departmentId;

    }

