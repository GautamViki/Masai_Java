package com.java111.day14.Question1;
public class AccountDemo {
    public static void main(String[] args) {
        try {
            Account account=new Account("1316565456");
            account.deposit(4646546.1321);
            double rem =account.withdraw(546465);
            System.out.println("Remaining Balance "+rem);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
