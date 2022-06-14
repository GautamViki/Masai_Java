package com.java111.day9.Question1;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public Student() {

    }

    public void displayDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll number : ");
        this.roll = sc.nextInt();
        System.out.print("Name : ");
        this.name = sc.next();
        System.out.print("Marks : ");
        this.marks = sc.nextInt();
        this.grade = calculateGrade();
    }

    private char calculateGrade() {
        if (this.marks >= 500) {
            return 'A';
        } else if (this.marks >= 400) {
            return 'B';
        } else {
            return 'C';
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }
}
