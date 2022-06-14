package com.java111.Evaluation4.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DOB dd-MM-yyyy format : ");
        String dob = sc.next();
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dob, dtf);
            LocalDate now = LocalDate.now();
            Period age = Period.between(date, now);
            if (date.getMonthValue() == now.getMonthValue() && date.getDayOfMonth() == now.getDayOfMonth()) {
                System.out.println("Happy Birthday,");
            }
            if (age.getYears() >= 18) {
                System.out.println("You are eligible to cast vote");
            } else if (age.getYears() < 0) {
                System.out.println("Date of birth should not be in future");
            }
            if (date.getMonthValue() == now.getMonthValue() && date.getDayOfMonth() == now.getDayOfMonth()) {
                System.out.println("Happy Birthday");
            }
//
        } catch (Exception e) {

            System.out.println("please pass the date in the proper format");
        }
    }
}
