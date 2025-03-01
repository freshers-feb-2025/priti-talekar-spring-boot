package com.thinkitive.MongodbTask.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDto {
        private String employeeName;
        private String employeeEmail;
        private String departmentId;

    }

