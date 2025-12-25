package buoi3.mang.thuchanh;

import java.util.Scanner;

public class bai4 {
        public static Scanner sc = new Scanner(System.in);

        public static void create(int n, int[] arr) {
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
        }

        public static void display(int[] arr, int n) {

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static int insert(int[] arr, int n, int a, int b){
            if(a < 0 || a >= n) {
                System.out.println("Vị trí không hợp lệ");
            } else {
                arr[a] = b;
                System.out.println("Mảng sau khi thay đổi là: ");
                display(arr, n);
            }
        return a;
        }

        public static void main(String[] args) {
            System.out.print("Nhập n: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            create(n, arr);
            System.out.println("Mảng vừa nhập là: ");
            display(arr, n);
            System.out.print("Nhập arr[] muốn thay đổi: ");
            int a = sc.nextInt();
            System.out.println("Nhập giá trị: ");
            int b = sc.nextInt();
            insert(arr, n, a, b);
        }
}
