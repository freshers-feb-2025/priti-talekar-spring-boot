package com.thinkitive.MongodbTask.service;

import com.mongodb.client.MongoDatabase;
import com.thinkitive.MongodbTask.dto.RequestResponseConverter;
import com.thinkitive.MongodbTask.dto.EmployeeRequestDto;
import com.thinkitive.MongodbTask.dto.EmployeeResponseDto;
import com.thinkitive.MongodbTask.entity.Department;
import com.thinkitive.MongodbTask.entity.Employee;
import com.thinkitive.MongodbTask.repository.DepartmentRepository;
import com.thinkitive.MongodbTask.repository.EmployeeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RequestResponseConverter requestResponseConverter;


  public EmployeeResponseDto addEmployee(EmployeeRequestDto employeeRequestDto){
      System.out.println("employeeRequestDto.getDepartmentId() " + employeeRequestDto.getDepartmentId());
      ObjectId objectId = new ObjectId(employeeRequestDto.getDepartmentId());
     Department department= departmentRepository.findById(objectId).get();
      Employee employee=requestResponseConverter.convertToEntityEmployee(employeeRequestDto , department);
      Employee savedEmployee=employeeRepository.save(employee);
      return requestResponseConverter.convertToResponseDTOEmployee(savedEmployee);
  }

    public EmployeeResponseDto getEmployeeById(ObjectId employeeId) {
        Aggregation agg=Aggregation.newAggregation(
                Aggregation.match(Criteria.where("_id").is(employeeId)),
                Aggregation.lookup("department","departmentId","_id","department")
        );

        AggregationResults<Employee> result=mongoTemplate.aggregate(agg,"employee",Employee.class);

        List<Employee> employees=result.getMappedResults();
        if(employees.isEmpty()){
            return null;
        }
        Employee employee=employees.get(0);
        return requestResponseConverter.convertToResponseDTOEmployee(employee);
//          Optional<Employee>empolyee=employeeRepository.findById(employeeId);
//          return empolyee.map(requestResponseConverter::convertToResponseDTOEmployee).orElse(null);

    }

  public List<EmployeeResponseDto> getEmployees(){
      return employeeRepository.findAll().stream()
              .map(requestResponseConverter::convertToResponseDTOEmployee)
              .collect(Collectors.toList());
  }

}
