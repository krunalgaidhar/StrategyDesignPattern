package client;

import context.Promotion;
import calculator.BuyAGetFixedDiscountCalculator;

public class BuyAGetFixedDiscountPromotion extends Promotion {

    public BuyAGetFixedDiscountPromotion(){
        super();
        discount = new BuyAGetFixedDiscountCalculator();
    }

}