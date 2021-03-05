package com.middle.advanced.common.model.build;

public class BuildProduct extends Builder {
    @Override
    public void buildPartA(Object a) {
        product.setPartA(a);
    }

    @Override
    public void buildPartB(Object b) {
        product.setPartB(b);
    }

    @Override
    public void buildPartC(Object c) {
        product.setPartC(c);
    }
}
