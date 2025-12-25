package buoi9.baitap.NhanVien;

import java.util.Scanner;

public class Employee {
    public static Scanner sc = new Scanner(System.in);
    public int id;
    public String name;
    public int age;
    public double salary;

    public Employee (int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        if (percent > 0){
            salary += salary * percent / 100;
        }
    }
    public void display(){
        System.out.print("Ma nhan vien: " + id);
        System.out.print("\nTen nhan vien: " + name);
        System.out.print("\nTuoi: " + age);
        System.out.print("\nLuong: " + salary);
        System.out.print("\n---------------\n");
    }
    public static Employee input(){
        System.out.print("Nhap ma nhan vien: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.print("Nhap luong: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        return new Employee(id, name, age, salary);
    }

}
