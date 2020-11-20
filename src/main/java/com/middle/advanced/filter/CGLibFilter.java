package com.middle.advanced.filter;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author
 */
public class CGLibFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        System.out.println("-------methodName--------" + method.getName());
        return 0;
    }
}
