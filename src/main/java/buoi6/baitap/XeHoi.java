package buoi6.baitap;

public class XeHoi {
    public String tenXe;
    public int tocDo;

    //constructor
    public XeHoi (String tenXe) {
        this.tenXe = tenXe;
        this.tocDo = 0;
    }

    public void tangToc(int luongTang){
        this.tocDo = tocDo + luongTang;
    }

    public void giamToc(int luongGiam){
        this.tocDo = tocDo - luongGiam;
    }

    public void inTocDo(){
        System.out.println("Toc do: " + tocDo + " km/h");
    }
}
