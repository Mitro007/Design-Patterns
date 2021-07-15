package com.harsh.beverages;

import com.harsh.constants.BeveragePriceConstants;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return BeveragePriceConstants.DARK_ROAST_COST;
    }
}
