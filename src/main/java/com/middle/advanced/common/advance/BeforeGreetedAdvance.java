package com.middle.advanced.common.advance;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @author
 * 前置增强接口
 * MethodBeforeAdvance
 */
public class BeforeGreetedAdvance implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        String clientName=(String)objects[0];
        System.out.println("hello "+clientName+"! this is advance");
    }
}
