package com.thinkiitve.MongodbCrud.Service;

import com.thinkiitve.MongodbCrud.Entity.Student;
import com.thinkiitve.MongodbCrud.Repository.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(ObjectId id) {
        Optional<Student> student=studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    @Override
    public List<Student> getStudents() {
       return studentRepository.findAll();
    }

    @Override
    public boolean updateStudent(ObjectId id,Student updatedStudent) {
         Student existingStudent=getStudentById(id);
          if(existingStudent !=null){
              existingStudent.setStudentCity(updatedStudent.getStudentCity());
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
