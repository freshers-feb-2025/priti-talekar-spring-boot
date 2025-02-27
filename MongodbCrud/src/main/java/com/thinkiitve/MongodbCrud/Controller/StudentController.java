package com.thinkiitve.MongodbCrud.Controller;

import com.thinkiitve.MongodbCrud.Entity.Student;
import com.thinkiitve.MongodbCrud.DTO.StudentRequestDTO;
import com.thinkiitve.MongodbCrud.DTO.StudentResponseDTO;
import com.thinkiitve.MongodbCrud.Service.StudentServiceImp;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceIMP;

    @GetMapping("/getstudent")
    public List<StudentResponseDTO> getStudents(){
        List<Student> students = studentServiceIMP.getStudents();
        return students.stream().map(this::convertToResponseDTO).collect(Collectors.toList());
    }



    @PostMapping("/addstudent")
    public StudentResponseDTO addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        Student student = convertToEntity(studentRequestDTO);
        Student savedStudent = studentServiceIMP.addStudent(student);
        return convertToResponseDTO(savedStudent);
    }

    @PutMapping("/updatestudent/{id}")
    public boolean updateStudent(@RequestBody StudentRequestDTO studentRequestDTO, @PathVariable String id) {
        ObjectId objectId = new ObjectId(id);
        Student student = convertToEntity(studentRequestDTO);
        return studentServiceIMP.updateStudent(objectId, student);
    }


    @DeleteMapping("/deletestudent/{id}")
    public boolean deleteStudentById(@PathVariable String id) {
        ObjectId objectId = new ObjectId(id);
        return studentServiceIMP.deleteStudentById(objectId);
    }
    private Student convertToEntity(StudentRequestDTO dto){
        Student student = new Student();
        student.setStudentName(dto.getStudentName());
        student.setStudentCity(dto.getStudentCity());
        student.setStudentCollegeName(dto.getStudentCollege());
        return student;


    }

    private StudentResponseDTO convertToResponseDTO(Student student){
        StudentResponseDTO dto = new StudentResponseDTO();
        dto.setStduentName(student.getStudentName());
        dto.setStdudentCity(student.getStudentCity());
        dto.setStudentCollege(student.getStudentCollegeName());

        return dto;
    }
}
