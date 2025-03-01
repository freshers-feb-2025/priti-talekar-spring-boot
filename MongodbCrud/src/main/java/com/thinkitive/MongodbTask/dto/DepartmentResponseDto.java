package com.thinkitive.MongodbTask.dto;

import lombok.*;
import org.bson.types.ObjectId;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentResponseDto {
    private String departmentId;
    private String departmentName;
    private String location;
}
