package com.java111.day20.Question3;

public class Employee {
    private final int empId;
    private final String empName;
    private final double salary;

    public Employee(int id, String name, double sal) {
        this.empId = id;
        this.empName = name;
        this.salary = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

}
