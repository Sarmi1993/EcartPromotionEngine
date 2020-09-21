package com.ecommerce.promotion.impl;


import java.util.HashMap;
import com.ecommerce.bo.PromotionalpriceDetails;
import com.ecommerce.promotion.IPromotionalPrice;
import static com.ecommerce.bo.ProductIndividualPriceDetails.*;

public class PromotionalPriceOf2B implements IPromotionalPrice {
    /**
     * This method will calculate price of B
     **/
    @Override
    public long promotionalPrice(HashMap<String, Integer> checkoutProductList) {
    	  int quantityOfB = 0;
          
          if(checkoutProductList.get("B")!=null) {
          	quantityOfB=checkoutProductList.get("B");
          }
          int PromotionalCountOfB=quantityOfB/2;
          int WithoutPromotionalCountOfB=quantityOfB-PromotionalCountOfB*2;
          return PromotionalCountOfB * PromotionalpriceDetails.priceOf2B + WithoutPromotionalCountOfB * individualpriceList.get("B");
          
    }
}
