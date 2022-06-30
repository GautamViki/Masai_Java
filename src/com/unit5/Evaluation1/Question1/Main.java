package com.unit5.Evaluation1.Question1;

public class Main {
    public static void main(String[] args) {
        Abc a1 = new Abc();
        Xyz b1 = new Xyz();
        ThreadA t1 = new ThreadA(a1, b1);
        ThreadX t2 = new ThreadX(a1, b1);
        t1.start();
        t2.start();
    }
}
