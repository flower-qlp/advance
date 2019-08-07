package com.middle.advanced.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.lang.annotation.Annotation;

@Aspect
public class NaiveWaiterAspect implements Order {

    /***
     * Before方法前置增强 类似于beforeAdvance
     * execution aspect语法关键字
     * execution(public * *(..))
     * 第一个* 是任意返回 第二个*任意方法名 ..任意参数
     * 表示匹配某一模式的方法增强 任意入参任意返回
     * */
    @Before("execution(* greetedTo(..))")
    public void beforeGreeting(JoinPoint point) {
        System.out.println("how are you!");
    }

    /**
     * 在包下 且 存在一个String 入参的方法增强
     **/
    @Before("within(com.middle.advanced.service..*) && args(String))")
    public void beforeGreetingWithIn() {
        System.out.println("how are you!");
    }

    /**
     * 后置增强
     **/
    @AfterReturning("within(com.middle.advanced.service..*) && args(String))")
    public void afterReturnGreetingWithIn() {
        System.out.println("see you lala!");
    }

    /**
     * 后置增强
     * 增强带有needTest注解的方法
     **/
    @After("@annotation(com.middle.advanced.utils.annotation.NeedTest)")
    public void AfterGreetingWithIn() {
        System.out.println("after with you!");
    }

    /**
     * 复用切点页面定义的切点
     **/
    @AfterReturning("TestNamePointCut.inPkGreetTo()")
    public void pointCut() {
        System.out.println("section from pointCut!");
    }

    @Override
    public int value() {
        return 1;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    /**
     * 环绕增强 --会替换前置 和后置增强
     **/
//    @Around("within(com.middle.advanced.service..*) && args(String))")
//    public void aroundGreetingWithIn(ProceedingJoinPoint proceedingJoinPoint) {
//        System.out.println("around with you!");
//    }
}
