package com.SpringBoot.SerializationDeserialization.Question2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("UP", "Lucknow", "123456");
        Student student = new Student(address, "Vikas", 12458, "ssfs@gmail.com", "1234587");
        Path p = Paths.get("student.txt");
        if (!Files.exists(p)) {
            Files.createFile(p);
        }
        System.out.println("Serialization start............");
        FileOutputStream fos = new FileOutputStream(String.valueOf(p));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        System.out.println();
        System.out.println("Serialization done............");
        oos.flush();
        oos.close();
        System.out.println("=======================================");
        FileInputStream fis = new FileInputStream(String.valueOf(p));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student std = (Student) ois.readObject();

        System.out.println("Deserialization Start...........");
        System.out.println();
        System.out.println("Student Details ");
        System.out.println("Name : " + std.getName());
        System.out.println("Roll number : " + std.getRoll());
        System.out.println("Email : " + std.getEmail());
        System.out.println("Password : " + std.getPassword());
        System.out.println("State : " + std.address.getState());
        System.out.println("City : " + std.address.getCity());
        System.out.println("Pin code : " + std.address.getPin());
        ois.close();
        System.out.println();
        System.out.println("Deserialization done...........");
    }
}
