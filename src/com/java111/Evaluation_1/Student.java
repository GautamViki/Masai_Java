package com.java111.Evaluation_1;

public class Student {
    private int rollNumber;
    private String studentName;

    private int marks;

    public Student() {
    }

    public Student(int rol, String name, int mak) {
        System.out.println("Student roll Number : " + rol);
        System.out.println("Student Name: " + name);
        System.out.println("Student marks : " + mak);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
