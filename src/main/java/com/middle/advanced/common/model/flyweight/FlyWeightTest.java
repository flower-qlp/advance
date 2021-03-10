package com.middle.advanced.common.model.flyweight;

import com.middle.advanced.common.model.flyweight.test.FlyweightFactory;

public class FlyWeightTest {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        factory.getService("key1");
        factory.getService("key1");
        factory.getService("key2");
        factory.getService("key3");
    }
}
