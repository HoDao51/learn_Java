package buoi3.mang.lythuyet;

import java.util.Scanner;

public class mang2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.printf("Nhập n: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //bai 1
        int k;
        System.out.printf("\nNhập k: ");
        k = sc.nextInt();
        for(int i = 0; i < n; i++) {
                if(arr[i] == k) {
                    System.out.print("arr[i] = " + i + "\n");
            }
        }

        //bai 2
        int x;
        System.out.printf("\nNhập x: ");
        x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Số lần x xuất hiện trong mảng là: " + count);

        //bai 3
        int temp;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

