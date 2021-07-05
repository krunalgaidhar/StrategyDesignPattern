package context;

import calculator.ProductDiscount;
import entities.Product;

public class Promotion {

    public ProductDiscount discount;

    public double applyPromotion(Product product){

        return discount.getProductDiscountDetails(product);

    }
}