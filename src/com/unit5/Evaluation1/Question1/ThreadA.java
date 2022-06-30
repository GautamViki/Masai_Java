package com.unit5.Evaluation1.Question1;

public class ThreadA extends Thread {
    Abc a1;
    Xyz b1;

    public ThreadA(Abc a1, Xyz b1) {
    }

    public void ThreadB(Abc a1, Xyz b1) {
        this.b1 = b1;
        this.a1 = a1;
    }

    @Override
    public void run() {
        b1.funB(a1);
    }

}
