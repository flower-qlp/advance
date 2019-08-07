package com.middle.advanced.common.advance;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * 环绕增强
 **/
public class InterceptorAdvance implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object[] args = methodInvocation.getArguments();
        System.out.println("welcome " + args[0]);
        Object object = methodInvocation.proceed();
        System.out.println("Goodbye " + args[0]);
        return object;
    }
}
