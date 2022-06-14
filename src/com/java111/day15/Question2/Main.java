package com.java111.day15.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter joining date dd-MM-yyyy format");
        String jDate = sc.next();
        try {
            EmployeeBonus emp = new EmployeeBonus();
            double bonus = emp.bonus(jDate);
            System.out.println("Bonus : " + bonus);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
