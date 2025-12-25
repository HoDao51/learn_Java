package buoi15.baitap;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        double sum = 0.0;
        List<Product> products = new ArrayList<>();
        Product prd1 = new ElectronicProduct("RoiDien", 200000, 18);
        Product prd2 = new FoodProduct("DienAp", 10000, 36);

        products.add(prd1);
        products.add(prd2);

        for (Product product : products) {
            System.out.println("San pham: " + product.getCode() + " gia: " + product.calculateValue());
            sum += product.calculateValue();
        }
        System.out.println("Tong gia tri trong kho: " + sum);
    }
}
