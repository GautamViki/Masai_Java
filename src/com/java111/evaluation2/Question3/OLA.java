package com.java111.evaluation2.Question3;

public class OLA {
    Car car = new Car();

    public Car bookCar(int numberOfPassenger, int numberOfKms) {
        if (numberOfPassenger <= 3) {
            car.setNumberOfKms(numberOfKms);
//            System.out.println(car.getNumberOfKms());
            return new HatchBack();
        } else {
            System.out.println(car.getNumberOfKms());
            car.setNumberOfKms(numberOfKms);
            return new Sedan();
        }
    }

    public int calculateBill(Car car) {

        if (car instanceof Sedan) {
            Sedan sedan = (Sedan) car;

//            System.out.println(car.getNumberOfKms() + "***********");
            int totalFare = sedan.getNumberOfKms() * sedan.farePerKm;
//            System.out.println(totalFare + "*******");
            return totalFare;
        } else {
            HatchBack hatchBack = (HatchBack) car;
            System.out.println(hatchBack.farePerKms);
            int totalFare = hatchBack.getNumberOfKms() * hatchBack.farePerKms;
            System.out.println(totalFare);
            return totalFare;
        }

    }
}
