package com.ecommerce.promotion;

import java.util.HashMap;

public interface IPromotionalPrice {
    public long promotionalPrice(HashMap<String,Integer> checkoutProductList);
}
