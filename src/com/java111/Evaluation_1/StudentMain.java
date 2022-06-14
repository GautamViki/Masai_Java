package com.java111.Evaluation_1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student : ");
        int numStd = sc.nextInt();

        Student std = new Student();
        int count = 0;

        for (int i = 0; i < numStd; i++) {
            count++;
            System.out.println("Enter roll number : ");
            int roll = sc.nextInt();
            System.out.println("Enter Student name : ");
            String name = sc.next();

            System.out.println("Enter Marks : ");
            int mark = sc.nextInt();
            std.setMarks(mark);
            std.setStudentName(name);
            std.setRollNumber(roll);
            System.out.println("Student Detail " + count);
            Student std1 = new Student(std.getRollNumber(), std.getStudentName(), std.getMarks());
            System.out.println();
        }

    }
}
