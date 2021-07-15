package com.harsh.beverages;

import com.harsh.constants.BeveragePriceConstants;

public class Espresso extends Beverage{

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return BeveragePriceConstants.ESPRESSO_COST;
    }
}
