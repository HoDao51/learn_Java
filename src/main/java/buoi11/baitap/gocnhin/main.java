package buoi11.baitap.gocnhin;

public class main {
    public static void main(String[] args) {

        ThongTinKhachHang tk = new ThongTinKhachHang("123", "duong123@gmail.com");

        System.out.println(tk.getMaKhachHang());
        System.out.println(tk.getEmail());
    }
}
