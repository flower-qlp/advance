package com.middle.advanced.service.aspect;

import com.middle.advanced.service.Advace2;
import com.middle.advanced.utils.annotation.NeedTest;

/**
 * @aspect 切面
 **/
public class NaiveWater implements Advace2 {
    @Override
    @NeedTest
    public void greetedTo(String name) {
        System.out.println("naiveWaiter :greet to" + name);
    }

    @Override
    public void serviceTo(String name) {
        System.out.println("naiveWaiter :service to" + name);
    }

    @Override
    public void goodBye(String name) {
        System.out.println("naiveWaiter :goodBye to" + name);
    }
}
