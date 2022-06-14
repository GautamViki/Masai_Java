package com.java111.Evaluation4.Question4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ecommerce ec = new Ecommerce();
        ec.addProductToList(new Product("Shoes", 2000, "Adidas", 12));

        List<Product> products = ec.showAllProduct();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
