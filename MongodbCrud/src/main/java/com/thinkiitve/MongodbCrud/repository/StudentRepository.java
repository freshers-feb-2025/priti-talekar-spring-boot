package com.thinkiitve.MongodbCrud.repository;

import com.thinkiitve.MongodbCrud.Entity.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, ObjectId> {

}
