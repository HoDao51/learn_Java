package buoi5.baitap;

import java.util.Scanner;

public class bai1 {
    public static Scanner sc = new Scanner(System.in);

    public static void create( int[] arr) {
        for (int i = 0; i <= 10; i++) {
                System.out.print("Nhập số thứ " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Nhập số âm rồi ngu vl");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        create(arr);
    }
}
