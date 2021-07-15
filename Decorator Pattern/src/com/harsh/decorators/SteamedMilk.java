package com.harsh.decorators;

import com.harsh.beverages.Beverage;
import com.harsh.constants.CondimentsPriceConstants;

public class SteamedMilk extends CondimentsDecorator{

    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + CondimentsPriceConstants.STEAMED_MILK_PRICE;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Steamed Milk";
    }
}
