package com.middle.advanced.common.model.factory.simpleFactory;

public class SimpleFactory {
    public static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        }
        if ("Fork".equals(type)) {
            c = new Fork();
        }
        return c;
    }
}
