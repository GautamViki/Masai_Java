package com.java111.day16.Question1;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return
                "productId = " + productId + "\n"+
                "productName = '" + productName + '\'' +"\n"
              + "productPrice = " + productPrice +"\n"+
                "==========================================="+"\n";
    }
}
