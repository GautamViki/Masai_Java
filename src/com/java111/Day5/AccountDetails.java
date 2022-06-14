package com.java111.Day5;

import java.util.Scanner;

public class AccountDetails {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Account ac=new Account();

        System.out.println("Enter account id: ");
        int id= sc.nextInt();

        System.out.println("Enter account type:");
        String type=sc.next();

        System.out.println("Enter balance: ");
        int bal= sc.nextInt();
        if (bal<=0){
            ac.getAccountDetails(bal);
            System.out.println("Enter balance again: ");
            bal=sc.nextInt();
        }

        System.out.println("Enter amount to be withdrawn: ");
        int withdraw= sc.nextInt();

        ac.setAccountId(id);
        ac.setAccountType(type);
        ac.setBalance(bal);
        if (withdraw<=0){
            int wd=ac.getWithdrawAmount(withdraw);
            System.out.println(wd);
        }else {
            ac.withdraw(withdraw);
        }

    }
}
