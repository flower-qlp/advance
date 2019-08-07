package com.middle.advanced.service.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义切点
 * 供切面使用
 **/
public class TestNamePointCut {

    @Pointcut("within(com.middle.advanced.service..*)")
    private void inGreetTo() {
    }

    @Pointcut("execution(* greetedTo(..))")
    protected void greetTo() {
    }

    @Pointcut("inGreetTo() && greetTo()")
    public void inPkGreetTo() {
    }
}
