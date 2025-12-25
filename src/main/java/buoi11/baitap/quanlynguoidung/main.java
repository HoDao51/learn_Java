package buoi11.baitap.quanlynguoidung;

public class main {
    public static void main(String[] args) {
        NguoiDung nd = new NguoiDung("Dương", 19);
        nd.hienThi();

        nd.setTen("Khánh Anh");
        nd.setTuoi(149);
        nd.hienThi();

        nd.setTen("");
        nd.setTuoi(151);
        nd.hienThi();
    }
}
