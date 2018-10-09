package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai:");
        double height = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle:"+rectangle.display());
        System.out.println("Area of the Rectangle:"+rectangle.getArea());
        System.out.println("Perimeter of the Rectangle:"+rectangle.getPerimeter());
    }
}
