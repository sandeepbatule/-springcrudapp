package com.com.iris;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(50, "ajay", 20000),
                new Employee(52, "amar", 30000),
                new Employee(56, "kiran", 25000),
                new Employee(40, "kk", 50000),
                new Employee(20, "ll", 40000));

        String noEmployeeNameFound = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee :: getSalary).reversed())
                .skip(2)
                .findFirst()
                .map(Employee :: getName)
                .orElse("No Employee Name Found");

       // System.out.println(noEmployeeNameFound);
    }
}
