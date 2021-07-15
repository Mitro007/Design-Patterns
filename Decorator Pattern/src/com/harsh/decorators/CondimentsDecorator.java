package com.harsh.decorators;

import com.harsh.beverages.Beverage;

public abstract class CondimentsDecorator extends Beverage {

    private Beverage beverage;

    public CondimentsDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return this.beverage;
    }

    public abstract String getDescription();
}
