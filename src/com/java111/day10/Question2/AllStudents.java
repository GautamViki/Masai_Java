package com.java111.day10.Question2;

import java.util.Scanner;

public class AllStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        =====================================================================
//        Science Student details
        System.out.println("Enter Science Student details ");
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Address : ");
        String address = sc.next();

        System.out.print("Enter Physics marks : ");
        int ph = sc.nextInt();

        System.out.print("Enter chemistry marks : ");
        int ch = sc.nextInt();

        System.out.print("Enter Maths marks : ");
        int math = sc.nextInt();

        System.out.println();
        System.out.println("===== Science Student Details=====");
        Student std = new ScienceStudent(ph, ch, math);
        std.setAddress(address);
        std.setName(name);
        System.out.println("Student Name : " + std.getName());
        System.out.println("Student Address : " + std.getAddress());

        ScienceStudent scStd = (ScienceStudent) std;
        System.out.println("Percentage : " + scStd.getPercentage());

        System.out.println();


//        =========================================================================
//        History student details
        System.out.println("Enter History Student details ");
        System.out.print("Enter name : ");
        String name2 = sc.next();
        System.out.print("Address : ");
        String address2 = sc.next();

        System.out.print("Enter History marks : ");
        int hs = sc.nextInt();

        System.out.print("Enter Civics marks : ");
        int cv = sc.nextInt();

        System.out.println();
        System.out.println("=====History Student Details===== ");
        Student std2 = new HistoryStudent(hs, cv);
        std.setName(name2);
        std2.setAddress(address2);

        System.out.println("Student Name : " + std2.getName());
        System.out.println("Student Address : " + std2.getAddress());

        HistoryStudent scStd2 = (HistoryStudent) std2;
        System.out.println("Percentage : " + scStd2.getPercentage());


    }
}
