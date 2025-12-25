package buoi15.baitap.bai2;


public class GraduateStudent extends Student{
    private double courseworkScore;
    private double thesisScore;

    public GraduateStudent(String studentId, String fullName, double courseworkScore, double thesisScore){
        super(studentId, fullName);
        this.courseworkScore = courseworkScore;
        this.thesisScore = thesisScore;
    }
    @Override
    public double calculateFinalScore() {
        return (courseworkScore*0.6) + (thesisScore*0.4);
    }

    @Override
    public String getClassification() {
        double finalScore = calculateFinalScore();
        if(finalScore >= 9){
            return "Xuat xac";
        }else if(finalScore > 8){
            return "Gioi";
        }else if(finalScore > 7){
            return "Kha";
        }else if(finalScore > 6){
            return "Trung binh kha";
        }else if(finalScore > 5.5){
            return "Trung binh";
        }else {
            return "Khong Dat";
        }
    }
}
