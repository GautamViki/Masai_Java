package com.java111.Evaluation_1;

public class Car {
    String model;
    String companyName;
    String color;
    CarEngine engine;


    public Car() {
        CarEngine engine1 = new CarEngine();
        boolean eng = engine1.enableTurbo();
        engine1.setManufacturer("tata");
        engine1.setPower(110);
        engine1.setRmp(10000);
        model = "Harrier";
        companyName = "Tata";
        color = "black";
        System.out.println("Car Model : " + model);
        System.out.println("Car company name : " + companyName);
        System.out.println("Car color : " + color);
        System.out.println("RPM : " + engine1.getRmp());
        System.out.println("Car power : " + engine1.getPower());
        System.out.println("Car engine manufacturer : " + engine1.getManufacturer());
        System.out.println("Car has Turbo : " + eng);
    }

    public Car(String model, String companyName, String color) {
        CarEngine eng1 = new CarEngine();
        boolean eng = eng1.enableTurbo();
        eng1.setManufacturer("tata");
        eng1.setPower(110);
        eng1.setRmp(10000);
        System.out.println("Car Model : " + model);
        System.out.println("Car company name : " + companyName);
        System.out.println("Car color : " + color);
        System.out.println("RPM : " + eng1.getRmp());
        System.out.println("Car power : " + eng1.getPower());
        System.out.println("Car engine manufacturer : " + eng1.getManufacturer());
        System.out.println("Car has Turbo : " + eng);
    }
}
