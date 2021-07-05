package calculator;

import entities.Product;

public class BuyAGetFixedDiscountCalculator implements ProductDiscount {

    public double getProductDiscountDetails(Product product) {
        return product.getBasePrice() - product.getDiscount();
    }
}
