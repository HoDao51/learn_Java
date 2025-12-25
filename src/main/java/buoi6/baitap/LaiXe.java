package buoi6.baitap;

public class LaiXe {
    public String tenLaiXe;

    //constructor
    public LaiXe(String tenLaiXe) {
        this.tenLaiXe = tenLaiXe;
    }

    public String lai(XeHoi xe){
        System.out.println(tenLaiXe + " dang lai xe " + xe.tenXe);
        xe.tangToc(2000);
        xe.inTocDo();
        return "";
    }
}
