package buoi15.baitap;

public class ElectronicProduct extends Product{
    private int warrantyMonths;
    public ElectronicProduct(String code, double price, int warrantyMonths) {
        super(code, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateValue() {
        double priceFinal = getPrice();
        priceFinal = super.calculateValue() * 0.05;
        return getPrice() + priceFinal;
    }
}
