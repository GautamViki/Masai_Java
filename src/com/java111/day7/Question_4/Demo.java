package com.java111.day7.Question_4;

import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static Bank getBank(String bank, double rate) {
        if (bank.equals("Axis")) {
            AxisBank axisBank = new AxisBank();
            axisBank.rateOfInterest = rate;
//            System.out.println(axisBank.rateOfInterest + "*********");
            axisBank.getCreditCard();
            return axisBank;
        } else if (bank.equals("ICICI")) {
            ICICIBank iciciBank = new ICICIBank();
            iciciBank.rateOfInterest = rate;
            return iciciBank;
        } else return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your bank name : ");
        String bankName = sc.next();

        System.out.print("Enter IFSC code : ");
        String ifsc = sc.next();

        System.out.print("Enter rate : ");
        double rate = sc.nextDouble();

        System.out.println();
        Bank bank1 = getBank(bankName, rate);

//        AxisBank axis = AxisBank(bank1);
        bank1.bankName = bankName;
        bank1.ifscCode = ifsc;

        bank1.displayDetails();


    }
}
