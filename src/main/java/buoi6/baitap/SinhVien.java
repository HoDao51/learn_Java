package buoi6.baitap;

public class SinhVien {
    public String maSV;
    public String tenSV;
    public double diemTB;

    //constructor
    public SinhVien(String maSV, String tenSV, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTB = diemTB;
    }

    public String xepLoai(){
        if(diemTB >= 8) {
            return "Gioi";
        }else if(diemTB >= 6.5) {
            return "Kha";
        }else if(diemTB >= 5){
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public String hienThiThongTin(){
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ten SV: " + tenSV);
        System.out.println("Diem TB: " + diemTB);
        System.out.println("Xep loai: " + xepLoai());
        System.out.println("-----------------------");
        return "";
    }

    public static void main(String[] args) {
        SinhVien[] arr = new SinhVien[3];
        arr[0] = new SinhVien("1", "tôi là hiếu tôi bị ngu", 6.5);
        arr[1] = new SinhVien("2", "Nguyen Van B", 5);
        arr[2] = new SinhVien("3", "Nguyen Van C", 8);

        for(int i = 0; i < 3; i++) {
            arr[i].hienThiThongTin();
        }
    }
}
