package buoi18.baitap.bai1;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.Them san pham");
        System.out.println("2.Cap nhat san pham");
        System.out.println("3.Tim kiem san pham theo ma: ");
        System.out.println("4.Hien thi toan bo san pham");
        System.out.println("5.Hien thi san pham sap het hang");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
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
                        System.out.println("========== Nhap thong tin san pham ==========");
                        SanPham sp = qlsp.nhapThongTinSanPham(sc);
                        qlsp.themSanPham(sp);
                        break;
                    }
                    case 2: {
                        System.out.print("Nhap ma san pham can sua: ");
                        String maSP = sc.nextLine();

                        qlsp.capNhatThongTinSanPham(maSP);
                        break;
                    }
                    case 3: {
                        System.out.print("Nhap ma san pham can tim: ");
                        String maSP = sc.nextLine();
                        SanPham sp = qlsp.timKiemSanPham(maSP);
                        qlsp.timKiemSanPham(maSP);
                        System.out.println(sp.thongTinSanPham());
                        break;
                    }
                    case 4: {
                        System.out.println("========== Danh sach san pham ==========");
                        qlsp.inDanhSach();
                        break;
                    }
                    case 5: {
                        System.out.println("========== Danh sach san pham sap het hang ==========");
                        qlsp.inDanhSachSanPhamSapHetHang();
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
