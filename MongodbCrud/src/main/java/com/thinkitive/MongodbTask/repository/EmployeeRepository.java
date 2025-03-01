package com.thinkitive.MongodbTask.repository;

import com.thinkitive.MongodbTask.entity.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {
}
