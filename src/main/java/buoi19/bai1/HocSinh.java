package buoi19.bai1;

public class HocSinh {
    private String maHS;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private double diemTrungBinh;

    public HocSinh(String maHS, String hoTen, int tuoi, String queQuan, double diemTrungBinh) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String thongTinHocSinh() {
        String str = "Ma hoc sinh: " + maHS;
        str += "| Ten hoc sinh: " + hoTen;
        str += "| Tuoi: " + tuoi;
        str += "| Que quan: " + queQuan;
        str += "| Diem trung binh: " + diemTrungBinh;
        return str;
    }
}
