package com.middle.advanced.common.model.build;

abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA(Object a);

    public abstract void buildPartB(Object b);

    public abstract void buildPartC(Object c);

    public Product init() {
        return this.product;
    }

}
