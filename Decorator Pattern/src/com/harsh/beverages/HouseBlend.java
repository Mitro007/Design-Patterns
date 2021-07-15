package com.harsh.beverages;

import com.harsh.constants.BeveragePriceConstants;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return BeveragePriceConstants.HOUSE_BLEND_COST;
    }
}
