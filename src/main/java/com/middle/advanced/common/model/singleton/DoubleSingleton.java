package com.middle.advanced.common.model.singleton;

/**
 * 双检锁式
 * *
 *
 * @author happy
 **/
public class DoubleSingleton {

    private DoubleSingleton() {
    }

    //volatile 防止重新排序
    private static volatile DoubleSingleton doubleSingleton = null;

    public static DoubleSingleton getInstance() {
        if (null == doubleSingleton) {
            synchronized (DoubleSingleton.class) {
                //如果在同步代码块内部不进行判空的话，
                //可能会初始化多个实例。
                //全部卡在synchronized 获取资源 获取到后从新判断
                if (null == doubleSingleton) {
                    //JVM 的即时编译器中存在指令重排序的优化，single变量如果不加volatile修饰，可能会出错
                    //测试使用 没有双判断 或存在多个对象
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    doubleSingleton = new DoubleSingleton();
                } else {
                    System.out.println("inner对象已经创建！");
                }
            }
        } else {
            System.out.println("对象已经创建！");
        }
        return doubleSingleton;
    }


}
