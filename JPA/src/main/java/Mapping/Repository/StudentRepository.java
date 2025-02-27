package Mapping.Repository;

import Mapping.Entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student,Integer> {
}
