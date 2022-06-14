package com.java111.evaluation2.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of passenger : ");
        int numPasse = sc.nextInt();
        System.out.print("Enter number of kms : ");
        int km = sc.nextInt();

        OLA myOla = new OLA();

        Car myCar = myOla.bookCar(numPasse, km);


        int res = myOla.calculateBill(myCar);
        System.out.println(res + "***********");
    }
}
