package com.harsh.beverages;

import com.harsh.constants.BeveragePriceConstants;

public class Decaf extends Beverage{

    public Decaf() {
        this.setDescription("Decaf");
    }

    @Override
    public double cost() {
        return BeveragePriceConstants.DECAF_COST;
    }
}
