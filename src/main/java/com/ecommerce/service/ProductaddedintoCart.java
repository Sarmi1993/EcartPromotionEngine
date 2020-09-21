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

	public Object calculateFinalPrice() {
		
		return null;
	}

	

	
    
}
