package com.SpringBoot.File_IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritePrintWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IOStream.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("==============================");
        pw.println("Welcome to");
        pw.println("File");
        pw.println("Writing");
        pw.println("using of");
        pw.println("PrintWriter");
        pw.println("Method");
        pw.println("");
        pw.close();
    }
}
