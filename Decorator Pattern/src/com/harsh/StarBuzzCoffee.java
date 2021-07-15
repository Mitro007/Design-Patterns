package com.harsh;

import com.harsh.beverages.Beverage;
import com.harsh.beverages.DarkRoast;
import com.harsh.beverages.Espresso;
import com.harsh.beverages.HouseBlend;
import com.harsh.decorators.Mocha;
import com.harsh.decorators.Soy;
import com.harsh.decorators.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + ", $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());
    }
}
