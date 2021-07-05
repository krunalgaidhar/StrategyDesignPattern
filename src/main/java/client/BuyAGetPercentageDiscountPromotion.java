package client;

import context.Promotion;
import calculator.BuyAGetPercentageDiscountCalculator;

public class BuyAGetPercentageDiscountPromotion extends Promotion {

    public BuyAGetPercentageDiscountPromotion(){
        super();
        discount = new BuyAGetPercentageDiscountCalculator();
    }
}