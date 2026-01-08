package buoi19.bai1;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.Them hoc sinh");
        System.out.println("2.Hien thi danh sach cac hoc sinh 20 tuoi");
        System.out.println("3.Tim kiem hoc sinh theo ma");
        System.out.println("4.So luong hoc sinh 23 tuoi va co que o ha noi");
        System.out.println("5.Sap xep danh sach hoc sinh theo diem TB tang dan");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        QuanLyHocSinh qlhs = new QuanLyHocSinh();
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
                        System.out.println("========== Nhap thong tin hoc sinh ==========");
                        HocSinh sp = qlhs.nhapThongTinHocSinh(sc);
                        qlhs.themHocSinh(sp);
                        break;
                    }
                    case 2: {
                        System.out.println("========== Danh sach hoc sinh 20 tuoi ==========");
                        qlhs.inDanhSach();
                        break;
                    }
                    case 3: {
                        System.out.print("Nhap ma hoc sinh can tim: ");
                        String maHS = sc.nextLine();
                        HocSinh sp = qlhs.timKiemHocSinh(maHS);
                        qlhs.timKiemHocSinh(maHS);
                        System.out.println(sp.thongTinHocSinh());
                        break;
                    }
                    case 4: {
                        System.out.println("========== Danh sách hoc sinh 23 tuoi & có quê ở hà nội ==========");
                        qlhs.inDanhSachHocSinhHaNoi();
                        break;
                    }
                    case 5: {
                        System.out.println("========== Danh sach hoc sinh xếp theo điểm TB tăng dần ==========");
                        qlhs.inDanhSachHSTheoDiem();
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
