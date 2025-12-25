package buoi9.baitap.hinhchunhat;

import buoi9.baitap.quanlydiem.Student;

public class main {
    public static void main(String[] args) {
        Rectangle[] rec = new Rectangle[2];
        for(int i = 0; i < 2; i++){
            System.out.println("********* Nhap thong tin hcn thu " + (i+1) + ": ");
            rec[i] = Rectangle.input();
        }
        System.out.println("********* Danh sach hcn: ");
        for(int i = 0; i < 2; i++){
                rec[i].display();
        }
    }
}
