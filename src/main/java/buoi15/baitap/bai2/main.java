package buoi15.baitap.bai2;


public class main {
    public static void main(String[] args) {
        Student arrNV[] = new Student[2];
        arrNV[0] = new UndergraduateStudent("SV001","Nguyen Sy Khanh Anh", 2, 1);
        arrNV[1] = new GraduateStudent("SV002","Nghiem Truong Duong", 3, 6);

        for (Student student : arrNV) {
            student.displaySummary();
            System.out.println("\nTong diem: " + student.calculateFinalScore() + "\nXep loai: " + student.getClassification());
        }
    }
}
