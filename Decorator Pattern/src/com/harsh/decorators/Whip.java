package com.harsh.decorators;

import com.harsh.beverages.Beverage;
import com.harsh.constants.CondimentsPriceConstants;

public class Whip extends CondimentsDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + CondimentsPriceConstants.WHIP_PRICE;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Whip";

    }
}
