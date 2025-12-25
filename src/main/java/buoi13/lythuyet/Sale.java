package buoi13.lythuyet;

public class Sale extends Person{
    public double[] numOfProjects = {1000000, 3000000, 5000000};
    public double commission = 0.1;
    public double basicSalary = 12000000.0;
    public Sale(String name, int age) {
        super(name, age);
    }
    @Override
    public double calculateSalary() {
        double totalCommission = 0.0;
        for (double item : numOfProjects) {
            totalCommission += item * commission;
        }
        return basicSalary + totalCommission;
    }
}
