package com.java111.day16.Question1;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }

}
