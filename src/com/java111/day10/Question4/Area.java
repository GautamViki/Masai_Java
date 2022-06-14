package com.java111.day10.Question4;

import java.util.Scanner;

public class Area extends Shape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int rad = sc.nextInt();

        System.out.print("Enter length : ");
        int len = sc.nextInt();

        System.out.print("Enter breadth : ");
        int bre = sc.nextInt();

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        System.out.println();
        Area area = new Area();
        System.out.println("Area of circle : " + area.circleArea(rad));
        System.out.println("Area of rectangle : " + area.rectangleArea(len, bre));
        System.out.println("Area of square : " + area.squareArea(side));
    }

    @Override
    public int circleArea(int radius) {
        double area = (3.1413) * radius * radius;
        return (int) area;
    }

    @Override
    public int rectangleArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    public int squareArea(int side) {
        return side * side;
    }
}
