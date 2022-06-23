package com.SpringBoot.File_IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOStream.txt", true));
        bw.write("====================================");
        bw.newLine();
        bw.write("Write ");
        bw.newLine();
        bw.write("using ");
        bw.newLine();
        bw.write("BufferedWriter");
        bw.newLine();
        bw.write("Welcome");
        bw.newLine();
        bw.write("Again");
        bw.newLine();
        bw.write("In ");
        bw.newLine();
        bw.write("File writing");
        bw.newLine();
        bw.write("Method");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
