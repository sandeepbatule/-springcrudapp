package com.employee.springbootcrud.com.employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ApplicationMainClass {
    public static void main(String[] args) {
        //nt id, String empName, int salary, String department
        List<Employee> employeeList = Arrays.asList(new Employee(101, "sandeep",12000,"HR"),
                new Employee(102, "amir",13000,"IT"),
                new Employee(103, "kiran",14000,"Admin"),
                new Employee(104, "rajesh",17000,"HR"),
                new Employee(105, "akshay",19000,"IT"),
                new Employee(106, "kavita",2000,"Admin"));

        /*Map<String, Employee> collect = employeeList
                .stream()
                .collect(Collectors.toMap(Employee :: getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingInt(Employee :: getSalary))));
        System.out.println(collect);*/
        //        Map<String, Employee> collect = employeeList.stream().collect(Collectors.toMap(Employee :: getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingInt(Employee :: getSalary))));
        //        System.out.println(collect);
        /*List<Employee> employeeList = Arrays
                .asList(new Employee(101, "sanket",10000,"HR"),
                        new Employee(102, "amir",16000,"IT"),
        new Employee(103, "raj",15000,"HR"),
        new Employee(104, "savita",18000,"HR"),
        new Employee(105, "savita",18000,"HR"),
                        new Employee(106, "savita",25000,"HR"),
        new Employee(107, "karan",27000,"HR"));*/

        /*Map<Integer,List<String>> interimResult =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(entry ->entry.getSalary(),
                                Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
                        ));*/

        /*employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("less than 3 employee "));*/
        /// List<Integer> uniqueSal =
       /* List<Integer> sortedSal = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder()).
                collect(Collectors.groupingBy(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt((o1,o2)->o1.get)));

        System.out.println(sortedSal);*/


//        sortedSal.ifPresent(thirdSal-> employeeList.stream()
//                .filter(employee->employee.getSalary()==thirdSal)
//                .forEach(employee -> System.out.println("Employee Name : " +
//                        ""+employee.getEmpName()+" Salary : "+employee.getSalary())));
//        if(uniqueSal.size() >= 3) {
//            double thirdHighSal = uniqueSal.get(2);
//
//            List<Employee> empwithThirdHighSal = employeeList
//                    .stream()
//                    .filter(emp -> emp.getSalary() == thirdHighSal)
//                    .collect(Collectors.toList());
//
//            for (Employee emp: empwithThirdHighSal){
//                System.out.println(emp.getEmpName() +" "+emp.getSalary());
//            }
//
//        }    //System.out.println(v);
    }
}
