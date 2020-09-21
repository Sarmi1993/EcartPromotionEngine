package com.ecommerce.service;
import java.util.HashMap;

import com.ecommerce.bo.ProductCountDetails;

import static com.ecommerce.bo.ProductIndividualPriceDetails.*;

public class ProductaddedintoCart {
	
	 private ProductCountDetails cart;

	    public ProductaddedintoCart() {
	        cart = new ProductCountDetails();
	    }

	    public boolean addproduct(String skuId, int quantity) {
	        cart.getCheckoutProductList().put(skuId, quantity);
	        return true;
	    }

	    public ProductCountDetails getCartDetails() {
	        return this.cart;
	    }

	public int calculateFinalPrice() {
		int sum = 0;
        HashMap<String, Integer> checkoutProductList = cart.getCheckoutProductList();
        for (String skuId : checkoutProductList.keySet()) {
            int price = individualpriceList.get(skuId);
            int quantity = checkoutProductList.get(skuId);
            sum = sum + price * quantity;
        }
        return sum;
	}

	

	
    
}
