package com.middle.advanced.common.model.mediator.test;

/**
 * 中介者模式-中介
 **/
public interface Middum {
    void register(Customer customer);

    void relay(String from, String ad);//转发
}
