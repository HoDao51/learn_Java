package buoi4.baitap;

import java.util.Scanner;

public class bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("=============Menu=============");
        System.out.println("1.phép tính cộng");
        System.out.println("2.phép tính trừ");
        System.out.println("3.phép tính nhân");
        System.out.println("4.phép tính chia");
        System.out.println("0.thoát chương trình");
    }
    public static void main(String[] args) {
        int n;
        double a, b;
        do{
            showMenu();
            System.out.print("Chọn hành động: ");
            n = sc.nextInt();
            if(n >= 1 && n <= 4) {
                System.out.print("Nhập a: ");
                a = sc.nextInt();
                System.out.print("Nhập b: ");
                b = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("kết quả: "+  (a + b));
                        break;
                    case 2:
                        System.out.println("kết quả: "+  (a - b));
                        break;
                    case 3:
                        System.out.println("kết quả: "+  (a * b));
                        break;
                    case 4:
                        if(b != 0) {
                            System.out.println("kết quả: " + (a / b));
                        }else {
                            System.out.println("không thể chia cho 0");
                        }
                        break;
                }
            }else{
                System.out.println("lựa chọn không hợp lệ");
            }
        }while(n != 0);
        System.out.println("thoát chương trình!");
    }
}