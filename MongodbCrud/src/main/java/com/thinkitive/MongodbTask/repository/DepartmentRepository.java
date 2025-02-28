package com.thinkitive.MongodbTask.repository;

import com.thinkitive.MongodbTask.entity.Department;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, ObjectId> {
}
