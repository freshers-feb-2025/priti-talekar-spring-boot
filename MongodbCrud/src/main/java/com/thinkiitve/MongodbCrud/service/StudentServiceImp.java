package com.thinkiitve.MongodbCrud.Service;

import com.thinkiitve.MongodbCrud.DTO.StudentConverter;
import com.thinkiitve.MongodbCrud.DTO.StudentRequestDTO;
import com.thinkiitve.MongodbCrud.DTO.StudentResponseDTO;
import com.thinkiitve.MongodbCrud.Entity.Student;
import com.thinkiitve.MongodbCrud.Repository.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentConverter studentConverter;


    @Override
    public StudentResponseDTO getStudentById(ObjectId id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(studentConverter::convertToResponseDTO).orElse(null);
    }


    @Override
    public StudentResponseDTO addStudent(StudentRequestDTO studentRequestDTO) {
        Student student = studentConverter.convertToEntity(studentRequestDTO);
        Student savedStudent = studentRepository.save(student);
        return studentConverter.convertToResponseDTO(savedStudent);
    }

    @Override
    public List<StudentResponseDTO> getStudents() {
        return studentRepository.findAll().stream()
                .map(studentConverter::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateStudent(ObjectId id, StudentRequestDTO updatedStudentDTO) {
        Optional<Student> existingStudentOptional = studentRepository.findById(id);
        if (existingStudentOptional.isPresent()) {
            Student existingStudent = existingStudentOptional.get();
            existingStudent.setStudentName(updatedStudentDTO.getStudentName());
            existingStudent.setStudentCity(updatedStudentDTO.getStudentCity());
            existingStudent.setStudentCollegeName(updatedStudentDTO.getStudentCollege());
            studentRepository.save(existingStudent);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudentById(ObjectId id) {
           studentRepository.deleteById(id);
           return true;
    }
}
