package buoi13.baitap.bai1;

public class NhanVienFullTime extends NhanVien{

    public int soNgayLamViec = 30;
    public NhanVienFullTime(String hoTen, double luongCoBan) {
        super(hoTen, luongCoBan);
    }

    public double tinhLuong() {
        return soNgayLamViec*getLuongCoBan();
    }
}
