package buoi18.baitap.bai1;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuongTonKho;

    public SanPham(String maSP, String tenSP, double gia, int soLuongTonKho) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public String thongTinSanPham() {
        String str = "Ma SP: " + maSP;
        str += "| Ten san pham: " + tenSP;
        str += "| Gia ban: " + gia;
        str += "| So luong ton kho: " + soLuongTonKho;
        return str;
    }
}
