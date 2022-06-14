package com.java111.Day6;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        String[] revString = str.split("", str.length());
//        String[] strArr = new String[str.length()];
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            String temp = revString[i];
            revString[i] = revString[j];
            revString[j] = temp;
            i++;
            j--;
        }
        String newStr = "";
        for (String it : revString) newStr = newStr + it;
        return newStr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();

        String result = reverseString(originalString);


        System.out.println("Original String is : " + originalString);
        System.out.println("Reversed String is : " + result);
    }
}
