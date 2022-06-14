package com.java111.Evaluation3.Question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uName ");
        String name = sc.next();
        System.out.println("Enter password");
        String pass = sc.next();
        System.out.println("Enter mobile");
        String mobile = sc.next();
        System.out.println("Enter email");
        String email = sc.next();

        Demo demo = new Demo();

        boolean bool = demo.validate(name, pass, mobile, email);
        if (bool) {
            System.out.println();
            Customer customer = new Customer(name, pass, mobile, email);
            System.out.println("User name : " + customer.getUserName());
            System.out.println("Password  : " + customer.getPassword());
            System.out.println("Mobile number : " + customer.getMobileNumber());
            System.out.println("Email address : " + customer.getEmail());
        } else {
            System.out.println();
            System.out.println("Invalid Input");
        }

    }

    public boolean validate(String name, String pass, String mobile, String email) {
        boolean nm = Pattern.matches("[a-zA-z]{3,8}", name);
        boolean pas = Pattern.matches("[a-zA-z0-9]{3,8}", pass);
        boolean mob = Pattern.matches("[6789][0-9]{9}", mobile);
        boolean em = Pattern.matches("[^(.+)@(\\S+)$]", email);

        return nm && mob && pas && em;
    }
}
