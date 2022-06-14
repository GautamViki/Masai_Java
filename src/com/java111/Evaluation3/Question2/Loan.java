package com.java111.Evaluation3.Question2;

public class Loan {
    private Loan() {

    }

    public static Loan getInstance() {
        Loan loan = new Loan();
        return loan;
    }

    public double calculateLoanAmount(Employee employeeObj) {
        double loan = 0;
        employeeObj.calculateSalary();
        if (employeeObj instanceof PermanentEmployee) {

            PermanentEmployee permanentEmployee = (PermanentEmployee) employeeObj;
            loan = permanentEmployee.salary * .15;

            System.out.println("Employee id : " + permanentEmployee.employeeId);
            System.out.println("Employee Name : " + permanentEmployee.employeeName);
            System.out.println("Employee salary : " + permanentEmployee.salary);
            return loan;

        } else if (employeeObj instanceof TemporaryEmployee) {
            TemporaryEmployee temporaryEmployee = (TemporaryEmployee) employeeObj;
            loan = temporaryEmployee.salary * .10;
            System.out.println("Employee Id : " + temporaryEmployee.employeeId);
            System.out.println("Employee name : " + temporaryEmployee.employeeName);
            System.out.println("Employee salary : " + temporaryEmployee.salary);
            return loan;
        } else {
            return 0;
        }
    }
}
