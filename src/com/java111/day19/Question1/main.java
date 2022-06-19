package com.java111.day19.Question1;

import java.util.HashMap;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("UP", new Student(2458167, "Akash", 272));
        studentHashMap.put("MP", new Student(8578167, "Deepak", 322));
        studentHashMap.put("Delhi", new Student(158167, "Ravi", 472));
        studentHashMap.put("Bihar", new Student(1258167, "Pooja", 422));

//        getting all the state name
        Set<String> state = studentHashMap.keySet();

        for (String s : state) {
            System.out.println(s);
        }
    }
}
