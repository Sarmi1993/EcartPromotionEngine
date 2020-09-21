package com.ecommerce.bo;

import java.util.HashMap;
import java.util.Map;

public class ProductIndividualPriceDetails {

	 public static Map<String, Integer> individualpriceList = new HashMap<String, Integer>();

	public static Map<String, Integer> getProductList() {
		return individualpriceList;
	}

	public static void setProductList(Map<String, Integer> productList) {
		ProductIndividualPriceDetails.individualpriceList = productList;
	}
	    
}
