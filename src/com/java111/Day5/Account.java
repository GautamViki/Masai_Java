package com.java111.Day5;

public class Account {
    private int accountId ;
    private String accountType;
    private int balance;

    public boolean withdraw(int withDraw){
        if ((balance - withDraw) >= 0) {
            System.out.println("Balance amount after withdraw:"+(balance-withDraw));
            return true;
        }else {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
    public void getAccountDetails(int balance){
        if(balance<=0){
            System.out.println("Balance should be positive ");
        }
    }

    public int getWithdrawAmount(int withdraw){
        if(withdraw<=0){
         System.out.println("Amount should be positive");

        }
        return withdraw;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
