package com.java111.day7.Question_2;

public class Student {
    int studentID;
    String studentName;
    double examFee;
    double paidFee;
    double totalFee;


    public void displayDetails() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Name : " + studentName);
        System.out.println("Exam Fee : " + examFee);
        double remainFee = payFee();
        System.out.println("Remaining Fee : " + remainFee);
    }

    public double payFee() {
        return this.totalFee - this.paidFee;
    }
}
