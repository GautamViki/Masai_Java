package com.unit5.Evaluation1.Question3;

public class Account {
    int balance;
    int accountNo;

    public Account(int balance, int accountNo) {
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void displayBalance() {
        System.out.println("Account no : " + this.getAccountNo() + " Balance : " + this.getBalance());
    }

    public void deposit(int amount) {
        int bal = this.getBalance();
        bal = bal + amount;
        this.setBalance(bal);
        System.out.println(amount + " is deposit");
        displayBalance();
    }

    public void withdraw(int amount) {
        int bal = this.getBalance();
        bal = bal - amount;
        this.setBalance(bal);
        System.out.println(amount + " withdrawn");
        displayBalance();
    }
}
