package com.java111.day16.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + " Product details");
            System.out.print("Enter product ID :");
            int id = sc.nextInt();
            System.out.print("Enter Product name : ");
            String name = sc.next();
            System.out.print("Enter product price : ");
            double price = sc.nextDouble();
            products[i] = new Product(id, name, price);
        }
        
    }
}
