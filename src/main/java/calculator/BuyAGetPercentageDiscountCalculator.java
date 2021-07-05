package calculator;

import entities.Product;

public class BuyAGetPercentageDiscountCalculator implements ProductDiscount {

    public double getProductDiscountDetails(Product product) {
        return product.getBasePrice() - (product.getBasePrice() * (product.getDiscount() / 100));
    }

}
