package buoi13.baitap.bai1;

public class main {
    public static void main(String[] args) {
        NhanVien arrNV[] = new NhanVien[2];
        arrNV[0] = new NhanVienFullTime("Nguyen Sy Khanh Anh", 3600);
        arrNV[1] = new NhanVienPartTime("Nghiem Truong Duong", 1800, 36);

        for (NhanVien nhanVien : arrNV){
            System.out.println("Nhan vien: " + nhanVien.getHoTen() + " luong: " + nhanVien.tinhLuong());
        }
    }
}
