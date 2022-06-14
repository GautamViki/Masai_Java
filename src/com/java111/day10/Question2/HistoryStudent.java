package com.java111.day10.Question2;


public class HistoryStudent extends Student {
    int historyMarks;
    int civicsMarks;


    HistoryStudent(int historyMarks, int civicsMarks) {


        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
    }

    @Override
    double getPercentage() {
        double totalMarks = historyMarks + civicsMarks;
        totalMarks = (totalMarks / 200) * 100;
        return totalMarks;
    }
}
