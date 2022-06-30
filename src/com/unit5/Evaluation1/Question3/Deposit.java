package com.unit5.Evaluation1.Question3;

public class Deposit extends Thread {
    int amount;
    Account account;

    Deposit(int amount, Account account) {
        this.amount = amount;
        this.account = account;
    }

    public int getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }
    
}
