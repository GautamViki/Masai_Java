package com.java111.Evaluation3.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements in the array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the index of the array element you want to access");
            int idx = sc.nextInt();

            System.out.println("The array element at index " + idx + " = " + arr[idx]);
            System.out.println("The array element successfully accessed");
        } catch (NullPointerException npe) {
            System.out.println(npe);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
