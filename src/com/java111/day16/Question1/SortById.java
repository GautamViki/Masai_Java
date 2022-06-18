package com.java111.day16.Question1;

import java.util.Comparator;

public class SortById implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductId()>o2.getProductId()){
            return +1;
        }
        else if (o1.getProductId()<o2.getProductId()){
            return -1;
        }else
            return +1;
    }
}
