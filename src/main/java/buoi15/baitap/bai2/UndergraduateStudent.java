package buoi15.baitap.bai2;


public class UndergraduateStudent extends Student{
    private double GPA;
    private int researchPoints;

    public UndergraduateStudent(String studentId, String fullName,double GPA, int researchPoints){
        super(studentId, fullName);
        this.GPA = GPA;
        this.researchPoints = researchPoints;
    }

    @Override
    public double calculateFinalScore() {
        return GPA + researchPoints;
    }

    @Override
    public String getClassification() {
        double finalScore = calculateFinalScore();
        if(finalScore >= 3.6){
            return "Gioi";
        }else if(finalScore > 1.8){
            return "Kha";
        }else {
            return "Khong Dat";
        }
    }
}