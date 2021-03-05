package com.middle.advanced.common.model.singleton;

/**
 * @author happy
 * 静态内部类
 * 静态内部类方式是懒加载的
 * 线程安全
 */
public class HungrySingletonLe2 {

    private static class HungrySingletonLe2Holder {
        private static final HungrySingletonLe2 instance = new HungrySingletonLe2();
    }

    private HungrySingletonLe2() {
    }

    public static final HungrySingletonLe2 getInstance() {
        return HungrySingletonLe2Holder.instance;
    }
}
