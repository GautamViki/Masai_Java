package com.SpringBoot.SerializationDeserialization.Question2;

import java.io.Serializable;

public class Student implements Serializable {
    Address address;
    private String email;
    private String name;
    private transient String password;
    private int roll;

    public Student(Address address, String name, int roll, String email, String password) {
        this.address = address;
        this.name = name;
        this.roll = roll;
        this.email = email;
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
