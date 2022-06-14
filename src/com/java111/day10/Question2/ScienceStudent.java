package com.java111.day10.Question2;


public class ScienceStudent extends Student {
    int physicsMarks;
    int chemistryMarks;
    int mathMarks;


    ScienceStudent(int physicsMarks, int chemistryMarks, int mathMarks) {
        this.chemistryMarks = chemistryMarks;
        this.physicsMarks = physicsMarks;
        this.mathMarks = mathMarks;
    }

    @Override
    double getPercentage() {
        double totalMarks = chemistryMarks + mathMarks + physicsMarks;
        totalMarks = (totalMarks / 300) * 100;
        return totalMarks;
    }
}
