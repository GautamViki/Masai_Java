package com.java111.day20.Question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vikas", 1204, 750));
        students.add(new Student("Ravi", 1004, 810));
        students.add(new Student("Dheeraj", 1104, 650));
        students.add(new Student("Vivek", 1710, 850));
        students.add(new Student("Arun", 1245, 810));
        students.add(new Student("Chandan", 1124, 780));
        students.add(new Student("Shivam", 1284, 690));
        students.add(new Student("Manoj", 1121, 737));

        students.stream()
                .filter(s -> s.getMarks() < 800)
                .forEach(s -> System.out.println(s.getName()));
    }
}
