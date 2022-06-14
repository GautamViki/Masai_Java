package com.java111.day15.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter DOB in dd-MM-yyyy format :");
        String dob = scanner.next();
        Main main = new Main();
        try {
            main.age(dob);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void age(String dob) throws Exception {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dob, dtf);
            LocalDate now = LocalDate.now();
            Period diff = Period.between(date, now);
            if (diff.getYears() >= 0) {
                System.out.println(diff.getYears() + "y " + diff.getMonths() + "m " + diff.getDays() + "d");
            } else {
                System.out.println("Date should not be in Future.");
            }
        } catch (Exception e) {
            throw new InvalidDateFormat("Invalid Date Format");
        }
    }
}
