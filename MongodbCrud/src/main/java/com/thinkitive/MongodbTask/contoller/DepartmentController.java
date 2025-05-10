package com.thinkitive.MongodbTask.contoller;

import com.thinkitive.MongodbTask.dto.DepartmentRequestDto;
import com.thinkitive.MongodbTask.dto.DepartmentResponseDto;
import com.thinkitive.MongodbTask.service.DepartmentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public String hello(){
        return "Show data";
    }

    @PostMapping
    public DepartmentResponseDto addDepartment(@RequestBody DepartmentRequestDto departmentRequestDto){
        System.out.println("==================");
        return departmentService.addDepartment(departmentRequestDto);
    }

    @GetMapping("/show")
    public List<DepartmentResponseDto> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/{Id}")
    public DepartmentResponseDto getDepartmentById(@PathVariable String Id){
        ObjectId deptId=new ObjectId(Id);
        return departmentService.getDepartmentById(deptId);
    }
}
