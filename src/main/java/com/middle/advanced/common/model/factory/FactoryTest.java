package com.middle.advanced.common.model.factory;

import com.middle.advanced.common.model.factory.simpleFactory.Car;
import com.middle.advanced.common.model.factory.simpleFactory.SimpleFactory;

public class FactoryTest {
    public static void main(String[] args) {
        //简单工厂类
        Car c = SimpleFactory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车。。。");
        }
    }
}
