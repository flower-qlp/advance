package com.middle.advanced.common.model.singleton;


/**
 * 懒汉模式
 * 线程安全
 * synchronized 修饰创建对象方法
 * @author happy
 */
public class LazySingletonSafe {

    private static LazySingletonSafe singletonSafe;

    private LazySingletonSafe() {
    }

    public static synchronized LazySingletonSafe instanceSafe() {

        if (null == singletonSafe) {
            singletonSafe = new LazySingletonSafe();
        }
        return singletonSafe;
    }

}
