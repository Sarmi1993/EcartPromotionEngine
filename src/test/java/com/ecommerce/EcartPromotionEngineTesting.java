package com.ecommerce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecommerce.service.ProductaddedintoCart;
import static com.ecommerce.bo.ProductIndividualPriceDetails.*;

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

}
