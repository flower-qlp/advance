package com.middle.advanced.common.model.factory.simpleFactory;

public class Fork extends Car {

    @Override
    public void run() {
        System.out.println("Ford开始启动了。。。。");
    }

    @Override
    public void stop() {
        System.out.println("Ford停车了。。。。");
    }
}
