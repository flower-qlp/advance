package com.middle.advanced.common.model.singleton;

/**
 * @author happy
 * 饿汉模式
 * 好处: 类加载已经创建好，调用时反应速度快,线程安全
 * 缺点:资源效率不高,有可能getInstance都没用到，但是类已经加载了
 * (不推荐)
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
