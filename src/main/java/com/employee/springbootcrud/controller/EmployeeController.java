package com.employee.springbootcrud.controller;

import com.employee.springbootcrud.entity.Employee;
import com.employee.springbootcrud.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private Service service;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployee(int employeeId){
        Optional<Employee> employee = service.getEmployee(employeeId);
        return ResponseEntity.of(employee);
    }

}
