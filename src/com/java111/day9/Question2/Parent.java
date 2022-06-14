package com.java111.day9.Question2;

public class Parent {
    final int number;

    Parent(int num) {
        this.number = num;
    }

    void method1() {
        System.out.println("Number : " + this.number);
        System.out.println("Method 1 in Class Parent");
    }

    final void method2() {
        System.out.println("Method 2 in Class Parent");
    }

    void method3() {
        System.out.println("Method 3 in Class Parent");
    }

}
