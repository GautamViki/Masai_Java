package com.java111.Day6;

public class Factorial_CLA {
   

    public static void main(String[] args) {
//        System.out.println("length = " + args.length);
        int len = args.length;
        int res = 1;
        if (len == 1) {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                res = res * i;
            }
            System.out.println(res);
        } else if (len == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            for (int i = 1; i <= Math.abs(num1 - num2); i++) {
                res = res * i;
            }
            System.out.println(res);
        } else {
            System.out.println("Error");
        }

    }
}
