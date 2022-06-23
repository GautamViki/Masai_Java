package com.SpringBoot.File_IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("IOStream.txt", true);
//        fileWriter.write("\n");
        fileWriter.write(103);
        fileWriter.write("\nWelcome");
        fileWriter.write("\nto");
        fileWriter.write("\nwriting");
        fileWriter.write("\nfile");
        fileWriter.write("\nusing");
        fileWriter.write("\nFileWriter");
        fileWriter.write("\nMethod");
        fileWriter.write("\n");
        fileWriter.flush();
        fileWriter.close();
    }
}
