package com.middle.advanced.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author happy
 */
@Aspect
@Component
public class VerificationByTokenPoint {

    @Pointcut("@annotation(com.middle.advanced.utils.annotation.VerificationByToken)")
    public void verification(){}

    @Before("verification()")
    public void beforeVerification(JoinPoint joinPoint){
        System.out.println("基于注解的log");
    }
}
