package com.java111.day9.Question2;

import java.util.Scanner;

public class Child extends Parent {
    Child(int num) {
        super(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();

        if (n > 1 && n < 10) {
            Parent pr = new Child(n);
            Child ch = (Child) pr;
            pr.method1();
            pr.method2();
            pr.method3();
            ((Child) pr).method4();
        } else {
            System.out.println("Invalid number");
        }
    }

    @Override
    void method1() {
        System.out.println("Number : " + number);
        System.out.println("Method 1 in Class Child");
    }

    void method4() {
        System.out.println("Method 4 in Class Child");
    }

}
