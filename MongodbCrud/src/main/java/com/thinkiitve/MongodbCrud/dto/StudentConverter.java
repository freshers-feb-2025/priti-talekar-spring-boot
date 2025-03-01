package com.thinkiitve.MongodbCrud.dto;

import com.thinkiitve.MongodbCrud.Entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

    public Student convertToEntity(StudentRequestDTO studentRequestDTO){
        return Student.builder()
                .studentId(studentRequestDTO.getStudentId())
                .studentName(studentRequestDTO.getStudentName())
                .studentCity(studentRequestDTO.getStudentCity())
                .studentCollegeName(studentRequestDTO.getStudentCollege())
                .build();
    }

    public StudentResponseDTO convertToResponseDTO(Student student) {
        return new StudentResponseDTO(
                student.getStudentName(),
                student.getStudentCity(),
                student.getStudentCollegeName()
        );
    }

}
