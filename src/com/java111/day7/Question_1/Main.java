package com.java111.day7.Question_1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Vikas";
        employee1.age = 26;
        employee1.address = "Bengaluru";
        employee1.phoneNum = "8957411197";
        employee1.salary = 70000.458;
        employee1.specialisation = "Java";
        employee1.department = "Backend";

        System.out.print("Employee salary : ");
        employee1.printSalary();
        System.out.println();

        Manager manager1 = new Manager();
        manager1.name = "Vikas Kumar Gautam";
        manager1.age = 26;
        manager1.address = "Lucknow";
        manager1.phoneNum = "851513313";
        manager1.department = "Computer";
        manager1.salary = 100000.5897;
        manager1.specialisation = "Full Stack";

        System.out.print("Manager salary : ");
        manager1.printSalary();

    }
}
