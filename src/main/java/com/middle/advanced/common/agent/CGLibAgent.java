package com.middle.advanced.common.agent;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author
 * CGLib动态代理
 */
public class CGLibAgent implements MethodInterceptor {

    private Object target;

    public CGLibAgent(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        //Enhancer 创建对象 cglib是通过该对象实现的
        Enhancer enhancer = new Enhancer();
        //设置对象class
        enhancer.setSuperclass(target.getClass());
        //设置回调Interceptor
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("------befor--------");
        /**
         * method 和 methodProxy 调用invoke ，效果一样,后者是子类调用,一般使用上者
         **/
        //若使用object对象  需要使用invokeSuper，否则会出现栈溢出错误
        Object invoke = method.invoke(target, objects);
        //Object invoke =methodProxy.invoke(target, objects);
        System.out.println("------end--------");
        return invoke;
    }
}
