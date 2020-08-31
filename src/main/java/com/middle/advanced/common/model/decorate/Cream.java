package com.middle.advanced.common.model.decorate;

public class Cream extends Food {

    private Food creamFood;

    public Cream(Food creamFood) {
        this.creamFood = creamFood;
    }

    @Override
    public String make() {
        return creamFood.make() + " 奶油";
    }
}
