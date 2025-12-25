package buoi16.baitap.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien{
    List<NhanVien> danhSachNV;
    public QuanLyNhanVien() {
        danhSachNV = new ArrayList<>();
    }


    public NhanVien nhapThongTinNhanVien(Scanner sc){
        System.out.print("Nhap ma nhan vien: ");
        String maNV = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        double luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        double heSoLuong = sc.nextDouble();
        sc.nextLine();
        return new NhanVien(maNV,hoTen, luongCoBan, heSoLuong);
    }

    public void themNhanVien(NhanVien nv){
        if(nv != null){
            if(timKiemNhanVienTheoMa(nv.getMaNV()) != null){
                System.out.println("Nhan Vien Da Ton Tai.");
                return;
            }
            danhSachNV.add(nv);
        }else{
            System.out.println("Nhan vien khong hop le.");
        }

    }

    public boolean xoaNhanVien(String maNV){
        if(timKiemNhanVienTheoMa(maNV) == null){
            System.out.println("Ma nhan vien khong ton Tai.");
            return false;
        }
        NhanVien nv = timKiemNhanVienTheoMa(maNV);
        danhSachNV.remove(nv);
        return true;
    }

    public double tinhLuong(String maNV, Scanner sc){
        if(timKiemNhanVienTheoMa(maNV) == null){
            System.out.println("Ma nhan vien khong ton Tai. Nhap lai ma nhan vien");
            do{
                maNV = sc.nextLine();
                if (timKiemNhanVienTheoMa(maNV) == null){
                    System.out.println("Nhap lai ma nhan vien: ");
                }
            }while (timKiemNhanVienTheoMa(maNV) == null);
        }
        NhanVien nv = timKiemNhanVienTheoMa(maNV);
        double luong = nv.getHeSoLuong() * nv.getLuongCoBan();
        return luong;
    }

    public NhanVien timKiemNhanVien(String ten){
        for(NhanVien nv : danhSachNV){
            if(nv.getHoTen().equalsIgnoreCase(ten)){
                return nv;
            }
        }
        return null;
    }

    private NhanVien timKiemNhanVienTheoMa(String maNV) {
        for(NhanVien nv : danhSachNV){
            if(nv.getMaNV().equalsIgnoreCase(maNV)){
                return nv;
            }
        }
        return null;
    }

    public void inDanhSach(){
        if (danhSachNV.size() == 0){
            System.out.println("Dnah sach nhan vien rong.");
            return;
        }
        for (NhanVien nv:danhSachNV){
            System.out.println(nv.thongTinNhanVien());
        }
    }
}
