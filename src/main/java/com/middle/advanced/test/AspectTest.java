package com.middle.advanced.test;

import com.middle.advanced.service.Advace2;
import com.middle.advanced.service.aspect.NaiveWaiterAspect;
import com.middle.advanced.service.aspect.NaiveWater;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author
 * aspect定义切面测试
 */
public class AspectTest {
    public static void main(String[] args) {

        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
        aspectJProxyFactory.setTarget(new NaiveWater());
        aspectJProxyFactory.addAspect(new NaiveWaiterAspect());
        Advace2 advace2 = aspectJProxyFactory.getProxy();
        advace2.greetedTo("fei.lu");
        advace2.serviceTo("jing.wang");
    }
}
