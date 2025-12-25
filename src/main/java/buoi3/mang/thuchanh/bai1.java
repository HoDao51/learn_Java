package buoi3.mang.thuchanh;
import java.util.Scanner;

public class bai1 {
    public static Scanner sc = new Scanner(System.in);

    public static void create(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void seach(int[] arr, int n, int k){
        for(int i = 0; i < n; i++) {
            if(arr[i] == k) {
                System.out.print("arr[i] = " + i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        create(n, arr);
        System.out.println("Mảng vừa nhập là: ");
        display(arr, n);
        System.out.printf("\nNhập k: ");
        int k = sc.nextInt();
        seach(arr, n, k);
    }
}
