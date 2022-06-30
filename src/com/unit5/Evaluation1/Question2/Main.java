package com.unit5.Evaluation1.Question2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("UP", "Lucknow", "548795");
        Employee employee = new Employee("abc@gmail.com", "Vikas", 12548, "abc123"
                , address);
        Path p = Paths.get("emp.txt");
        if (!Files.exists(p)) {
            Files.createFile(p);
        }
        System.out.println("Serialization start..........");
        FileOutputStream fos = new FileOutputStream(String.valueOf(p));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.flush();
        oos.close();
        System.out.println();
        System.out.println("Serialization done............");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Deserialization start............");
        FileInputStream fis = new FileInputStream(String.valueOf(p));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp = (Employee) ois.readObject();
        ois.close();
        System.out.println();
        System.out.println("Employee name : " + emp.getEmpName());
        System.out.println("Employee ID : " + emp.getEmpId());
        System.out.println("Employee Email : " + emp.getEmail());
        System.out.println("Employee Password : " + emp.getPassword());
        System.out.println("State : " + emp.address.getState());
        System.out.println("City : " + emp.address.getCity());
        System.out.println("Pin code : " + emp.address.getPin());
        System.out.println();
        System.out.println("Deserialization done...............");
    }
}
