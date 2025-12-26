package buoi18.baitap.bai2;

public class CongNhan extends CanBo{
    private int bac;
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CN: " + super.toString() + ", bac = " + bac;
    }
}
