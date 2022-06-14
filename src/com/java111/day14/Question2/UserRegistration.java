package com.java111.day14.Question2;

import java.util.Scanner;

public class UserRegistration {
    public  void registerUser(String userName,String userCountry) throws Exception{
        if (userCountry.equalsIgnoreCase("India")){
            System.out.println("User registration done successfully");
        }else {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter your name ");
            String name=sc.next();
            System.out.println("Enter Your country : ");
            String cou=sc.next();
            UserRegistration us=new UserRegistration();
            us.registerUser(name,cou);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
