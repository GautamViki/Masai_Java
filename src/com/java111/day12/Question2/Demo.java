package com.java111.day12.Question2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter mobile number : ");
        String mobile = sc.next();
        System.out.print("Enter aadhar number : ");
        String aadhar = sc.next();

        Demo demo = new Demo();
        boolean bool = demo.validate(name, mobile, aadhar);
        if (bool) {
            System.out.println();
            Citizen ct = new Citizen(name, mobile, aadhar);
            System.out.println("Name : " + ct.getName());
            System.out.println("Mobile number : " + ct.getMobileNumber());
            System.out.println("AAdhar Number : " + ct.getAadharNumber());
        } else {
            System.out.println();
            System.out.println("Enter valid Details");
        }
    }

    public boolean validate(String name, String mobileNumber, String aadharNumber) {
        boolean nm = Pattern.matches("[a-zA-Z]{3,8}", name);
        boolean num = Pattern.matches("[6789][0-9]{9}", mobileNumber);
        boolean aad = Pattern.matches("[0-9]{12}", aadharNumber);

        return nm && num && aad;
    }
}
