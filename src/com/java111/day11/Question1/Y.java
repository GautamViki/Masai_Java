package com.java111.day11.Question1;

public interface Y {
    static void fun3_Y() {
        System.out.println("fun3_Y with static in interface Y");
    }

    void fun1_Y();

    default void fun2_Y() {
        System.out.println("fun2_Y with default in interface Y");
    }
}
