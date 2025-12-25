package buoi18.baitap.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    List<SanPham> danhSachSP;
    public QuanLySanPham() {
        danhSachSP = new ArrayList<>();
    }

    public SanPham nhapThongTinSanPham(Scanner sc){
        System.out.print("Nhap ma san pham: ");
        String maSP = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        String tenSP = sc.nextLine();
        System.out.print("Nhap gia ban: ");
        double gia = sc.nextDouble();
        System.out.print("Nhap so luong hang ton kho: ");
        int soLuongTonKho = sc.nextInt();
        sc.nextLine();
        return new SanPham(maSP,tenSP, gia, soLuongTonKho);
    }

    public void themSanPham(SanPham sp){
        if(sp != null){
            if(timSanPhamTheoMa(sp.getMaSP()) != null){
                System.out.println("San pham Da Ton Tai.");
                return;
            }
            danhSachSP.add(sp);
        }else{
            System.out.println("San pham khong hop le.");
        }
    }

    public void capNhatThongTinSanPham(String maSP) {
        SanPham sp = null;

        for (SanPham s : danhSachSP) {
            if (s.getMaSP().equalsIgnoreCase(maSP)) {
                sp = s;
                break;
            }
        }

        if (sp == null) {
            System.out.println("Khong tim thay san pham can sua");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU SUA SAN PHAM =====");
            System.out.println("1. Sua ten san pham");
            System.out.println("2. Sua gia");
            System.out.println("3. Sua so luong ton kho");
            System.out.println("0. Thoat");
            System.out.print("Chon muc can sua: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    sp.setTenSP(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Nhap gia moi: ");
                    sp.setGia(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Nhap so luong ton kho moi: ");
                    sp.setSoLuongTonKho(sc.nextInt());
                    sc.nextLine();
                    break;
                case 0:
                    System.out.println("Thoat sua san pham");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);

        System.out.println("Danh sach san pham sau khi sua:");
        inDanhSach();
    }

    public SanPham timKiemSanPham(String maSP){
        for(SanPham sp : danhSachSP){
            if(sp.getMaSP().equalsIgnoreCase(maSP)){
                return sp;
            }
        }
        return null;
    }

    public SanPham timSanPhamTheoMa(String maSP) {
        for(SanPham sp : danhSachSP){
            if(sp.getMaSP().equalsIgnoreCase(maSP)){
                return sp;
            }
        }
        return null;
    }

    public void inDanhSach(){
        if (danhSachSP.size() == 0){
            System.out.println("Danh sach san pham rong.");
            return;
        }
        for (SanPham sp:danhSachSP){
            System.out.println(sp.thongTinSanPham());
        }
    }

    public void inDanhSachSanPhamSapHetHang(){
        if (danhSachSP.size() == 0){
            System.out.println("Danh sach san pham rong.");
            return;
        }
        for (SanPham sp:danhSachSP){
            if (sp.getSoLuongTonKho() < 10){
                System.out.println(sp.thongTinSanPham());
            }
        }
    }
}
