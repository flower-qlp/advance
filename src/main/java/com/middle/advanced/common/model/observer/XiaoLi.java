package com.middle.advanced.common.model.observer;

/**
 * @author happy
 */
public class XiaoLi implements Person {

    private String name = "小李";

    @Override
    public void getMessage(String s) {
        System.out.println(name + " 接受到消息 " + s);
    }
}
