package buoi9.baitap.hinhchunhat;

import java.util.Scanner;


public class Rectangle {
    public static Scanner sc = new Scanner(System.in);
    public double width;
    public double height;

    //constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }

    public void display(){
        System.out.println("Enter width: " + width);
        System.out.println("Enter height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("************************");
    }

    public static Rectangle input(){
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        return new Rectangle(width, height);
    }
}
