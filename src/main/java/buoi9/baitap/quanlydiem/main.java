package buoi9.baitap.quanlydiem;

public class main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        for(int i = 0; i < 3; i++){
            System.out.println("********* Enter student " + (i+1) + " information: ");
            students[i] = Student.input();
        }
        System.out.println("********* List of students with score >= 8: ");
        for(int i = 0; i < 3; i++){
            if(students[i].check()){
                students[i].display();
            }
        }
    }
}
