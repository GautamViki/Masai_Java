package com.java111.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int n = sc.nextInt();
        System.out.print("Enter number of column : ");
        int m = sc.nextInt();

        int[][] arr2D = new int[n][m];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2D[i][j] = num;
                num++;
            }
        }
        System.out.println();
        for (int[] ints : arr2D) System.out.println(Arrays.toString(ints));
        System.out.println();

        for (int col = 0; col < m; col++) {
            int sumEvenCol = 0;
            for (int row = 0; row < n; row++) {
                if (arr2D[row][col] % 2 == 0) {
                    sumEvenCol = sumEvenCol + arr2D[row][col];
                }
            }
            System.out.println(sumEvenCol);
        }

    }
}
