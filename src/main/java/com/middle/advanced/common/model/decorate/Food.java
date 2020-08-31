package com.middle.advanced.common.model.decorate;


/**
 * 基类
 **/
public class Food {

    private String foodName;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    }
}
