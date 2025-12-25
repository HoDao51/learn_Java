package buoi13.baitap.bai1;

public abstract class NhanVien {
    private String hoTen;
    private double luongCoBan;

    public NhanVien(String hoTen, double luongCoBan) {
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public abstract double tinhLuong();
}
