package com.java111.day9.Question1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of student : ");
        int n = sc.nextInt();
        Student[] std = new Student[n];

        for (int i = 0; i < n; i++) {
            std[i] = new Student();
            std[i].displayDetails();
            System.out.println();
            System.out.println("Student details " + (i + 1));
            System.out.println(std[i]);
            System.out.println();
        }
    }

}
