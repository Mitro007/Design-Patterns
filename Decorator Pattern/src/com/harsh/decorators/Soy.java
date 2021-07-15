package com.harsh.decorators;

import com.harsh.beverages.Beverage;
import com.harsh.constants.CondimentsPriceConstants;

public class Soy extends CondimentsDecorator{

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + CondimentsPriceConstants.SOY_PRICE;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Soy";
    }
}
