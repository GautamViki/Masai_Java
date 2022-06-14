package com.java111.day15.Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
    public double bonus(String joiningDate) throws Exception {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate jDate = LocalDate.parse(joiningDate, dtf);
            LocalDate now = LocalDate.now();
            Period diff = Period.between(jDate, now);
//            System.out.println(diff.getYears() < 0);
            double bonus;
            if (diff.getYears() < 0) {
                throw new InvalidAge("Age should not be in the future");
            } else if (diff.getYears() < 1) {
                bonus = 5000;
            } else if (diff.getYears() == 1 && diff.getYears() <= 2) {
                bonus = 8000;
            } else {
                bonus = 10000;
            }
            return bonus;

        } catch (Exception e) {
            throw new InvalidAge("Please pass the date in the correct format");
        }

    }

}
