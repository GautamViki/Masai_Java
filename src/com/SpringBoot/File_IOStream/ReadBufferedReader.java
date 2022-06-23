package com.SpringBoot.File_IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOStream.txt"));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
