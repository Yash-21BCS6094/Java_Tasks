package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@AllArgsConstructor
@RestController
@RequestMapping("api/employees") // common url part for all the apis defined here

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // Post the creation of the user
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDto){
        EmployeeDTO savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Get the user with provided Id
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDTO);
    }

    // GET all of them
    @GetMapping
    public ResponseEntity<Page<EmployeeDTO>> getAllEmployees(@PageableDefault(page = 1, size = 2) Pageable pageable){
        Page<EmployeeDTO> employeeDTOPage = employeeService.getAllEmplyees(pageable);
        return ResponseEntity.ok(employeeDTOPage);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody  EmployeeDTO updatedEmployee){
        EmployeeDTO employeeDTO = employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok(employeeDTO);
    }

    @DeleteMapping({"id"})
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("user deleted");
    }

}
