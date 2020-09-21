package com.ecommerce.bo;

import java.util.HashMap;

public class ProductCountDetails {

	private HashMap<String, Integer> checkoutProductList = new HashMap<>();
	   
    public HashMap<String, Integer> getCheckoutProductList() {
        return checkoutProductList;
    }

    public void setCheckoutProductList(HashMap<String, Integer> checkoutProductList) {
        this.checkoutProductList = checkoutProductList;
    }
   
    
  

}
