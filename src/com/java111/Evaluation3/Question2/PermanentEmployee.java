package com.java111.Evaluation3.Question2;

public class PermanentEmployee extends Employee {
    public double salary = 0;
    private double basicPay;


    PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    @Override
    public void calculateSalary() {
        salary = basicPay - basicPay * 0.12;

    }
}
