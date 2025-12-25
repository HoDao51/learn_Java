package buoi11.baitap.gocnhin;

public class ThongTinKhachHang {
    private String maKhachHang;
    private String email;

    //contructor
    public ThongTinKhachHang(String maKhachHang, String email){
        this.maKhachHang = maKhachHang;
        this.email = email;
    }

    // Getter cho khachHang
    public String getMaKhachHang() {
        return maKhachHang;
    }

    // Getter cho email
    public String getEmail() {
        return email;
    }

    //Setter cho maKhachHang


}
