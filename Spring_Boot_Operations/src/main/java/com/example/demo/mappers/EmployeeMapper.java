package com.example.demo.mappers;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
        return new EmployeeDTO(employee.getId(), employee.getName(), employee.getRole());
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return new Employee(employeeDTO.getId(), employeeDTO.getName(), employeeDTO.getRole());
    }

}
