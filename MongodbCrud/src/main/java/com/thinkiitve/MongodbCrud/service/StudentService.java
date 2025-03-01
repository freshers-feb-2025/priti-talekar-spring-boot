package com.thinkiitve.MongodbCrud.service;

import com.thinkiitve.MongodbCrud.dto.StudentRequestDTO;
import com.thinkiitve.MongodbCrud.dto.StudentResponseDTO;
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
