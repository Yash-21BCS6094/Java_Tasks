package com.example.demo.services;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployeeById(Long employeeId);
    Page<EmployeeDTO> getAllEmplyees(Pageable pageable);
    EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);
    void deleteEmployee(Long employeeId);
}


