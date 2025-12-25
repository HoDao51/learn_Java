package buoi13.lythuyet;

public class Developer extends Person {
    public int numOfProjects;
    public double awards = 500000.0;
    public double basicSalary = 15000000.0;
    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}