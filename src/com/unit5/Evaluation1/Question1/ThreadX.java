package com.unit5.Evaluation1.Question1;

public class ThreadX extends Thread {
    Abc a1;
    Xyz b1;

    public ThreadX(Abc a1, Xyz b1) {
    }

    public void ThreadA(Abc a1, Xyz b1) {
        this.b1 = b1;
        this.a1 = a1;
    }

    @Override
    public void run() {
        a1.funA(b1);
    }

}
