package com.middle.advanced.service;

/**
 * @author itoutsource.cz10
 */
public class AdvanceImpl implements Advance {
    @Override
    public void greetedTo(String name) {
        System.out.println("hello" + name);
    }

    @Override
    public void serviceTo(String name) {
        System.out.println("service to" + name);
    }

    @Override
    public void runException() {
        throw new RuntimeException("测试异常");
    }
}
