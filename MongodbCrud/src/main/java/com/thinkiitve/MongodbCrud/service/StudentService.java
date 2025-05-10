package com.thinkiitve.MongodbCrud.Service;

import com.thinkiitve.MongodbCrud.DTO.StudentRequestDTO;
import com.thinkiitve.MongodbCrud.DTO.StudentResponseDTO;
import com.thinkiitve.MongodbCrud.Entity.Student;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    StudentResponseDTO addStudent(StudentRequestDTO studentRequestDTO);

    List<StudentResponseDTO> getStudents();

    boolean updateStudent(ObjectId id, StudentRequestDTO updatedStudentDTO);

    StudentResponseDTO getStudentById(ObjectId id);

    boolean deleteStudentById(ObjectId id);

}
