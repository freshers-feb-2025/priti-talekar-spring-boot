package com.thinkitive.MongodbTask.service;

import com.thinkitive.MongodbTask.dto.DepartmentRequestDto;
import com.thinkitive.MongodbTask.dto.DepartmentResponseDto;
import com.thinkitive.MongodbTask.dto.RequestResponseConverter;
import com.thinkitive.MongodbTask.entity.Department;
import com.thinkitive.MongodbTask.repository.DepartmentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DepartmentService {

        @Autowired
        private DepartmentRepository departmentRepository;

        @Autowired
        private RequestResponseConverter requestResponseConverter;

        public DepartmentResponseDto addDepartment(DepartmentRequestDto departmentRequestDto){
            System.out.println("=================== 1");
            Department department=requestResponseConverter.convertToEntityDepartment(departmentRequestDto);
            System.out.println("=================== 2");
            Department savedDeapartment=departmentRepository.save(department);
            System.out.println("================= 3");
            return requestResponseConverter.convertToResponseDTODepartment(savedDeapartment);
        }

        public List<DepartmentResponseDto> getDepartments(){
          return departmentRepository.findAll().stream().map(requestResponseConverter::convertToResponseDTODepartment)
                  .collect(Collectors.toList());
        }

        public DepartmentResponseDto getDepartmentById(ObjectId id){
           Optional<Department>department= departmentRepository.findById(id);
           return department.map(requestResponseConverter::convertToResponseDTODepartment).orElse(null);
        }

    }
