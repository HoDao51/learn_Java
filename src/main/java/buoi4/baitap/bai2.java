package buoi4.baitap;

import java.util.Scanner;

public class bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.Đổi nhệt độ từ C -> F");
        System.out.println("2.Đổi độ dài từ M -> Feet");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        int n;
        double a;
        do{
            showMenu();
            System.out.print("Chọn hành động: ");
            n = sc.nextInt();
            if(n == 1 || n == 2) {
                System.out.print("Nhập giá trị: ");
                a = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("kết quả: "+  (a * 1.8 + 32));
                        break;
                    case 2:
                        System.out.println("kết quả: "+  (a * 3.28084));
                        break;
                }
            }else{
                System.out.println("lựa chọn không hợp lệ");
            }
        }while(n != 0);
        System.out.println("thoát chương trình!");
    }
}