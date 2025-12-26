package buoi18.baitap.bai2;

import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1. Thêm cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị danh sách");
        System.out.println("0. Thoát chương trình");
    }

    public static void main(String[] args) {
        QuanLyCanBo qlcb = new QuanLyCanBo();
        int choice;
        boolean isContinue = true;
        do {
            showMenu();
            System.out.print("Chọn hành động: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("========== Nhập thông tin cán bộ ==========");
                    CanBo cb = qlcb.nhapThongTin(sc);
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    System.out.println("========== Danh sách cán bộ ==========");
                    qlcb.inDanhSach();
                    break;
                }
                case 0:
                    isContinue = false;
                    System.out.println("Bạn đã dừng chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (isContinue);
        System.out.println("Thoát chương trình!");
    }
}
