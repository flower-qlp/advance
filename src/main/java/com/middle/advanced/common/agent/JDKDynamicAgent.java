package com.middle.advanced.common.agent;

import org.springframework.context.annotation.Primary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author
 * jdk动态代理
 */
public class JDKDynamicAgent implements InvocationHandler {

    private Object agentObject;

    public Object newJDKDynamicAgent(Object agentObject) {
        this.agentObject = agentObject;
        return Proxy.newProxyInstance(agentObject.getClass().getClassLoader(), agentObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before((String) args[0]);
        Object ret = method.invoke(agentObject, args);
        after((String) ret);
        return ret;
    }

    public void before(String message) {
        System.out.println("--------before----------" + message + "  " + System.currentTimeMillis());
    }

    public void after(String message) {
        System.out.println("------------after---------" + message + "  " + System.currentTimeMillis());
    }
}
