package com.java111.day11.Question1;

public interface X {

    static void fun3_X() {
        System.out.println("fun3_X with static in interface X");
    }

    void fun1_X();

    default void fun2_X() {
        System.out.println("fun2_X with default in interface X ");
    }
}
