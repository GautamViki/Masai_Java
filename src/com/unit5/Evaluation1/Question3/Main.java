package com.unit5.Evaluation1.Question3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10000, 5480058);
        Deposit deposit = new Deposit(1000, account);
        Withdraw withdraw = new Withdraw(5000, account);

        Thread th1 = new Thread(deposit);
        Thread th2 = new Thread(withdraw);
        th1.start();
        th2.start();
        th1.join();

        Account ac = deposit.getAccount();
        ac.deposit(deposit.getAmount());
        ac.withdraw(withdraw.getAmount());
    }
}
