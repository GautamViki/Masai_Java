package com.java111.evaluation2.Question2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of student object : ");
        int n = sc.nextInt();

        Student[] std = new Student[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            std[i] = new Student();
            System.out.println("Student Details : " + (i + 1));
            System.out.print("Enter roll : ");
            int roll = sc.nextInt();

            System.out.print("Enter name : ");
            String name = sc.next();

            System.out.print("Enter address : ");
            String add = sc.next();

            System.out.print("Enter marks : ");
            int marks = sc.nextInt();

            std[i].setRoll(roll);
            std[i].setAddress(add);
            std[i].setName(name);
            std[i].setMarks(marks);

            sum = sum + marks;

            System.out.println();

            System.out.println("Name : " + std[i].getName());
            System.out.println("Roll number : " + std[i].getRoll());
            System.out.println("Address : " + std[i].getAddress());
            System.out.println("Marks : " + std[i].getMarks());
            System.out.println();
        }

        double avg = sum / n;
        System.out.println("Average : " + avg);
    }
}
