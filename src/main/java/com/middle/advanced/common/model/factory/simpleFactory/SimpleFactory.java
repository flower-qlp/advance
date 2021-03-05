package com.middle.advanced.common.model.factory.simpleFactory;

/**
 * 静态工厂
 * 简单的工厂模式
 * 违背了开闭原则
 **/
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
