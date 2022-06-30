package com.unit5.Evaluation1.Question2;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String city;
    private String pin;

    Address(String state, String city, String pin) {
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
