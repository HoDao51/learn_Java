package buoi7.baitap.Tinhkhoangcanh;

public class Diem2D {
    public double x;
    public double y;

    //constructor khong co gia tri
    public Diem2D() {
        this.x = 0;
        this.y = 0;
    }
    //constructor co gia tri
    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inToaDo(){
        System.out.println("Toa do diem: (" + x + "," + y + ")");
    }

    public double tinhKhoangCach(Diem2D diemKhac){
        return Math.sqrt(Math.pow((diemKhac.x - this.x), 2) + Math.pow((diemKhac.y - this.y), 2));
    }

    public static void main(String[] args) {
        Diem2D diemA = new Diem2D(3.0, 4.0);
        Diem2D diemB = new Diem2D();
        diemA.inToaDo();
        diemB.inToaDo();
        System.out.println("Khoang cach giua A va B: " + diemA.tinhKhoangCach(diemB) );
    }
}
