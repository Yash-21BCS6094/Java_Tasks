package com.example.demo.services.impl;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.mappers.EmployeeMapper;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return EmployeeMapper.mapToEmployeeDTO(employee);
    }

    @Override
    public Page<EmployeeDTO> getAllEmplyees(Pageable pageable) {
        Page<EmployeeDTO> employees = employeeRepository.findAll(pageable).map((employee) -> EmployeeMapper.mapToEmployeeDTO(employee));
        return employees;
    }


    @Override
    public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exit")
        );
        employee.setId(updatedEmployee.getId());
        employee.setName(updatedEmployee.getName());
        employee.setRole(updatedEmployee.getRole());

        Employee updatedEmployeeObj = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exit")
        );
        employeeRepository.deleteById(employeeId);
    }

}
