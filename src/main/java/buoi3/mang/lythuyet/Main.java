package buoi3.mang.lythuyet;

import java.util.Scanner;

public class Main {
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
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("\nTổng các phần tử trong mảng vừa nhập là: " + sum);
        int tongchan = 0;
        int tongle = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                tongchan += arr[i];
            }else {
                tongle += arr[i];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + tongchan);
        System.out.println("Tổng các số lẻ trong mảng là: " + tongle);

        // tim min max
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // đếm số lượng số chẵn và lẻ
        int demchan = 0;
        int demle = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                demchan++;
            } else {
                demle++;
            }
        }
        System.out.println("Số lượng số chẵn trong mảng là: " + demchan);
        System.out.println("Số lượng số lẻ trong mảng là: " + demle);

        // sắp xếp mảng tăng dần
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
