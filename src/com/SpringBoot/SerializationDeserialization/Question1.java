package com.SpringBoot.SerializationDeserialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Question1 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("IOStream.txt");
        List<String> list = Files.readAllLines(p);
        for (String st : list) {
            System.out.println(st);
        }
    }
}
