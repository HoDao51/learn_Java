package buoi18.baitap.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    List<CanBo> dsCanBo;
    public QuanLyCanBo() {
        dsCanBo = new ArrayList<>();
    }

    public CanBo nhapThongTin(Scanner sc){
        int choice;
        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.print("Chọn loai can bo: ");
        choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        switch (choice) {
            case 1: {
                int bac;
                do {
                    System.out.print("Nhập bậc công nhân: ");
                    bac = sc.nextInt();
                } while (bac < 1 || bac > 10);

                sc.nextLine();
                CongNhan cn = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                dsCanBo.add(cn);
                break;
            }
            case 2: {
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = sc.nextLine();
                KySu ks =  new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                dsCanBo.add(ks);
                break;
            }
            case 3: {
                System.out.print("Nhập công việc: ");
                String congViec = sc.nextLine();
                NhanVien nv =  new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                dsCanBo.add(nv);
                break;
            }
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return null;
        }
        return null;
    }

    public void search(String hoTen) {
        for(CanBo cb : dsCanBo) {
            if(cb.getHoTen().equalsIgnoreCase(hoTen)) {
                if(cb instanceof CongNhan) {
                    CongNhan congNhan = (CongNhan) cb;
                    System.out.println(congNhan.toString());;
                } else if (cb instanceof KySu) {
                    KySu kySu = (KySu) cb;
                    System.out.println(kySu.toString());;
                }else{
                    NhanVien nhanVien = (NhanVien) cb;
                    System.out.println(nhanVien.toString());
                }
            }
        }
    }

    public void inDanhSach(){
        if (dsCanBo.size() == 0){
            System.out.println("Danh sach rong.");
            return;
        }
        for (CanBo cb:dsCanBo){
            if(cb instanceof CongNhan){
                CongNhan cn = (CongNhan) cb;
                System.out.println(cn.toString());
            }else if(cb instanceof KySu){
                KySu ks = (KySu) cb;
                System.out.println(ks.toString());
            }else if(cb instanceof NhanVien){
                NhanVien nv = (NhanVien) cb;
                System.out.println(nv.toString());
            }
        }
    }
}
