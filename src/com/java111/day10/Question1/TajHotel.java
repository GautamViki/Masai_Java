package com.java111.day10.Question1;

public class TajHotel implements Hotel {
    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa in TajHotel");

    }

    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani in TajHotel");
    }

    public void welcomeDrink() {
        System.out.println("Welcome Drink from the TajHotel");
    }
}
