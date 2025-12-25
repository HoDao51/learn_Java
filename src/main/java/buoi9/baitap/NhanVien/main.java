package buoi9.baitap.NhanVien;

import buoi9.baitap.hinhchunhat.Rectangle;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        for(int i = 0; i < 2; i++){
            System.out.println("********* Nhap thong tin nhan vien thu " + (i+1) + ": ");
            emp[i] = Employee.input();
        }
        System.out.println("********* Danh sach nhan vien: ");
        for(int i = 0; i < 2; i++){
            emp[i].display();
        }

        System.out.print("Nhap phan tram tang luong cho nhan vien: ");
        double percent = sc.nextDouble();
        for(int i = 0; i < 2; i++){
            emp[i].increaseSalary(percent);
        }

        System.out.println("********* Danh sach nhan vien sau tang luong: ");
        for(int i = 0; i < 2; i++){
            emp[i].display();
        }
    }
}
