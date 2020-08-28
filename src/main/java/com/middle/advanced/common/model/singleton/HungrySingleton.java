package com.middle.advanced.common.model.singleton;

/**
 * @author happy
 * 饿汉模式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
