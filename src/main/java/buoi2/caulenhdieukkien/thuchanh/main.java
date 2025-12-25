package buoi2.caulenhdieukkien.thuchanh;

public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng nhân " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Dòng trống để phân cách các bảng
        }
    }
}
