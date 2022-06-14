package com.java111.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeNumber {
    public static int[] primeArray(int[] arr) {
        int[] primeArr = new int[arr.length];
        int count = 0;
        for (int k : arr) {
            boolean flag = false;
            for (int j = 2; j * j <= k; j++) {
                if (k % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && k != 1) {
                primeArr[count] = k;
                count++;
            }
        }

        int[] newArr = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = primeArr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] newArr = primeArray(arr);
        if (newArr.length > 0) {
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println("Prime number not found in the supplied Array");
        }
    }
}
