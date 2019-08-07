package com.middle.advanced.common.advance;

import com.middle.advanced.service.AdvanceImpl;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * 静态方法名称匹配增强
 * **/
public class StaticMethodMatcherPointCut extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return "greetedTo".equals(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return AdvanceImpl.class.isAssignableFrom(aClass);
            }
        };
    }
}
