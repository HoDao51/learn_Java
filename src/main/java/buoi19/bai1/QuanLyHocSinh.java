package buoi19.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHocSinh {
    List<HocSinh> danhSachHS;
    public QuanLyHocSinh() {
        danhSachHS = new ArrayList<>();
    }

    public HocSinh nhapThongTinHocSinh(Scanner sc){
        System.out.print("Nhap ma hoc sinh: ");
        String maHS = sc.nextLine();
        System.out.print("Nhap ten hoc sinh: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan: ");
        String queQuan = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double diemTrungBinh = sc.nextDouble();
        return new HocSinh(maHS,hoTen, tuoi, queQuan, diemTrungBinh);
    }

    public void themHocSinh(HocSinh hs){
        if(hs != null){
            if(timHocSinhTheoMa(hs.getMaHS()) != null){
                System.out.println("Hoc Sinh Da Ton Tai.");
                return;
            }
            danhSachHS.add(hs);
        }else{
            System.out.println("Hoc Sinh khong hop le.");
        }
    }

    public HocSinh timHocSinhTheoMa(String maHS) {
        for(HocSinh hs : danhSachHS){
            if(hs.getMaHS().equalsIgnoreCase(maHS)){
                return hs;
            }
        }
        return null;
    }

    public void inDanhSach(){
        if (danhSachHS.size() == 0){
            System.out.println("Danh sach hoc sinh rong.");
            return;
        }
        for (HocSinh hs:danhSachHS){
            if (hs.getTuoi() == 20) {
                System.out.println(hs.thongTinHocSinh());
            }
        }
    }

    public HocSinh timKiemHocSinh(String maHS){
        for(HocSinh hs : danhSachHS){
            if(hs.getMaHS().equalsIgnoreCase(maHS)){
                return hs;
            }
        }
        return null;
    }

    public void inDanhSachHocSinhHaNoi(){
        int count = 0;
        if (danhSachHS.size() == 0){
            System.out.println("Danh sach hoc sinh rong.");
            return;
        }
        for (HocSinh hs:danhSachHS){
            if (hs.getTuoi() == 23 && hs.getQueQuan().equalsIgnoreCase("Ha noi")) {
                count++;
            }
        }
        System.out.println("Tong so sinh vien 23 tuoi va co que o ha noi la: " + count);
    }

    public void inDanhSachHSTheoDiem(){
        if (danhSachHS.size() == 0){
            System.out.println("Danh sach hoc sinh rong.");
            return;
        }
        for (int i = 0; i < danhSachHS.size() - 1; i++) {
            for (int j = i + 1; j < danhSachHS.size(); j++) {
                if (danhSachHS.get(i).getDiemTrungBinh() > danhSachHS.get(j).getDiemTrungBinh()) {
                    HocSinh temp = danhSachHS.get(i);
                    danhSachHS.set(i, danhSachHS.get(j));
                    danhSachHS.set(j, temp);
                }
            }
        }
        System.out.println("Danh sach hoc sinh sau khi sap xep tang dan theo diem trung binh:");
        for (HocSinh hs : danhSachHS) {
            System.out.println(hs.thongTinHocSinh());
        }
    }
}
