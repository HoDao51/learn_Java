package buoi15.baitap.bai2;

public abstract class Student {
    private String studentId;
    private String fullName;

    public Student(String studentId, String fullName){
        this.studentId = studentId;
        this.fullName = fullName;
    }
    public String studentId() {
        return studentId;
    }
    public String fullName(){
        return fullName;
    }
    public abstract double calculateFinalScore();
    public abstract String getClassification();

    public void displaySummary(){
        System.out.print("\nMa sinh vien: " + studentId);
        System.out.print("\nTen sinh vien: " + fullName);
    }
}
