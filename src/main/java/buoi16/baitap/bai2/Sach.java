package buoi16.baitap.bai2;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private double gia;
    private int soLuong;

    public Sach(String maSach, String tenSach, String tacGia, double gia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void capNhatSoLuong(int soLuongMoi){
        this.soLuong = soLuongMoi;
    }

    public double tinhThanhTien(int soLuongMua){
        return soLuongMua * gia;
    }

    public void hienThiThongTin(){
        System.out.println("========Thong tin sach========");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tacGia);
        System.out.println("Gia ban: " + gia);
        System.out.println("So luong: " + soLuong);
    }
}
