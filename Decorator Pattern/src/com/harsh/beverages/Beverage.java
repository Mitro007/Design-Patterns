package com.harsh.beverages;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
