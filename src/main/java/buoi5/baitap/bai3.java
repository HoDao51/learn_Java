package buoi5.baitap;

import java.util.Scanner;

public class bai3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int sum = 0;
        while (true) {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
            if (n < 10) {
                System.out.printf("Số bé hơn 10! vui lòng nhập lại \n");
                continue;
            }
            if(n > 100) {
                System.out.printf("Số lớn hơn 100! dừng vòng lặp \n");
                break;
            }
            sum += n;
        }
        System.out.println("Tong: " + sum);
    }
}