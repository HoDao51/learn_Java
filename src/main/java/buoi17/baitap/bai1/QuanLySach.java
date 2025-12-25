package buoi17.baitap.bai1;

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
        String tenSach = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap so luong hang ton kho: ");
        int soLuongTonKho = sc.nextInt();
        sc.nextLine();
        return new Sach(maSach,tenSach, tacGia, namXuatBan, soLuongTonKho);
    }

    public void themSach(Sach sp){
        if(sp != null){
            if(timKiemSach(sp.getMaSach()) != null){
                System.out.println("Sach Da Ton Tai.");
                return;
            }
            dsSach.add(sp);
        }else{
            System.out.println("Sach khong hop le.");
        }
    }

    public boolean capNhatThongTinSach(String maSP, Sach spMoi) {
        if(timKiemSach(maSP) == null){
            System.out.println("Sach khong ton tai.");
            return false;
        }

        return true;
    }

    public Sach timKiemSach(String maSach){
        for(Sach sp : dsSach){
            if(sp.getMaSach().equalsIgnoreCase(maSach)){
                return sp;
            }
        }
        return null;
    }

    public Sach timSachTheoMa(String maSach) {
        for(Sach s : dsSach){
            if(s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }

    public void inDanhSach(){
        if (dsSach.size() == 0){
            System.out.println("Danh sach rong.");
            return;
        }
        for (Sach s:dsSach){
            System.out.println(s.thongTinSach());
        }
    }

    public void inDanhSachSachSapHet(){
        if (dsSach.size() == 0){
            System.out.println("Danh sach rong.");
            return;
        }
        for (Sach sp:dsSach){
            if (sp.getSoLuongTonKho() < 10){
                System.out.println(sp.thongTinSach());
            }
        }
    }
}
