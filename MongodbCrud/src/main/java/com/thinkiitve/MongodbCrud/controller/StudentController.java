package com.thinkiitve.MongodbCrud.controller;

import com.thinkiitve.MongodbCrud.Entity.Student;
import com.thinkiitve.MongodbCrud.dto.StudentRequestDTO;
import com.thinkiitve.MongodbCrud.dto.StudentResponseDTO;
import com.thinkiitve.MongodbCrud.service.StudentServiceImp;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceIMP;

    @GetMapping
    public List<StudentResponseDTO> getStudents(){
        return  studentServiceIMP.getStudents();
    }

    @PostMapping
    public StudentResponseDTO addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        return studentServiceIMP.addStudent(studentRequestDTO);
    }

    @PutMapping("/{id}")
    public boolean updateStudent(@RequestBody StudentRequestDTO studentRequestDTO, @PathVariable ObjectId id) {
        return studentServiceIMP.updateStudent(id,studentRequestDTO);
    }


    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable ObjectId id) {
       // ObjectId objectId = new ObjectId(id);
        return studentServiceIMP.deleteStudentById(id);
    }
}
