package buoi5.lythuyet;

public class oop {
    String ten;
    String maulong;

    public void an(){
        System.out.println(ten + "dang an");
    }
    public void trongnha(){
        System.out.println(ten + "dang trong nha");
    }

    public static void main(String[] args) {
        oop d = new oop();
        oop d1 = new oop();
        d.ten = "khanh anh ";
        d.maulong = "den";
        d.an();
        d.trongnha();
        d1.ten = "truong duong ";
        d1.maulong = "den";
        d1.an();
        d1.trongnha();
    }
}
