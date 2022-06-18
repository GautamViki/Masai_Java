package com.java111.day16.Question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];
        HashSet<Product>hashSet=new HashSet<>();

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + " Product details");
            System.out.print("Enter product ID :");
            int id = sc.nextInt();
            System.out.print("Enter Product name : ");
            String name = sc.next();
            System.out.print("Enter product price : ");
            double price = sc.nextDouble();
            products[i] = new Product(id, name, price);
            hashSet.add(products[i]);
            System.out.println("===================================");
        }
//        System.out.println(hashSet);
        {
            System.out.println("Enter your choice for Sorting by ");
            System.out.println("1 for name");
            System.out.println("2 for Price");
            System.out.println("3 for Id");
            int ch= sc.nextInt();

            if (ch==1){
                TreeSet<Product>set=new TreeSet<Product>(new SortByName());
                set.addAll(hashSet);
                System.out.println(set);
            } else if (ch==2) {
                TreeSet<Product>set=new TreeSet<Product>(new SortByPrice());
                set.addAll(hashSet);
                System.out.println(set);
            }
            else {
                TreeSet<Product>set=new TreeSet<Product>(new SortById());
                set.addAll(hashSet);
                System.out.println(set);
            }

        }
    }
}
