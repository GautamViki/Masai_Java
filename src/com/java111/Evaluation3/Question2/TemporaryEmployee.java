package com.java111.Evaluation3.Question2;

public class TemporaryEmployee extends Employee {
    public double salary = 0;
    private int hoursWorked;
    private int hoursWages;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hoursWages) {
        super(employeeId, employeeName);
        this.hoursWages = hoursWages;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        salary = hoursWages * hoursWorked;
    }
}
