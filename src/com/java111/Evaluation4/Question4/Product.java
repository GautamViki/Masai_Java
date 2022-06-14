package com.java111.Evaluation4.Question4;

public class Product {
    String name;
    String company;
    double price;
    int count;

    public Product(String n, double p, String company, int count) {
        this.name = n;
        this.company = company;
        this.price = p;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
