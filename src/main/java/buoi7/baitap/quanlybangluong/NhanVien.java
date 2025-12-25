package buoi7.baitap.quanlybangluong;

import java.util.Scanner;

public class NhanVien {
    public static Scanner sc = new Scanner(System.in);
    public int maNV;
    public String tenNV;
    public double luongCoBan;
    public int soNgayLamViec;

    //constructor
    public NhanVien(int maNV, String tenNV, double luongCoBan, int soNgayLamViec){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
        this.soNgayLamViec = soNgayLamViec;
    }

    public void tinhTongLuong(){
        double tinhLuong = luongCoBan * soNgayLamViec;
    }

    public String laNVXuatSac(){
        if(soNgayLamViec > 25) {
            return ("Nhan vien suat xac");
        } else {
            return ("Nhan vien binh thuong");
        }
    }

    public void inThongTin(){
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ten NV: " + tenNV);
        System.out.println("Luong Co Ban: " + luongCoBan);
        System.out.println("So Ngay Lam Viec: " + soNgayLamViec);
        System.out.println("Tong Luong: " + (luongCoBan * soNgayLamViec));
        System.out.println("Xep Loai: " + laNVXuatSac());
        System.out.println("-----------------------");
    }

    public static NhanVien nhapThongTin(){
        System.out.print("Nhập mã nhân viên: ");
        int maNV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên Nhân Viên: ");
        String tenNV = sc.nextLine();
        System.out.print("Lương cơ bản: ");
        double luongCoBan = sc.nextInt();
        System.out.print("Số ngày làm việc: ");
        int soNgayLamViec = sc.nextInt();
        return new NhanVien(maNV, tenNV, luongCoBan, soNgayLamViec);
    }

    public static void main(String[] args) {
        NhanVien[] arr = new NhanVien[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("******** Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            arr[i] = nhapThongTin();
        }

        System.out.println("\n********** Thong tin nhan vien **********");
        for (int i = 0; i < 3; i++){
            arr[i].inThongTin();
        }

        System.out.println("\n********** Danh sach nhan vien xuat xac **********");
        for (int i = 0; i < 3; i++){
            if(arr[i].soNgayLamViec > 25){
                System.out.println(arr[i].tenNV);
            }
        }
    }
}
