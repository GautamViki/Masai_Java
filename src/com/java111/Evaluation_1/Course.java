package com.java111.Evaluation_1;

import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

    public static void authenticate(String userName, String password) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String userName = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();

        if (userName.equals("Admin") && password.equals("1234")) {
            Course cr = new Course();
            cr.setCourseFee(96000);
            cr.setCourseId(24457);
            cr.setCourseName("Computer Science");
            cr.displayCourseDetails();
        } else {
            System.out.println("Invalid Username or password");
        }

    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public void displayCourseDetails() {
        System.out.println("Course ID : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Fee : " + courseFee);
    }

}
