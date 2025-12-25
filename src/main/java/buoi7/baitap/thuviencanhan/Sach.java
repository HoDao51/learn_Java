package buoi7.baitap.thuviencanhan;

import java.util.Scanner;

public class Sach {
    public static Scanner sc = new Scanner(System.in);
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int giaBan;

    //constructor không có giá trị
    public Sach () {
        this.tieuDe = "Chưa Xác Định";
        this.tacGia = "Chưa Xác Định";
        this.namXuatBan = 0;
        this.giaBan = 0;
    }

    //constructor có giá trị
    public Sach (String tieuDe, String tacGia, int namXuatBan, int giaBan) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
    }

    public String sachMoi(){
        if(namXuatBan >= 2020) {
            return "Sách Mới";
        } else if(namXuatBan == 0){
            return "Không Xác Định";
        } else {
            return "Sách Cũ";
        }
    }

    public void hienThiThongTin(){
        System.out.println("Tiêu Đề: " + tieuDe);
        System.out.println("Tác Giả: " + tacGia);
        System.out.println("Năm Xuất Bản: " + namXuatBan);
        System.out.println("Giá Bán: " + giaBan + " VNĐ");
        System.out.println("Tình Trạng: " + sachMoi());
        System.out.println("-----------------------");
    }

    public static Sach nhapThongTin(){
        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập năn xuất bản: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhập giá bán: ");
        int giaBan = sc.nextInt();
        return new Sach(tieuDe, tacGia, namXuatBan, giaBan);
    }

    public static void main(String[] args) {
        Sach[] arr = new Sach[2];
        for(int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1) + ":");
            arr[i] = nhapThongTin();
        }

        System.out.println("\nThông tin các cuốn sách:");
        for(int i = 0; i < 2; i++) {
            arr[i].hienThiThongTin();
        }
    }
}
