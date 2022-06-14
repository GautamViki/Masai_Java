package com.java111.day14.Question1;

public class Account {
    String accountNumber;
    double balance;

    public void deposit(double amount){
            this.balance=amount;
    }
    public  double withdraw(double amount) throws InsufficientFundsException {
        if(balance>=amount){
            balance=balance-amount;

        }else {
            throw new InsufficientFundsException("Insufficient balance");
        }
        return balance;
    }
    public Account(String accNum){
        this.accountNumber=accNum;
    }
}
