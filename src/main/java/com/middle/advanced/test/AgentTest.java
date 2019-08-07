package com.middle.advanced.test;

import com.middle.advanced.common.CGLibAgent;
import com.middle.advanced.common.JDKDynamicAgent;
import com.middle.advanced.filter.CGLibFilter;
import com.middle.advanced.service.ProductService;
import com.middle.advanced.service.ProductServiceImpl;
import com.middle.advanced.utils.CGLibMethod;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author itoutsource.cz10
 */
public class AgentTest {

    public static void main(String[] args) {

        JDKInner();
    }

    public static void JDK() {
        ProductService productService = (ProductService) new JDKDynamicAgent().newJDKDynamicAgent(new ProductServiceImpl());
        productService.getProductDetail("jin.wang");
    }

    public static void JDKInner() {
        ProductService productService=new ProductServiceImpl();
        ProductService method = (ProductService) Proxy.newProxyInstance(productService.getClass().getClassLoader(),
                productService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("--------before----------" + args[0] + "  " + System.currentTimeMillis());
                Object ret = method.invoke(productService, args);
                System.out.println("------------after---------" + args[0] + "  " + System.currentTimeMillis());
                return ret;
            }
        });
        method.getProductDetail("fei.lu");
    }

    public static void CGLib() {
        CGLibMethod method = (CGLibMethod) new CGLibAgent(new CGLibMethod()).getInstance();
        method.show();
        method.work();

    }

    public static Object getProxyInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("-----------------before------");
                //若使用object对象  需要使用invokeSuper，否则会出现栈溢出错误
                Object obj = methodProxy.invokeSuper(object, args);
                System.out.println("------------after-------------");
                return obj;
            }
        });
        enhancer.setCallbackFilter(new CGLibFilter());
        return enhancer.create();
    }
}
