package com.employee.springbootcrud.entity;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class MonthlySalary {
    private int id;
    private int salary;
    private int month;
}
