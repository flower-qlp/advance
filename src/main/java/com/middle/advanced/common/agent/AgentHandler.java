package com.middle.advanced.common.agent;

import com.middle.advanced.service.ProductService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author
 * 动态代理
 */
public class AgentHandler implements InvocationHandler {

    private ProductService productService;

    public AgentHandler(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("methodName------>" + method.getName());
        return method.invoke(productService, args);
    }


}
