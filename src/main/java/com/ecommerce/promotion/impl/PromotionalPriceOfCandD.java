package com.ecommerce.promotion.impl;


import java.util.HashMap;
import com.ecommerce.bo.PromotionalpriceDetails;
import com.ecommerce.promotion.IPromotionalPrice;
import static com.ecommerce.bo.ProductIndividualPriceDetails.*;



public class PromotionalPriceOfCandD implements IPromotionalPrice {
    /**
     * This method will calculate price of C & D
     **/
    @Override
    public long promotionalPrice(HashMap<String, Integer> checkoutProductList) {
    	  int quantityOfC = 0;
          int quantityOfD = 0;
        
         
          if(checkoutProductList.get("C")!=null) {
          	quantityOfC=checkoutProductList.get("C");
          }
          if(checkoutProductList.get("D")!=null) {
          	quantityOfD=checkoutProductList.get("D");
          }
          
          if (quantityOfC > quantityOfD) {
          	
              return quantityOfD * PromotionalpriceDetails.priceOfCandD + (quantityOfC - quantityOfD) * individualpriceList.get("C");
          } else {
             return quantityOfC * PromotionalpriceDetails.priceOfCandD + (quantityOfD - quantityOfC) * individualpriceList.get("D");
          }
      }
}
