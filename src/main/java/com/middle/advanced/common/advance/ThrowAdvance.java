package com.middle.advanced.common.advance;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ThrowAdvance implements ThrowsAdvice {

    public void afterThrowing(Method method,Object[] args,Object target,Exception ex) throws Throwable{
         System.out.println("----------------");
         System.out.println("-------抛出异常---------"+ex.getMessage());
    }
}
