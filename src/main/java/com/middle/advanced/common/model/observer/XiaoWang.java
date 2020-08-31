package com.middle.advanced.common.model.observer;

/**
 * @author happy
 */
public class XiaoWang implements Person {

    private String name = "小王";

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接受到消息 " + s);
    }
}
