package com.unit5.Evaluation1.Question2;

import java.io.Serializable;

public class Employee implements Serializable {
    Address address;
    private String email;
    private String empName;
    private int empId;
    private transient String password;

    public Employee(String email, String empName, int empId, String password, Address address) {
        this.email = email;
        this.empName = empName;
        this.empId = empId;
        this.password = password;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getPassword() {
        return password;
    }
}
