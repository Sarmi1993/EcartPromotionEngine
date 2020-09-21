package com.ecommerce.promotion.impl;



import java.util.HashMap;

import com.ecommerce.bo.PromotionalpriceDetails;
import com.ecommerce.promotion.IPromotionalPrice;
import static com.ecommerce.bo.ProductIndividualPriceDetails.*;

public class PromotionalPriceOf3A implements IPromotionalPrice {
   
    /**
     * This method will calculate price of A
     **/
    @Override
    public long promotionalPrice(HashMap<String, Integer> checkoutProductList) {
    	 int quantityOfA = 0;
    	    
         if(checkoutProductList.get("A")!=null) {
         	quantityOfA=checkoutProductList.get("A");
         }
         int PromotionalCountOfA=quantityOfA/3;
         int WithoutPromotionalCountOfB=quantityOfA-PromotionalCountOfA*3;
         return PromotionalCountOfA * PromotionalpriceDetails.priceOf3A + WithoutPromotionalCountOfB * individualpriceList.get("A");
        
    }
}
