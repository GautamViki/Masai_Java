package com.java111.Evaluation3.Question4;

public class Customer {
    private String userName;
    private String password;
    private String mobileNumber;
    private String email;

    Customer(String nm, String pas, String mob, String em) {
        this.userName = nm;
        this.password = pas;
        this.email = em;
        this.mobileNumber = mob;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }
}
