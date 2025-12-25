package buoi16.baitap.bai1;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.Them Nhan Vien");
        System.out.println("2.Xoa Nhan Vien");
        System.out.println("3.Tinh Luong");
        System.out.println("4.Tim nhan vien theo ten");
        System.out.println("5.Danh sach nhan vien");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        int choice;
        boolean isContinue = true;
        do{
            showMenu();
            System.out.print("Chọn hành động: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice >= 1 && choice <= 5) {
                switch (choice) {
                    case 1: {
                        System.out.println("Nhap thong tin nhan vien: ");
                        NhanVien nv = qlnv.nhapThongTinNhanVien(sc);
                        qlnv.themNhanVien(nv);
                        break;
                    }
                    case 2: {
                        System.out.println("Nhap ma nhan vien: ");
                        String maNV = sc.nextLine();
                        boolean check = qlnv.xoaNhanVien(maNV);
                        if (check){
                            System.out.println("Xoa thanh cong nhan vien co ma " + maNV);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Nhap ma nhan vien: ");
                        String maNV = sc.nextLine();
                        qlnv.tinhLuong(maNV, sc);
                        break;
                    }
                    case 4: {
                        System.out.println("Tim nhan vien theo ten: ");
                        String ten = sc.nextLine();
                        NhanVien nv = qlnv.timKiemNhanVien(ten);
                        qlnv.timKiemNhanVien(ten);
                        System.out.println(nv.thongTinNhanVien());
                        break;
                    }
                    case 5:{
                        System.out.println("Danh sach nhan vien");
                        qlnv.inDanhSach();
                        break;
                    }
                    case 0:
                        isContinue = false;
                        System.out.println("Ban da dung chuong chinh.");
                }
            }else{
                System.out.println("lựa chọn không hợp lệ");
            }
        }while(isContinue);
        System.out.println("thoát chương trình!");
    }
}
