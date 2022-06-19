package com.java111.day20.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rajesh", 1429, 870));
        students.add(new Student("Ravi", 1004, 810));
        students.add(new Student("Dheeraj", 1104, 650));
        students.add(new Student("Vivek", 1710, 850));
        students.add(new Student("Arun", 1245, 810));
        students.add(new Student("Chandan", 1124, 780));
        students.add(new Student("Shivam", 1284, 690));
        students.add(new Student("Vikas", 1204, 750));
        students.add(new Student("Manoj", 1121, 737));

        Stream<Student> std = students.stream();
        List<Employee> list = std.map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks() * 1000)).collect(Collectors.toList());

        list.stream().forEach(s -> {
            System.out.println("Employee Id : " + s.getEmpId());
            System.out.println("Employee Name : " + s.getEmpName());
            System.out.println("Employee Salary : " + s.getSalary());
            System.out.println("=================================================");
        });
    }
}
