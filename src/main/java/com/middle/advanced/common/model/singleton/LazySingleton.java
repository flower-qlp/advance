package com.middle.advanced.common.model.singleton;

/**
 * 懒汉模式
 * 线程不安全
 * @author happy
 *
 * */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
