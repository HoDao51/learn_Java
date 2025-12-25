package buoi16.baitap.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    List<Sach> dsSach;
    public QuanLySach() {
        dsSach = new ArrayList<>();
    }

    public Sach nhapThongTinSach(Scanner sc){
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSanh = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap gia ban: ");
        double gia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        sc.nextLine();

        return new Sach(maSach, tenSanh, tacGia, gia, soLuong);
    }

    public void themSach(Sach s){
        if(s != null){
            if(timKiemSachTheoMa(s.getMaSach()) != null){
                System.out.println("Sach da ton tai.");
                return;
            }
            dsSach.add(s);
        }else{
            System.out.println("Sach khong hop le.");
        }
    }

    public boolean capNhatThongTinSach(String maSach){
        if(timKiemSachTheoMa(maSach) == null){
            System.out.println("Sach khong ton Tai.");
            return false;
        }
        Sach s = timKiemSachTheoMa(maSach);
        dsSach.
    }

    public boolean xoaSach(String maSach){
        if(timKiemSachTheoMa(maSach) == null){
            System.out.println("Sach khong ton Tai.");
            return false;
        }
        Sach s = timKiemSachTheoMa(maSach);
        dsSach.remove(s);
        return true;
    }

    public Sach timKiemSach(String maSach){
        for(Sach s : dsSach){
            if(s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }

    private Sach timKiemSachTheoMa(String maSach) {
        for(Sach s : dsSach){
            if(s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }
}
