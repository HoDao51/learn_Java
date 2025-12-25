package buoi2.caulenhdieukkien.thuchanh;

import java.util.Scanner;

public class sum1_nchan {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int n;
        System.out.printf("Nhap n: ");
        n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                tong += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);
    }
}
