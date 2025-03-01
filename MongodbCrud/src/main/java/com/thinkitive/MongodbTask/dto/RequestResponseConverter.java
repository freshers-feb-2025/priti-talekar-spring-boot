package com.thinkitive.MongodbTask.dto;

import com.thinkitive.MongodbTask.entity.Department;
import com.thinkitive.MongodbTask.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class RequestResponseConverter {

    public Employee convertToEntityEmployee(EmployeeRequestDto employeeRequestDto, Department department){
        return Employee.builder()
                .employeeName(employeeRequestDto.getEmployeeName())
                .employeeEmail(employeeRequestDto.getEmployeeEmail())
                .departmentId(department)
                .build();
    }

    public EmployeeResponseDto convertToResponseDTOEmployee(Employee employee){
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setEmployeeId(employee.getEmployeeId().toString()); // Convert ObjectId to String
        employeeResponseDto.setEmployeeName(employee.getEmployeeName());
        employeeResponseDto.setEmployeeEmail(employee.getEmployeeEmail());

        if (employee.getDepartmentId() != null) {
            Department department = employee.getDepartmentId();
            DepartmentResponseDto departmentResponseDto = convertToResponseDTODepartment(department);
            employeeResponseDto.setDepartment(departmentResponseDto);  // Set department in response DTO
        }

        return employeeResponseDto;
    }

    public Department convertToEntityDepartment(DepartmentRequestDto departmentRequestDto){
        return Department.builder()
                .departmentId(departmentRequestDto.getDepartmentId()) // Ensure correct data types
                .departmentName(departmentRequestDto.getDepartmentName())
                .location(departmentRequestDto.getLocation())
                .build();
    }

    public DepartmentResponseDto convertToResponseDTODepartment(Department department){
        return DepartmentResponseDto.builder()
                .departmentId(department.getDepartmentId().toString()) // Convert ObjectId to String
                .departmentName(department.getDepartmentName())
                .location(department.getLocation())
                .build();
    }
}
