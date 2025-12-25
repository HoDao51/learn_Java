package buoi11.baitap.quanlysanpham;

public class SanPham {
    private String tenSP;
    private double gia;
    private int soLuongTonKho;

    //contructor
    public SanPham(String tenSP, double gia, int soLuongTonKho) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuongTonKho = soLuongTonKho;
    }

    // tạo Getter cho tênSP
    public String getTen() {
        return tenSP;
    }
    //tạo Getter cho giá
    public double getGia() {
        return gia;
    }
    //tạo Getter cho số lượng tồn kho
    public int getSoLuongTonKho(){
        return soLuongTonKho;
    }

    // Setter cho giá
    public void setTen(double giaMoi) {
        if (giaMoi > 0) {
            this.gia = giaMoi;
        }
    }

    // Setter cho so luong ton kho
    public void setSoLuongTonKho(int soLuongMoi) {
        if (soLuongMoi > 0 ) {
            this.soLuongTonKho = soLuongMoi;
        }
    }

    public String tenSP(){
        return tenSP;
    }
    public double gia(){
        return gia;
    }
    public int soLuongTonKho(){
        return soLuongTonKho;
    }

    public void banHang(int soLuongBan){
        if(soLuongBan <= this.getSoLuongTonKho()){
            this.soLuongTonKho = this.soLuongTonKho - soLuongBan;
            System.out.println("Ban hang thanh cong!");
        }else {
            System.out.println("So luong ban vuot qua so luong ton kho!");
        }
    }

    public void nhapKho(int soLuongNhap){
        if(soLuongNhap > 0){
            this.soLuongTonKho += soLuongNhap;
        }else {
            System.out.println("So luong nhap khong hop le!");
        }
    }
}
