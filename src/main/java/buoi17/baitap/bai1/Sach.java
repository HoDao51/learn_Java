package buoi17.baitap.bai1;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soLuongTonKho;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuongTonKho) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuongTonKho = soLuongTonKho;
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

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public String thongTinSach() {
        String str = "Ma SP: " + maSach;
        str += "| Ten san pham: " + tenSach;
        str += "| Gia ban: " + tacGia;
        str += "| Nam xuat ban: " + namXuatBan;
        str += "| So luong ton kho: " + soLuongTonKho;
        return str;
    }
}
