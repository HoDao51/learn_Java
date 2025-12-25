package buoi15.baitap;

public class FoodProduct extends Product{
    private int expiryDaysRemaining;
    public FoodProduct(String code, double price, int expiryDaysRemaining) {
        super(code, price);
        this.expiryDaysRemaining = expiryDaysRemaining;
    }

    @Override
    public double calculateValue() {
        double finalPrice = getPrice();
        if (expiryDaysRemaining < 30) {
            return finalPrice = super.calculateValue() * 0.9;
        }
        return finalPrice;
    }
}
