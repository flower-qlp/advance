package com.middle.advanced.common.model.decorate;

public class Bread extends Food {

    private Food breadFood;

    public Bread(Food breadFood){
        this.breadFood=breadFood;
    }

    @Override
    public String make(){
        return breadFood.make()+" 面包";
    }
}
