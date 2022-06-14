package com.java111.day10.Question1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amount = sc.nextInt();

        Demo demo = new Demo();

        Hotel hotel = demo.provideFood(amount);
        if (hotel instanceof TajHotel tajHotel) {
            tajHotel.chickenBiryani();
            tajHotel.masalaDosa();
            tajHotel.welcomeDrink();
        } else if (hotel instanceof RoadSideHotel roadSideHotel) {
            roadSideHotel.chickenBiryani();
            roadSideHotel.masalaDosa();
        } else {
            System.out.println("Please Enter a valid amount;");
        }
    }

    public Hotel provideFood(int amount) {
        if (amount > 1000) {
            return new TajHotel();
        } else if (amount > 200 && amount < 1000) {
            return new RoadSideHotel();
        } else {
            return null;
        }
    }
}
