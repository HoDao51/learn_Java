package buoi9.baitap.quanlydiem;

import java.util.Scanner;

public class Student {
    public static Scanner sc = new Scanner(System.in);
    public String name;
    public int age;
    public double score;

    //contructor
    public  Student(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public boolean check(){
        return score >= 8;
    }

    public void display(){
        System.out.print("Name: " + name);
        System.out.print("\nAge: " + age);
        System.out.print("\nScore: " + score );
    }

    public static Student input(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter score: ");
        double score = sc.nextDouble();
        sc.nextLine();
        return new Student(name, age, score);
    }

}
