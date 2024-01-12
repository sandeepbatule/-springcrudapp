package com.employee.springbootcrud.service;

import com.employee.springbootcrud.entity.Employee;

import java.util.Optional;

public interface Service {
    Employee saveEmployee(Employee employee);
    Optional<Employee> getEmployee(int empId);
}
