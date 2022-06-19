package com.java111.day20.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Bengaluru"));
        cities.add(new City("Delhi"));
        cities.add(new City("Lucknow"));
        cities.add(new City("Bhopal"));

        Collections.sort(cities, (c1, c2) -> c2.getCity().compareTo(c1.getCity()));
        System.out.println(cities);

    }
}
