package com.middle.advanced.common.advance;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterGreetedAdvance implements AfterReturningAdvice {
    @Override
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("Come again next time! "+objects[0]+System.currentTimeMillis());
    }
}
