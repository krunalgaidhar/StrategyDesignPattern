import client.BuyAGetFixedDiscountPromotion;
import context.Promotion;
import entities.Product;
import org.testng.annotations.Test;

public class BuyAGetFixedProductDiscountTest {

    @Test
    public void buyAGetFixedDiscountPromotionVerification(){

        Product product = new Product();
        product.setBasePrice(1000);
        product.setDiscount(100);

        Promotion fixedDiscountPromotion = new BuyAGetFixedDiscountPromotion();

        System.out.print("[BuyAGetFixedDiscountPromotion] >> ");
        System.out.println(String.format("%.1f fixed discount on %.1f\n", product.getDiscount(), product.getBasePrice()));
        System.out.println("Final Price : " + fixedDiscountPromotion.applyPromotion(product));
    }

}