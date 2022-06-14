package com.java111.Evaluation3.Question2;

public class Main {
    public static void main(String[] args) {

        Loan loan = Loan.getInstance();
        PermanentEmployee permanentEmployee = new PermanentEmployee(120, "Vikas", 100000);
        double amountLoan = loan.calculateLoanAmount(permanentEmployee);
        System.out.println("Loan amount : " + amountLoan);
        System.out.println();

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(245, "Rajat", 200, 50);
        double tempLoan = loan.calculateLoanAmount(temporaryEmployee);
        System.out.println("Loan amount : " + tempLoan);

    }
}
