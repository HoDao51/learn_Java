package buoi11.baitap.quanlynguoidung;

public class NguoiDung {
    private String ten;
    private int tuoi;

    //contructor
    public NguoiDung(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    // tạo Getter cho tên
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    // Setter cho tên
    public void setTen(String tenMoi) {
        if (tenMoi != null && tenMoi.length() > 0) {
            this.ten = tenMoi;
        } else {
            System.out.println("Tên không hợp lệ! Giữ nguyên tên cũ");
        }
    }

    // Setter cho tuổi
    public void setTuoi(int tuoiMoi) {
        if (tuoiMoi >= 0 && tuoiMoi <= 150) {
            this.tuoi = tuoiMoi;
        } else {
            System.out.println("Tuổi không hợp lệ! Giữ nguyên tuổi cũ");
        }
    }

    // Hiển thị thông tin người dùng
    public void hienThi() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
    }
}
