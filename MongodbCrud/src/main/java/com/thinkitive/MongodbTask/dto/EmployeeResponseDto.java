package com.thinkitive.MongodbTask.dto;

import com.thinkitive.MongodbTask.entity.Department;
import lombok.*;
import org.bson.types.ObjectId;
//@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {
        private String employeeId;
        private String employeeName;
        private String employeeEmail;
        private DepartmentResponseDto department;
    }

