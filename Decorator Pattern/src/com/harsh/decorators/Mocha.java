package com.harsh.decorators;

import com.harsh.beverages.Beverage;
import com.harsh.constants.CondimentsPriceConstants;

public class Mocha extends CondimentsDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + CondimentsPriceConstants.MOCHA_PRICE;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Mocha";
    }
}
