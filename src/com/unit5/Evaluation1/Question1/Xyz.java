package com.unit5.Evaluation1.Question1;

public class Xyz {
    public synchronized void funB(Abc a1) {
        System.out.println("funB of B starts");
        a1.fun1();
        System.out.println("funB of B ends");
    }

    public synchronized void fun2() {
        System.out.println("inside fun2 of B");
    }

}
