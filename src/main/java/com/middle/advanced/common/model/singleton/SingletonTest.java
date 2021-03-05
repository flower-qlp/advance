package com.middle.advanced.common.model.singleton;

public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        //单例模式
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    DoubleSingleton p = DoubleSingleton.getInstance();
                }
            }).start();
            Thread.sleep(50);
        }
        Thread.sleep(2000);
    }
}
