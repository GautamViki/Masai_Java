package com.SpringBoot.File_IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("IOStream.txt");
        long l = file.length();
        System.out.println(l);
        char[] chars = new char[(int) l];
        FileReader fileReader = new FileReader(file);
        fileReader.read(chars);
        for (char c : chars) {

            System.out.print(c);
        }
    }
}
