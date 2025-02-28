package com.thinkiitve.MongodbCrud.Service;

import com.thinkiitve.MongodbCrud.Entity.Student;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student addStudent(Student student);

    List<Student> getStudents();

    boolean updateStudent(ObjectId id, Student student);

    Student getStudentById(ObjectId id);

    boolean deleteStudentById(ObjectId id);

}