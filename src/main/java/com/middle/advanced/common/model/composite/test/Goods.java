package com.middle.advanced.common.model.composite.test;

import lombok.Data;

@Data
public class Goods implements Composite {

    //产品名称
    private String name;
    //单价
    private float price;
    //数量
    private Integer quantity;

    public Goods(String name, float price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Goods() {
    }

    @Override
    public float calculation() {
        return price * quantity;
    }

    @Override
    public void show() {
        System.out.println("产品：" + name + " 价格：" + this.calculation());
    }
}
