package com.java111.day7.Question_4;

public class ICICIBank extends Bank {
    double rateOfInterest;

    void displayDetails() {
        System.out.println("Bank name : " + this.bankName);
        System.out.println("IFSC code : " + this.ifscCode);
        System.out.println("Rate of Interest : " + this.rateOfInterest);
    }

}
