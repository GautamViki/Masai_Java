package com.java111.day20.Question2;

public class City {
    private final String city;

    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
