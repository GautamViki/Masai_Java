package com.SpringBoot.File_IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String file = sc.next();
        System.out.println("Enter the character to be counted : ");
        char ch = sc.next().charAt(0);

        File f = new File(file);
        long l = f.length();
        FileReader fr = new FileReader(f);
        char[] chars = new char[(int) l];
        fr.read(chars);
        int count = 0;
        for (char c : chars) {
            if (Character.compare(c, ch) == 0 || Character.compare(c, Character.toUpperCase(ch)) == 0) {
                count++;
            }
        }
        System.out.println("File '" + file + "' has " + count + " instances of letter '" + ch + "'");
    }
}
