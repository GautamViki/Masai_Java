package com.SpringBoot.SerializationDeserialization.Question2;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String pin;
    private String city;

    public Address(String state, String city, String pin) {
        this.state = state;
        this.city = city;
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPin() {
        return pin;
    }
}
