package buoi13.lythuyet;

/**
 - là khuôn mẫu cho các lớp con kế thừa theo
 - không thể khởi tạo đối tượng từ lớp trừu tượng
 - sử dụng từ khóa abstract để khai báo một lớp trừu tượng
 trong lop truu tuong co the co cac thanh phan sau:
 + thuoc tinh
 + phuong thuc thuong (phuong thuc co the trien khai/ co than ham)
 + phuong thuc truu tuong (phuong thuc khong co trien khai/ khong co than ham). Phuong thuc nay
 duoc khai bao voi tu khoa abstract.
 - tat ca lop con ke thua lai lop truu tuong thi bat buoc phai Override lai phuong thuc truu tuong(tru
 truong hop lop con cung la lop truu tuong)
 **/

public abstract class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public int getAge() {
        
        return this.age;
    }
    //phuong thuc calculateSalary() la phuong thuc tru tuong => khong co than ham(khong trien khai)
    public abstract double calculateSalary();
}
