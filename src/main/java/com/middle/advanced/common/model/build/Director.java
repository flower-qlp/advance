package com.middle.advanced.common.model.build;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director() {
    }

    public Product construct(Object a,
                             Object b,
                             Object c) {
        builder.buildPartA(a);
        builder.buildPartB(b);
        builder.buildPartC(c);
        return builder.init();
    }

}
