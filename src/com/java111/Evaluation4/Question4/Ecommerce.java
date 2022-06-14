package com.java111.Evaluation4.Question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Ecommerce {
    List<Product> productList = new ArrayList<>();
    HashSet<Product> hashSet = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ecommerce)) return false;
        Ecommerce ecommerce = (Ecommerce) o;
        return Objects.equals(productList, ecommerce.productList) && Objects.equals(hashSet, ecommerce.hashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList, hashSet);
    }

    public void addProductToList(Product product) {
        System.out.println("Product added successfully");
        boolean bool = hashSet.add(product);
        if (bool) {
            product.count += 1;
            System.out.println("Count updated Product already exists");
        }


    }

    public List<Product> showAllProduct() {
        return this.productList;
    }
}
