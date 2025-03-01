package com.thinkitive.MongodbTask.contoller;

import com.thinkitive.MongodbTask.dto.EmployeeRequestDto;
import com.thinkitive.MongodbTask.dto.EmployeeResponseDto;
import com.thinkitive.MongodbTask.entity.Employee;
import com.thinkitive.MongodbTask.service.EmployeeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp")
    public String show(){
        return "Hello ";
    }

    //Error.
    @GetMapping("/{employeeId}")
    public EmployeeResponseDto findEmployeeById(@PathVariable String employeeId){
        ObjectId employeId=new ObjectId(employeeId);
        return employeeService.getEmployeeById(employeId);
    }

    @GetMapping("/employee")
    public List<EmployeeResponseDto> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/add")
    public EmployeeResponseDto addEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
           return employeeService.addEmployee(employeeRequestDto);
    }


}
