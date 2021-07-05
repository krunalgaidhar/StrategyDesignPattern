import client.BuyAGetPercentageDiscountPromotion;
import context.Promotion;
import entities.Product;
import org.testng.annotations.Test;

public class BuyAGetPercentProductDiscountTest {

    @Test
    public void buyAGetPercentageDiscountPromotionVerification(){

        Product product = new Product();
        product.setBasePrice(500);
        product.setDiscount(5);

        Promotion percentDiscountPromotion = new BuyAGetPercentageDiscountPromotion();

        System.out.print("[BuyAGetPercentageDiscountPromotion] >> ");
        System.out.println(String.format("%.1f percent discount on %.1f\n", product.getDiscount(), product.getBasePrice()));
        System.out.println("Final Price : " + percentDiscountPromotion.applyPromotion(product));
    }

}