package com.employee.springbootcrud.service;

import com.employee.springbootcrud.entity.Employee;
import com.employee.springbootcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);

    }

    @Override
    public Optional<Employee> getEmployee(int empId) {
        return employeeRepository.findById(empId);
    }
}
