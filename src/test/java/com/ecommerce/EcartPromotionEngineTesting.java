package com.ecommerce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecommerce.promotion.impl.PromotionalPriceOf2B;
import com.ecommerce.promotion.impl.PromotionalPriceOf3A;
import com.ecommerce.promotion.impl.PromotionalPriceOfCandD;
import com.ecommerce.service.ProductaddedintoCart;
import static com.ecommerce.bo.ProductIndividualPriceDetails.*;

import java.util.HashMap;

public class EcartPromotionEngineTesting {
	 long price;
	
    @Before
    public void setUp() {
        individualpriceList.put("A", 50);
        individualpriceList.put("B", 30);
        individualpriceList.put("C", 20);
        individualpriceList.put("D", 15);
    }

   @Test
    public void checkoutWithoutPrmotion() {
        ProductaddedintoCart productaddedintoCart = new ProductaddedintoCart();
        productaddedintoCart.addproduct("A", 1);
        productaddedintoCart.addproduct("B", 1);
        productaddedintoCart.addproduct("C", 1);
        productaddedintoCart.addproduct("D", 1);
        Assert.assertEquals(115, productaddedintoCart.calculateFinalPrice());
    }
   
   @Test
   public void checkForActivePromotions() {
       ProductaddedintoCart productaddedintoCart = new ProductaddedintoCart();
       productaddedintoCart.addproduct("A", 3);
       productaddedintoCart.addproduct("B", 2);
       productaddedintoCart.addproduct("C", 1);
       
       HashMap<String, Integer> checkoutProductList = productaddedintoCart.getCartDetails().getCheckoutProductList();
       
       price = productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOf3A(), checkoutProductList)
       			+ productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOf2B(), checkoutProductList)
       			+ productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOfCandD(), checkoutProductList);
       Assert.assertEquals(195, price);
   }

   @Test
   public void ScenarioATest() {
       ProductaddedintoCart productaddedintoCart = new ProductaddedintoCart();
       productaddedintoCart.addproduct("A", 1);
       productaddedintoCart.addproduct("B", 1);
       productaddedintoCart.addproduct("C", 1);
       
       HashMap<String, Integer> checkoutProductList = productaddedintoCart.getCartDetails().getCheckoutProductList();
       
       price = productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOf3A(), checkoutProductList)
       			+ productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOf2B(), checkoutProductList)
       			+ productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOfCandD(), checkoutProductList);
       Assert.assertEquals(100, price);
   }
   
   @Test
   public void ScenarioFor2B() {
       ProductaddedintoCart productaddedintoCart = new ProductaddedintoCart();
       
       productaddedintoCart.addproduct("B", 2);
       
       
       HashMap<String, Integer> checkoutProductList = productaddedintoCart.getCartDetails().getCheckoutProductList();
       
       price = productaddedintoCart.calculatePriceWithPromotion(new PromotionalPriceOf2B(), checkoutProductList);
       			
       Assert.assertEquals(45, price);
   }
}
