package com.employee.springbootcrud.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_salary")
    private int empSalary;

    @OneToMany(mappedBy = "MonthlySalary.class")
    private MonthlySalary monthlySalary;
}
