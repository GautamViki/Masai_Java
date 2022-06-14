package com.java111.day7.Question_2;

public class Main {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.studentID = 12457;
        dayScholar.studentName = "Vikas";
        dayScholar.examFee = 12000.369;
        dayScholar.transPortFee = 6000;
        dayScholar.paidFee = 15000;

        dayScholar.totalFee = dayScholar.examFee + dayScholar.transPortFee;
        dayScholar.payFee();
        dayScholar.displayDetails();
        System.out.println("Total Fee(Exam fee + Transport fee) : " + dayScholar.totalFee);

        System.out.println();

        Hosteller hosteller = new Hosteller();
        hosteller.studentID = 12498;
        hosteller.studentName = "Vikas Kumar Gautam";
        hosteller.examFee = 12000.972;
        hosteller.hostelFee = 24000;
        hosteller.paidFee = 18000;
        hosteller.totalFee = hosteller.hostelFee + hosteller.examFee;

        hosteller.payFee();

        hosteller.displayDetails();
        System.out.println("Total Fee(Exam fee + Hostel fee) : " + hosteller.totalFee);


    }
}
