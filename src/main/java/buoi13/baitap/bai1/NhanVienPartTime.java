package buoi13.baitap.bai1;

public class NhanVienPartTime extends NhanVien{

    public int soGioLam;
    public NhanVienPartTime(String hoTen, double luongCoBan, int soGioLam) {
        super(hoTen, luongCoBan);
        this.soGioLam = soGioLam;
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan()*soGioLam;
    }
}
